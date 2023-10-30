package instructions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
	"strconv"
)

type Declaration struct {
	Lin       int
	Col       int
	Id        string
	Tipo      environment.TipoExpresion
	Expresion interfaces.Expression
}

func NewDeclaration(lin int, col int, id string, tipo environment.TipoExpresion, val interfaces.Expression) Declaration {
	instr := Declaration{lin, col, id, tipo, val}
	return instr
}

func (p Declaration) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	var result environment.Value
	var newVar environment.Symbol
	result = p.Expresion.Ejecutar(ast, env, gen)
	gen.AddComment("Agregando una declaracion")
	if result.Type == environment.BOOLEAN {
		newVar = env.(environment.Environment).SaveVariable(p.Id, p.Tipo)
		//si no es temp (boolean)
		newLabel := gen.NewLabel()
		//add labels
		for _, lvl := range result.TrueLabel {
			gen.AddLabel(lvl.(string))
		}
		gen.AddSetStack(strconv.Itoa(newVar.Posicion), "1")
		gen.AddGoto(newLabel)
		//add labels
		for _, lvl := range result.FalseLabel {
			gen.AddLabel(lvl.(string))
		}
		gen.AddSetStack(strconv.Itoa(newVar.Posicion), "0")
		gen.AddGoto(newLabel)
		gen.AddLabel(newLabel)
		gen.AddBr()
	} else if result.Type == environment.ARRAY {
		newVar = env.(environment.Environment).SaveArrayVariable(p.Id, p.Tipo, len(result.ArrValue))
		gen.AddComment("Iniciando la declaración de un ARRAY")
		p.ArrayValidation(ast, env, gen, result.ArrValue)
		gen.AddComment("Se finalizó la declaración de un ARRAY")
	} else {
		//si es temp (num,string,etc)
		newVar = env.(environment.Environment).SaveVariable(p.Id, p.Tipo)
		gen.AddSetStack(strconv.Itoa(newVar.Posicion), result.Value)
		gen.AddBr()
	}

	return result
}

func (p Declaration) ArrayValidation(ast *environment.AST, env interface{}, gen *generator.Generator, arr []interface{}) {
	for _, val := range arr {
		if val.(environment.Value).Type == environment.ARRAY {
			p.ArrayValidation(ast, env, gen, val.(environment.Value).ArrValue)
		} else {
			envSize := env.(environment.Environment).NewVariable()
			gen.AddSetStack(strconv.Itoa(envSize.Posicion), val.(environment.Value).Value)
			gen.AddBr()
		}
	}
}
