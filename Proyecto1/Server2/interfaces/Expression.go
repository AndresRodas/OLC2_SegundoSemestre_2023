package interfaces

import "Server2/environment"

type Expression interface {
	Ejecutar(ast *environment.AST, env interface{}) environment.Symbol
}
