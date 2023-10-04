package environment

import (
	"fmt"
)

type Environment struct {
	Anterior interface{}
	Tabla    map[string]Symbol
	Id       string
	Size     map[string]int
}

func NewEnvironment(ant interface{}, id string) Environment {
	env := Environment{
		Anterior: ant,
		Tabla:    make(map[string]Symbol),
		Id:       id,
		Size:     make(map[string]int),
	}
	env.Size["size"] = 0
	return env
}

func (env Environment) SaveVariable(id string, tipo TipoExpresion) Symbol {
	if variable, ok := env.Tabla[id]; ok {
		fmt.Println("La variable "+id+" ya existe ", variable)
		return env.Tabla[id]
	}
	env.Tabla[id] = Symbol{Lin: 0, Col: 0, Tipo: tipo, Posicion: env.Size["size"]}
	env.Size["size"] = env.Size["size"] + 1
	return env.Tabla[id]
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
	return Symbol{Lin: 0, Col: 0, Tipo: NULL, Posicion: 0}
}

func (env Environment) SetVariable(id string, value Symbol) Symbol {
	var tmpEnv Environment
	tmpEnv = env
	for {
		if variable, ok := tmpEnv.Tabla[id]; ok {
			tmpEnv.Tabla[id] = value
			return variable
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}
	fmt.Println("La variable ", id, " no existe")
	return Symbol{Lin: 0, Col: 0, Tipo: NULL, Posicion: 0}
}
