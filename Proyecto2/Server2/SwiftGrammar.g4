grammar SwiftGrammar; 
// import SwiftLexer; 

options {
  tokenVocab = SwiftLexer;
}

@header {
    import "Server2/interfaces"
    import "Server2/environment"
    import "Server2/expressions"
    import "Server2/instructions"
    import "strings"
}


s returns [[]interface{} code]
: block EOF
    {   
        $code = $block.blk
    }
;

block returns [[]interface{} blk]
@init{
    $blk = []interface{}{}
    var listInt []IInstructionContext
  }
: ins+=instruction+
    {
        listInt = localctx.(*BlockContext).GetIns()
        for _, e := range listInt {
            $blk = append($blk, e.GetInst())
        }
    }
;

instruction returns [interfaces.Instruction inst]
: printstmt { $inst = $printstmt.prnt}
| ifstmt { $inst = $ifstmt.ifinst }
| declarationstmt { $inst = $declarationstmt.dec }
| assignment { $inst = $assignment.ass }
| function { $inst = $function.fun }
| structCreation { $inst = $structCreation.dec }
;

structCreation returns[interfaces.Instruction dec]
: STRUCT ID LLAVEIZQ listStructDec LLAVEDER { $dec = instructions.NewStruct($STRUCT.line, $STRUCT.pos, $ID.text, $listStructDec.l) }
;

listStructDec returns[[]interface{} l]
: list=listStructDec COMA VAR ID D_PTS types {
                                                var arr []interface{}
                                                newParams := environment.NewStructType($ID.text, $types.ty)
                                                arr = append($list.l, newParams)
                                                $l = arr
                                            }
| VAR ID D_PTS types {
                        var arr []interface{}
                        newParams := environment.NewStructType($ID.text, $types.ty)
                        arr = append(arr, newParams)
                        $l = arr
                    }
|  { $l = []interface{}{} }
;

function returns [ interfaces.Instruction fun ]
: FUNC ID PARIZQ listParamsFunc PARDER LLAVEIZQ block LLAVEDER
{
    $fun = instructions.NewFunction($FUNC.line, $FUNC.pos, $ID.text, $listParamsFunc.lpf, environment.NULL, $block.blk)
}
| FUNC ID PARIZQ listParamsFunc PARDER ARROW1 types LLAVEIZQ block LLAVEDER
{
    $fun = instructions.NewFunction($FUNC.line, $FUNC.pos, $ID.text, $listParamsFunc.lpf, $types.ty, $block.blk)
}
;

listParamsFunc returns[[]interface{} lpf]
: list=listParamsFunc COMA ID D_PTS types {
    var arr []interface{}
    newParam := instructions.NewParamsDeclaration($ID.line, $ID.pos, $ID.text, $types.ty)
    arr = append($list.lpf, newParam)
    $lpf = arr
    }
| ID D_PTS types {
    $lpf = []interface{}{}
    newParam := instructions.NewParamsDeclaration($ID.line, $ID.pos, $ID.text, $types.ty)
    $lpf = append($lpf, newParam)
    }
|  { $lpf = []interface{}{} }
;

assignment returns [interfaces.Instruction ass]
: ID IG expr { $ass = instructions.NewAssignment($ID.line, $ID.pos, $ID.text, $expr.e)}
;

printstmt returns [interfaces.Instruction prnt]
: PRINT PARIZQ expr PARDER { $prnt = instructions.NewPrint($PRINT.line,$PRINT.pos,$expr.e)}
;

ifstmt returns [interfaces.Instruction ifinst]
: IF expr LLAVEIZQ block LLAVEDER { $ifinst = instructions.NewIf($IF.line, $IF.pos, $expr.e, $block.blk) }
;

declarationstmt returns [interfaces.Instruction dec]
: VAR ID D_PTS types IG expr  { $dec = instructions.NewDeclaration($VAR.line, $VAR.pos, $ID.text, $types.ty, $expr.e) }
| VAR ID IG expr  { $dec = instructions.NewDeclaration($VAR.line, $VAR.pos, $ID.text, environment.STRUCT , $expr.e) }
;

