package instructions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
)

type If struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
	Bloque    []interface{}
}

func NewIf(lin int, col int, condition interfaces.Expression, bloque []interface{}) If {
	ifInstr := If{lin, col, condition, bloque}
	return ifInstr
}

func (p If) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	return nil
}
