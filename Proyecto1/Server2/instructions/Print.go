package instructions

import (
	"Server2/environment"
	"Server2/interfaces"
	"fmt"
)

type Print struct {
	Lin   int
	Col   int
	Value interface{}
}

func NewPrint(lin int, col int, val interface{}) Print {
	return Print{lin, col, val}
}

func (p Print) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	valueToPrint := p.Value.(interfaces.Expression).Ejecutar(ast, env)
	consoleOut := fmt.Sprintf("%v", valueToPrint.Valor)
	ast.SetPrint(consoleOut + "\n")
	return nil
}
