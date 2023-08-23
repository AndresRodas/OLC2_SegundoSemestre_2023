package expressions

import (
	"Server2/environment"
	"Server2/interfaces"
	"fmt"
)

type ArrayAccess struct {
	Lin   int
	Col   int
	Array interfaces.Expression
	Index interfaces.Expression
}

func NewArrayAccess(lin int, col int, array interfaces.Expression, index interfaces.Expression) ArrayAccess {
	exp := ArrayAccess{lin, col, array, index}
	return exp
}

func (p ArrayAccess) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {

	var tempArray environment.Symbol
	tempArray = p.Array.Ejecutar(ast, env) //sym{[1,2,3,4]}

	if tempArray.Tipo == environment.ARRAY {
		var tempIndex environment.Symbol
		tempIndex = p.Index.Ejecutar(ast, env) //sym{3}
		var tempValue interface{}
		tempValue = tempArray.Valor
		//validando indice
		if tempIndex.Valor.(int) >= 0 && tempIndex.Valor.(int) < len(tempValue.([]interface{})) {
			valret := tempValue.([]interface{})[(tempIndex.Valor.(int))].(environment.Symbol)
			return valret
		} else {
			ast.SetError("Indice fuera de los limites")
			fmt.Println("indice: ", tempIndex.Valor.(int))
			fmt.Println("tamaño: ", len(tempValue.([]interface{})))
		}

	} else {
		ast.SetError("La expresión no es un arreglo")
	}
	return environment.Symbol{
		Lin:   p.Lin,
		Col:   p.Col,
		Tipo:  environment.NULL,
		Valor: 0,
	}
}
