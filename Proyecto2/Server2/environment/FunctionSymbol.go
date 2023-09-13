package environment

type FunctionSymbol struct {
	Lin         int
	Col         int
	Id          string
	ListDec     []interface{}
	Block       []interface{}
	TipoRetorno TipoExpresion
}
