package instructions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
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
	return nil
}
