package environment

import (
	"fmt"
)

type Environment struct {
	Anterior interface{}
	Tabla    map[string]Symbol
	Id       string
}

func NewEnvironment(ant interface{}, id string) Environment {
	return Environment{
		Anterior: ant,
		Tabla:    make(map[string]Symbol),
		Id:       id,
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
