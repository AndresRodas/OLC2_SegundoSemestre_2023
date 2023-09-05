package instructions

import (
	"Server2/environment"
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

func (p Assignment) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var result environment.Symbol

	result = p.Expresion.Ejecutar(ast, env)
	env.(environment.Environment).SetVariable(p.Id, result)

	return nil
}
