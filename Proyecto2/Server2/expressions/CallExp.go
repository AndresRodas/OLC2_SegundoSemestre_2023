package expressions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
	"fmt"
	"strconv"
	"strings"
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
	size := env.(environment.Environment).Size["size"]
	gen.AddComment("Inicio de llamada")
	if len(p.Params) > 0 {
		tmp1 := gen.NewTemp()
		gen.AddExpression(tmp1, "P", strconv.Itoa(size+1), "+")
		for i := 0; i < len(p.Params); i++ {

			//ejecutando parametros
			if strings.Contains(fmt.Sprintf("%T", p.Params[i]), "expressions") {
				result = p.Params[i].(interfaces.Expression).Ejecutar(ast, env, gen)
			} else {
				fmt.Println("Error en bloque")
			}
			//guardando
			gen.AddSetStack("(int)"+tmp1, result.Value)
			if (len(p.Params) - 1) != i {
				gen.AddExpression(tmp1, tmp1, "1", "+")
			}
		}

		gen.AddExpression("P", "P", strconv.Itoa(size), "+")
		gen.AddCall(p.Id)
		gen.AddGetStack(tmp1, "(int)P")
		gen.AddExpression("P", "P", strconv.Itoa(size), "-")

	} else {
		tmp1 := gen.NewTemp()

		gen.AddExpression("P", "P", strconv.Itoa(size), "+")
		gen.AddCall(p.Id)
		gen.AddGetStack(tmp1, "(int)P")
		gen.AddExpression("P", "P", strconv.Itoa(size), "-")

	}
	gen.AddComment("Final de llamada")
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
