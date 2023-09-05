package expressions

import (
	"Server2/environment"
	"Server2/interfaces"
)

type StructExp struct {
	Lin     int
	Col     int
	Id      string
	ListExp []interface{}
}

func NewStructExp(lin int, col int, id string, list []interface{}) StructExp {
	exp := StructExp{lin, col, id, list}
	return exp
}

func (p StructExp) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	var valor map[string]environment.Symbol
	var result environment.Symbol
	var tempExp []interface{}
	//se guarda el listado de valores nuevos
	for _, s := range p.ListExp {
		tempExp = append(tempExp, s)
	}
	//se obtiene la estructura guardada
	resultStruct := env.(environment.Environment).GetStruct(p.Id)

	//se valida si existe struct
	if resultStruct.Tipo == environment.STRUCT {
		//Validar tamaño y que cada tipo coincida con el struct existente
		if len(resultStruct.Valor.([]interface{})) == len(p.ListExp) {
			valor = make(map[string]environment.Symbol)
			//recorrer el struct almacenado
			for i := 0; i < len(resultStruct.Valor.([]interface{})); i++ {
				//validar los identificadores
				if resultStruct.Valor.([]interface{})[i].(environment.StructType).Id == p.ListExp[i].(environment.StructContent).Id {
					tempVal := p.ListExp[i].(environment.StructContent).Exp.(interfaces.Expression).Ejecutar(ast, env)
					//validando tipos
					if resultStruct.Valor.([]interface{})[i].(environment.StructType).Tipo == tempVal.Tipo {
						valor[resultStruct.Valor.([]interface{})[i].(environment.StructType).Id] = tempVal
					} else {
						ast.SetError("El tipo de parámetro de la variable " + p.ListExp[i].(environment.StructContent).Id + " es incorrecto")
					}
				}
			}
			result = environment.Symbol{Lin: p.Lin, Col: p.Col, Tipo: environment.STRUCT, Valor: valor}
		} else {
			ast.SetError("La cantidad de valores en el struct es incorrecta")
		}
	} else {
		ast.SetError("No se ha encontrado el struct correspondiente")
	}
	return result
}