types returns[environment.TipoExpresion ty]
: INT { $ty = environment.INTEGER }
| FLOAT { $ty = environment.FLOAT }
| STR { $ty = environment.STRING }
| BOOL { $ty = environment.BOOLEAN }
| CORIZQ CORDER { $ty = environment.ARRAY }
;

expr returns [interfaces.Expression e]
: left=expr op=(MUL|DIV) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(ADD|SUB) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(MAY_IG|MAYOR) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(MEN_IG|MENOR) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(IG_IG|DIF) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=AND right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=OR right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| callFunction { $e = $callFunction.cf }
| ID LLAVEIZQ listStructExp LLAVEDER { $e = expressions.NewStructExp($ID.line, $ID.pos, $ID.text, $listStructExp.l ) }
| PARIZQ expr PARDER { $e = $expr.e }
| list=listArray { $e = $list.p}
| CORIZQ listParams CORDER { $e = expressions.NewArray($CORIZQ.line, $CORIZQ.pos, $listParams.l) }
| NUMBER                             
    {
        if (strings.Contains($NUMBER.text,".")){
            num,err := strconv.ParseFloat($NUMBER.text, 64);
            if err!= nil{
                fmt.Println(err)
            }
            $e = expressions.NewPrimitive($NUMBER.line,$NUMBER.pos,num,environment.FLOAT)
        }else{
            num,err := strconv.Atoi($NUMBER.text)
            if err!= nil{
                fmt.Println(err)
            }
            $e = expressions.NewPrimitive($NUMBER.line,$NUMBER.pos,num,environment.INTEGER)
        }
    }
| STRING
    {
        str := $STRING.text
        $e = expressions.NewPrimitive($STRING.line, $STRING.pos, str[1:len(str)-1],environment.STRING)
    }                        
| TRU { $e = expressions.NewPrimitive($TRU.line, $TRU.pos, true, environment.BOOLEAN) }
| FAL { $e = expressions.NewPrimitive($FAL.line, $FAL.pos, false, environment.BOOLEAN) }
;

listParams returns[[]interface{} l]
: list=listParams COMA expr {
                                var arr []interface{}
                                arr = append($list.l, $expr.e)
                                $l = arr
                            }   
| expr {
            $l = []interface{}{}
            $l = append($l, $expr.e)
        }
;

listArray returns[interfaces.Expression p]
: list = listArray arr = listAccessArray { $p = expressions.NewArrayAccess($ID.line, $ID.pos, $list.p, $arr.l) }
| list = listArray PUNTO ID { $p = expressions.NewStructAccess($list.start.GetLine(), $list.start.GetColumn(), $list.p, $ID.text)  }
| ID { $p = expressions.NewCallVar($ID.line, $ID.pos, $ID.text)}
;

listAccessArray returns[[]interface{} l]
: list = listAccessArray CORIZQ expr CORDER {
                                                var arr []interface{}
                                                arr = append($list.l, $expr.e)
                                                $l = arr
                                            } 
| CORIZQ expr CORDER    {
                            $l = []interface{}{}
                            $l = append($l, $expr.e)
                        }
;

callFunction returns[interfaces.Expression cf]
: ID PARIZQ listParamsCall PARDER { $cf = expressions.NewCallExp($ID.line, $ID.pos, $ID.text, $listParamsCall.l) }
;

listParamsCall returns[[]interface{} l]
: list=listParamsCall COMA expr {
                                    var arr []interface{}
                                    arr = append($list.l, $expr.e)
                                    $l = arr
                                }
| expr  {
            $l = []interface{}{}
            $l = append($l, $expr.e)
        }
|   {
        $l = []interface{}{}
    }
;

listStructExp returns[[]interface{} l]
: list=listStructExp COMA ID D_PTS expr {
                                            var arr []interface{}
                                            StrExp := environment.NewStructContent($ID.text, $expr.e)
                                            arr = append($list.l, StrExp)
                                            $l = arr
                                        }
| ID D_PTS expr{
                    var arr []interface{}
                    StrExp := environment.NewStructContent($ID.text, $expr.e)
                    arr = append(arr, StrExp)
                    $l = arr
                }
|   {
        $l = []interface{}{}
    }
;