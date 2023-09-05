package environment

type StructType struct {
	Id   string
	Tipo TipoExpresion
}

func NewStructType(id string, tip TipoExpresion) StructType {
	exp := StructType{id, tip}
	return exp
}
