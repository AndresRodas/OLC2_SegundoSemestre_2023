package expressions

import (
	"Server2/environment"
	"Server2/generator"
	"fmt"
)

type Primitive struct {
	Lin   int
	Col   int
	Valor interface{}
	Tipo  environment.TipoExpresion
}

func NewPrimitive(lin int, col int, valor interface{}, tipo environment.TipoExpresion) Primitive {
	exp := Primitive{lin, col, valor, tipo}
	return exp
}

func (p Primitive) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	var result environment.Value
	if p.Tipo == environment.INTEGER {
		result = environment.NewValue(fmt.Sprintf("%v", p.Valor), false, p.Tipo)
		result.IntValue = p.Valor.(int)
	} else if p.Tipo == environment.FLOAT {
		result = environment.NewValue(fmt.Sprintf("%v", p.Valor), false, p.Tipo)
	}
	return result
}
