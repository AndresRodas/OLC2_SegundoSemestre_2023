package expressions

import (
	"Server2/environment"
	"Server2/generator"
	"fmt"
	"strconv"
)

type Primitive struct {
	Lin   int
	Col   int
	Valor interface{}
	Tipo  environment.TipoExpresion
}

func NewPrimitive(lin int, col int, valor interface{}, tipo environment.TipoExpresion) Primitive {
	exp := Primitive{lin, col, valor, tipo}
	return exp
}

func (p Primitive) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	var result environment.Value
	if p.Tipo == environment.INTEGER {
		result = environment.NewValue(fmt.Sprintf("%v", p.Valor), false, p.Tipo)
		result.IntValue = p.Valor.(int)
	} else if p.Tipo == environment.FLOAT {
		result = environment.NewValue(fmt.Sprintf("%v", p.Valor), false, p.Tipo)
	} else if p.Tipo == environment.STRING {
		//nuevo temporal
		newTemp := gen.NewTemp()
		//iguala a heap pointer
		gen.AddAssign(newTemp, "H")
		//recorremos string en ascii
		myString := p.Valor.(string)
		byteArray := []byte(myString)
		for _, asc := range byteArray {
			//se agrega ascii al heap
			gen.AddSetHeap("(int)H", strconv.Itoa(int(asc)))
			//suma heap pointer
			gen.AddExpression("H", "H", "1", "+")
		}
		//caracteres de escape
		gen.AddSetHeap("(int)H", "-1")
		gen.AddExpression("H", "H", "1", "+")
		gen.AddBr()
		result = environment.NewValue(newTemp, true, p.Tipo)
		//result = environment.Value{Value: newTemp, IsTemp: true, Type: p.Tipo}
	} else if p.Tipo == environment.BOOLEAN {
		gen.AddComment("Primitivo bool")
		trueLabel := gen.NewLabel()
		falseLabel := gen.NewLabel()
		if p.Valor.(bool) {
			gen.AddGoto(trueLabel)
		} else {
			gen.AddGoto(falseLabel)
		}
		result = environment.NewValue("", false, environment.BOOLEAN)
		result.TrueLabel = append(result.TrueLabel, trueLabel)
		result.FalseLabel = append(result.FalseLabel, falseLabel)
	}
	return result
}
