package interfaces

import "Server2/environment"

type Instruction interface {
	Ejecutar(ast *environment.AST, env interface{}) interface{}
}
