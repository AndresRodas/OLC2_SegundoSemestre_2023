package instructions

import (
	"Server2/environment"
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

func (p Function) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var result environment.Symbol
	var function environment.FunctionSymbol

	//creando simbolo funcion
	function = environment.FunctionSymbol{
		Lin:         p.Lin,
		Col:         p.Col,
		Id:          p.Id,
		ListDec:     p.ListDec,
		Block:       p.Bloque,
		TipoRetorno: p.Tipo,
	}
	//guardando simbolo funcion
	env.(environment.Environment).SaveFunction(p.Id, function)

	return result
}
