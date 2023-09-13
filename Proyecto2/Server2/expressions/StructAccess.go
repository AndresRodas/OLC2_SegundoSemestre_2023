package expressions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
)

type StructAccess struct {
	Lin    int
	Col    int
	Struct interfaces.Expression
	Id     string
}

func NewStructAccess(lin int, col int, str interfaces.Expression, id string) StructAccess {
	exp := StructAccess{lin, col, str, id}
	return exp
}

func (p StructAccess) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {

	var result environment.Value
	return result
}
