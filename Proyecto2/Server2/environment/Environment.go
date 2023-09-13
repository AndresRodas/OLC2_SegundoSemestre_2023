package environment

import (
	"fmt"
)

type Environment struct {
	Anterior  interface{}
	Tabla     map[string]Symbol
	Structs   map[string]Symbol
	Functions map[string]FunctionSymbol
	Id        string
}

func NewEnvironment(ant interface{}, id string) Environment {
	return Environment{
		Anterior:  ant,
		Tabla:     make(map[string]Symbol),
		Structs:   make(map[string]Symbol),
		Functions: make(map[string]FunctionSymbol),
		Id:        id,
	}
}

func (env Environment) SaveVariable(id string, value Symbol) {
	if variable, ok := env.Tabla[id]; ok {
		fmt.Println("La variable "+id+" ya existe", variable)
		return
	}
	env.Tabla[id] = value
}

func (env Environment) GetVariable(id string) Symbol {
	var tmpEnv Environment
	tmpEnv = env
	for {
		if variable, ok := tmpEnv.Tabla[id]; ok {
			return variable
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}
	fmt.Println("La variable ", id, " no existe")
	return Symbol{Lin: 0, Col: 0, Tipo: NULL, Valor: 0}
}

func (env Environment) SetVariable(id string, value Symbol) Symbol {
	var tmpEnv Environment
	tmpEnv = env
	for {
		if variable, ok := tmpEnv.Tabla[id]; ok {
			if tmpEnv.Tabla[id].Tipo == value.Tipo {
				tmpEnv.Tabla[id] = value
				return variable
			} else {
				fmt.Println("El tipo de dato es incorrecto")
				return Symbol{Lin: 0, Col: 0, Tipo: NULL, Valor: 0}
			}
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}
	fmt.Println("La variable ", id, " no existe")
	return Symbol{Lin: 0, Col: 0, Tipo: NULL, Valor: 0}
}

func (env Environment) SaveFunction(id string, value FunctionSymbol) {
	if variable, ok := env.Functions[id]; ok {
		fmt.Println("La funcion " + variable.Id + " ya existe")
		return
	}
	env.Functions[id] = value
}

func (env Environment) GetFunction(id string) FunctionSymbol {
	var tmpEnv Environment
	tmpEnv = env
	for {
		if variable, ok := tmpEnv.Functions[id]; ok {
			return variable
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}
	fmt.Println("La funcion ", id, " no existe")
	return FunctionSymbol{TipoRetorno: NULL}
}

func (env Environment) SaveStruct(id string, list []interface{}) {
	if _, ok := env.Structs[id]; ok {
		fmt.Println("El struct " + id + " ya existe")
		return
	}
	env.Structs[id] = Symbol{Lin: 0, Col: 0, Tipo: STRUCT, Valor: list}
}

func (env Environment) GetStruct(id string) Symbol {

	var tmpEnv Environment
	tmpEnv = env

	for {
		if tmpStruct, ok := tmpEnv.Structs[id]; ok {
			return tmpStruct
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}

	fmt.Println("El struct ", id, " no existe")
	return Symbol{Lin: 0, Col: 0, Tipo: NULL, Valor: 0}
}
