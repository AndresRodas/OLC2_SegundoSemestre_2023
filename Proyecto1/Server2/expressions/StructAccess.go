package expressions

import (
	"Server2/environment"
	"Server2/interfaces"
)

type StructAccess struct {
	Lin    int
	Col    int
	Struct interfaces.Expression
	Id     string
}

func NewStructAccess(lin int, col int, str interfaces.Expression, id string) StructAccess {
	exp := StructAccess{lin, col, str, id}
	return exp
}

func (p StructAccess) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {

	var result, tempStruct environment.Symbol
	tempStruct = p.Struct.Ejecutar(ast, env) //sym{[1,2,3,4]}

	if tempStruct.Tipo == environment.STRUCT {

		if variable, ok := tempStruct.Valor.(map[string]environment.Symbol)[p.Id]; ok {
			return variable
		}
		ast.SetError("No existe el elemento " + p.Id)
		return result
	}
	ast.SetError("La expresión no es un struct")
	return result
}
