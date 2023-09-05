package instructions

import (
	"Server2/environment"
)

type ParamsDeclaration struct {
	Lin  int
	Col  int
	Id   string
	Tipo environment.TipoExpresion
}

func NewParamsDeclaration(lin int, col int, id string, tipo environment.TipoExpresion) ParamsDeclaration {
	instr := ParamsDeclaration{lin, col, id, tipo}
	return instr
}

func (p ParamsDeclaration) Ejecutar(ast *environment.AST, env interface{}) interface{} {

	var result environment.Symbol

	result = environment.Symbol{
		Lin:   p.Lin,
		Col:   p.Col,
		Tipo:  p.Tipo,
		Valor: 0,
	}

	env.(environment.Environment).SaveVariable(p.Id, result)

	return nil
}
