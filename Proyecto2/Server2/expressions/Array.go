package expressions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
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
	//array con values a retornar
	var arrVal = []interface{}{}
	//evaluando elementos del array
	for _, exp := range p.ListExp {
		//se ejecuta cada una de las expresiones del arreglo
		var indexExp = exp.(interfaces.Expression).Ejecutar(ast, env, gen)
		//Agregando valores al nuevo array
		arrVal = append(arrVal, indexExp)
	}
	result.Type = environment.ARRAY
	result.ArrValue = arrVal
	result.ArrSize = len(arrVal)
	return result
}
