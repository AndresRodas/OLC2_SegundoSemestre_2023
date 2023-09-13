package interfaces

import (
	"Server2/environment"
	"Server2/generator"
)

type Expression interface {
	Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value
}
