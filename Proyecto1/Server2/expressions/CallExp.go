package expressions

import (
	"Server2/environment"
	"Server2/instructions"
	"Server2/interfaces"
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

func (p CallExp) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	var result environment.Symbol
	var funcSym environment.FunctionSymbol
	//obtener la funcion anteriormente guardada
	funcSym = env.(environment.Environment).GetFunction(p.Id)
	//definiendo nuevo entorno de funcion
	var funcEnv environment.Environment
	//si no es modulo se usa el global como anterior
	funcEnv = environment.NewEnvironment(p.GetGlobal(env), p.Id+"(FUNCTION)")
	//se agregan los parámetros como variables
	if len(p.Params) == len(funcSym.ListDec) {
		for i := 0; i < len(p.Params); i++ {
			var val environment.Symbol
			val = p.Params[i].(interfaces.Expression).Ejecutar(ast, env)
			if val.Tipo == funcSym.ListDec[i].(instructions.ParamsDeclaration).Tipo {
				funcEnv.SaveVariable(funcSym.ListDec[i].(instructions.ParamsDeclaration).Id, val)
			} else {
				ast.SetError("El tipo de parámetro es incorrecto")
				return result
			}
		}
	} else {
		ast.SetError("Faltan parámetros en la función")
		return result
	}
	//ejecutar bloque con entorno funcEnv
	for _, inst := range funcSym.Block {
		inst.(interfaces.Instruction).Ejecutar(ast, funcEnv)
	}
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
