package expressions

import (
	"Server2/environment"
	"Server2/generator"
)

type StructExp struct {
	Lin     int
	Col     int
	Id      string
	ListExp []interface{}
}

func NewStructExp(lin int, col int, id string, list []interface{}) StructExp {
	exp := StructExp{lin, col, id, list}
	return exp
}

func (p StructExp) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	var result environment.Value
	return result
}
