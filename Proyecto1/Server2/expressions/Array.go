package expressions

import (
	"Server2/environment"
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

func (p Array) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {

	var tempExp []interface{}

	for _, s := range p.ListExp {
		tempExp = append(tempExp, s.(interfaces.Expression).Ejecutar(ast, env))
	}

	return environment.Symbol{
		Lin:   p.Lin,
		Col:   p.Col,
		Tipo:  environment.ARRAY,
		Valor: tempExp,
	}
}
