package instructions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
)

type Declaration struct {
	Lin       int
	Col       int
	Id        string
	Tipo      environment.TipoExpresion
	Expresion interfaces.Expression
}

func NewDeclaration(lin int, col int, id string, tipo environment.TipoExpresion, val interfaces.Expression) Declaration {
	instr := Declaration{lin, col, id, tipo, val}
	return instr
}

func (p Declaration) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) interface{} {
	return nil
}

func (p Declaration) ArrayValidation(result environment.Symbol) bool {
	return true
}
