package expressions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
)

type ArrayAccess struct {
	Lin   int
	Col   int
	Array interfaces.Expression
	Index interfaces.Expression
}

func NewArrayAccess(lin int, col int, array interfaces.Expression, index interfaces.Expression) ArrayAccess {
	exp := ArrayAccess{lin, col, array, index}
	return exp
}

func (p ArrayAccess) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {

	var result environment.Value
	return result
}
