package instructions

import (
	"Server2/environment"
	"Server2/generator"
)

type Function struct {
	Lin     int
	Col     int
	Id      string
	ListDec []interface{}
	Tipo    environment.TipoExpresion
	Bloque  []interface{}
}

func NewFunction(lin int, col int, id string, listd []interface{}, tipo environment.TipoExpresion, bloc []interface{}) Function {
	instr := Function{lin, col, id, listd, tipo, bloc}
	return instr
}

func (p Function) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	return nil
}
