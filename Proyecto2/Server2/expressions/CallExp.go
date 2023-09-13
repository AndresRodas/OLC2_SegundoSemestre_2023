package expressions

import (
	"Server2/environment"
	"Server2/generator"
)

type CallExp struct {
	Lin    int
	Col    int
	Id     string
	Params []interface{}
}

func NewCallExp(lin int, col int, id string, par []interface{}) CallExp {
	exp := CallExp{lin, col, id, par}
	return exp
}

func (p CallExp) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	var result environment.Value
	return result
}

func (p CallExp) GetGlobal(env interface{}) environment.Environment {
	//obteniendo entorno global
	var tmpEnvGbl environment.Environment
	tmpEnvGbl = env.(environment.Environment)
	for {
		if tmpEnvGbl.Id == "GLOBAL" {
			return tmpEnvGbl
		}
		if tmpEnvGbl.Anterior == nil {
			break
		} else {
			tmpEnvGbl = tmpEnvGbl.Anterior.(environment.Environment)
		}
	}
	return tmpEnvGbl
}
