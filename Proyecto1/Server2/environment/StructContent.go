package environment

type StructContent struct {
	Id  string
	Exp interface{}
}

func NewStructContent(ide string, ex interface{}) StructContent {
	exp := StructContent{Id: ide, Exp: ex}
	return exp
}
