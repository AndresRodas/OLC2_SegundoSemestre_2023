package expressions

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
	"strconv"
)

type ArrayAccess struct {
	Lin   int
	Col   int
	Array interfaces.Expression
	Index []interface{}
}

func NewArrayAccess(lin int, col int, array interfaces.Expression, index []interface{}) ArrayAccess {
	exp := ArrayAccess{lin, col, array, index}
	return exp
}

func (p ArrayAccess) Ejecutar(ast *environment.AST, env interface{}, gen *generator.Generator) environment.Value {
	var result environment.Value
	result = p.Array.Ejecutar(ast, env, gen) //t1, true, ARRAY, size
	//variables RM
	In := 0
	Nn := result.ArrSize
	var FinalIndex int
	//validacion array
	if result.Type == environment.ARRAY {
		//agregando primera dimension
		firstIndex := p.Index[0].(interfaces.Expression).Ejecutar(ast, env, gen)
		i, _ := strconv.Atoi(firstIndex.Value)
		//           (i-I1)
		FinalIndex = i - In
		//copiando arreglo de indices
		copiedSlice := make([]interface{}, len(p.Index))
		for i, item := range p.Index {
			if i != 0 {
				copiedSlice[i] = item
			}
		}
		//eliminando primer valor
		copiedSlice = copiedSlice[1:]
		//agregando N dimension
		for _, ind := range copiedSlice {
			firstIndex := ind.(interfaces.Expression).Ejecutar(ast, env, gen)
			j, _ := strconv.Atoi(firstIndex.Value)
			//              (i-I1) * N2 + j - I2
			FinalIndex = FinalIndex*Nn + j - In
		}
		// FinalIndex += 1
		//accediendo al arreglo
		newTmp := gen.NewTemp()
		//se obtiene el array
		tmp := gen.NewTemp()
		gen.AddGetStack(tmp, "(int)"+result.Value)
		//accediendo al arreglo
		gen.AddExpression(newTmp, result.Value, strconv.Itoa(FinalIndex), "+")
		gen.AddExpression(newTmp, newTmp, "1", "+")
		//accediendo al indice
		newTmp2 := gen.NewTemp()
		gen.AddGetStack(newTmp2, "(int)"+newTmp)

		//ToDo: to change
		result = environment.NewValue(newTmp2, true, environment.INTEGER)
		// result.ArrType = tempArray.ArrType
	}

	return result
}
