package instructions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
	"strconv"
)

type Assignment struct {
	Lin       int
	Col       int
	Id        string
	Expresion interfaces.Expression
}

func NewAssignment(lin int, col int, id string, val interfaces.Expression) Assignment {
	instr := Assignment{lin, col, id, val}
	return instr
}

func (p Assignment) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	var result environment.Value
	gen.AddComment("Generando asignacion")
	//buscando variable en entorno
	variable := env.(environment.Environment).GetVariable(p.Id)
	//ejecutando valor
	result = p.Expresion.Ejecutar(ast, env, gen)
	//realizando asignacion
	gen.AddSetStack(strconv.Itoa(variable.Posicion), result.Value)
	gen.AddBr()
	return result
}
