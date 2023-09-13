package expressions

import (
	"Server2/environment"
	"Server2/generator"
)

type CallVar struct {
	Lin int
	Col int
	Id  string
}

func NewCallVar(lin int, col int, id string) CallVar {
	exp := CallVar{lin, col, id}
	return exp
}

func (p CallVar) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	var result environment.Value
	return result
}
