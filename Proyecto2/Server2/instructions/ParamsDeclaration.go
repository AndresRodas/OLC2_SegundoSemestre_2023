package instructions

import (
	"Server2/environment"
	"Server2/generator"
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

func (p ParamsDeclaration) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	var result environment.Value
	result = environment.NewValue(p.Id, false, p.Tipo)
	return result
}
