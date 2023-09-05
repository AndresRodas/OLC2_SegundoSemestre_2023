package instructions

import (
	"Server2/environment"
)

type Struct struct {
	Lin     int
	Col     int
	Id      string
	ListAtr []interface{}
}

func NewStruct(lin int, col int, id string, list []interface{}) Struct {
	instr := Struct{lin, col, id, list}
	return instr
}

func (p Struct) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	env.(environment.Environment).SaveStruct(p.Id, p.ListAtr)
	return nil
}
