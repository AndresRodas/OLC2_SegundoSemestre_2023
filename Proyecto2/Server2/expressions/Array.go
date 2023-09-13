package expressions

import (
	"Server2/environment"
	"Server2/generator"
)

type Array struct {
	Lin     int
	Col     int
	ListExp []interface{}
}

func NewArray(lin int, col int, list []interface{}) Array {
	exp := Array{lin, col, list}
	return exp
}

func (p Array) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {

	var result environment.Value
	return result
}
