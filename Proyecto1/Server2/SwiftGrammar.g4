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
| ifstmt { }
;

printstmt returns [interfaces.Instruction prnt]
: PRINT PARIZQ expr PARDER { $prnt = instructions.NewPrint($PRINT.line,$PRINT.pos,$expr.e)}
;

ifstmt  
: IF PARIZQ expr PARDER LLAVEIZQ block LLAVEDER
;

expr returns [interfaces.Expression e]
: left=expr op=(MUL|DIV) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(ADD|SUB) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(MAY_IG|MAYOR) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(MEN_IG|MENOR) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(IG_IG|DIF) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr AND right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr OR right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| PARIZQ expr PARDER { $e = $expr.e }
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