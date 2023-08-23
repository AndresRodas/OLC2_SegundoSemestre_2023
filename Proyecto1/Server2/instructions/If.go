package instructions

import (
	"Server2/environment"
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

func (p If) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var condicion environment.Symbol
	condicion = p.Expresion.Ejecutar(ast, env)
	//Validando tipo
	if condicion.Tipo != environment.BOOLEAN {
		ast.SetError("El tipo de variable es incorrecto para un If")
		return nil
	}
	//Ejecutando if
	if condicion.Valor == true {
		var ifEnv environment.Environment
		ifEnv = environment.NewEnvironment(env.(environment.Environment), "IF")
		//ejecución
		for _, inst := range p.Bloque {
			inst.(interfaces.Instruction).Ejecutar(ast, ifEnv)
		}
		return nil
	} else {
		//agregar condiciones para else
	}
	return nil
}
