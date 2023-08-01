package main

import (
	"fmt"

	"github.com/gofiber/fiber/v2"
)

type Resp struct {
	Output  string
	Flag    bool
	Message string
}

func handleInterpreter(c *fiber.Ctx) error {
	response := Resp{
		Output:  "ESTE ES EL TEXTO SALIDA DE LA CONSOLA JAJAJA",
		Flag:    true,
		Message: "Ejecución realizada con éxito",
	}
	return c.Status(fiber.StatusOK).JSON(response)
}

func main() {

	app := fiber.New()

	app.Get("/Interpreter", handleInterpreter)

	fmt.Println("holas")
	app.Listen(":3001")

}
