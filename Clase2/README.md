# Clase 2

### [Grabación](https://drive.google.com/file/d/1dP7eK1BClFg4kn7PCaAjqGo84s1EAZNj/view?usp=sharing)
-------------
## Preparación de entorno ANTLR4 (*Windows*)

### 1) Instalación del JDK
* Primero vamos a descargar el archivo de instalación del **JDK** en el siguiene [enlace de descarga](https://www.oracle.com/java/technologies/downloads/#jdk20-windows).
![](https://i.imgur.com/896JWft.png)
![](https://hackmd.io/uploads/SJP6PUXnn.png)

* Ejecutar el instalador, y seguir los pasos.

![](https://hackmd.io/_uploads/SyALdLm32.png)

![](https://hackmd.io/_uploads/rkkOdI723.png)

* Una vez finalizado el proceso es recomendable hacer un reinicio del sistema.

### 2) Archivos necesarios de ANTLR4

* Los siguiente será descargar los archivos de ejecución de ANTLR4, estos archivos se encuentran en el siguiente [link de UEDI](https://uedi.ingenieria.usac.edu.gt/campus/mod/resource/view.php?id=597678) o bien en la sección del curso, en el apartado de **Archivos**.

![](https://hackmd.io/_uploads/S1wOoUX22.png)

* Una vez descargado tendremos la siguiente carpeta:

![](https://hackmd.io/_uploads/SkSYTL723.png)

* En la subcarpeta llamada "bin" encontraremos algunos archivos que nos ayudaran a ejecutar Antlr4.

![](https://hackmd.io/_uploads/BJfpaIm22.png)

* En la subcarpeta llamada "lib" encontraremos el archivo .jar completo de ANTLR4 en 3 versiones distintas, para este caso unicamente se usará la versión 4.13.0.

![](https://hackmd.io/_uploads/BkbzCLXh3.png)

* Para hacer uso de estos archivos ubicaremos la carpeta que acabamos de descargar en la ruta: "C:\antlr4"

![](https://hackmd.io/_uploads/HygpPRLm23.png)

### 3) Variables de entorno del sistema

* Para poder hacer uso de esta herramienta tendremos que agregar y modificar algunas variables de entorno de Windows.  Para esto nos dirigimos a las opciones y buscaremos los ajustes de **variables de entorno del sistema**.

![](https://hackmd.io/_uploads/r1Py1D7nn.png)

* Cuando nos encontremos en esta ventana seleccionaremos la opción de "Variables de Entorno".

![](https://hackmd.io/_uploads/Hyvmyw7h3.png)

* Se desplegará una ventana con todas las variables de Windows, nosotros seleccionamos la variable "path" y la opción de "Editar", entonces se desplegará la siguiente ventana.

![](https://hackmd.io/_uploads/SJfkxP732.png)

* Primero tenemos que agregar la ruta donde instalamos el JDK, para eso seleccionamos la opción de "Nuevo" y pegamos la ruta de la carpeta.

![](https://hackmd.io/_uploads/Sy8oxP7n3.png)

* Ahora tenemos que definir algunas rutas que usaran los archivos de ejecución de ANTLR4, para eso seleccionamos la opción de "Nuevo" y escribimos lo siguiente: **%ANTLR4_HOME%\bin**

![](https://hackmd.io/_uploads/H1c4WwX32.png)

* Por ultimo tenemos que agregar una nueva variable en el sistema, para eso damos click en "Aceptar" y regresamos a la pantalla anterior.

![](https://hackmd.io/_uploads/H11p-PXn2.png)

* Seleccionamos la opción de "Nuevo..." y se desplegará una ventana que nos solicita **Nombre de la Variable** y **Valor de la Variable**, para lo cual agregaremos los siguientes datos:

    * **Nombre**: ANTLR4_HOME
    * **Valor**: C:\antlr4

![](https://hackmd.io/_uploads/ry4DMwX22.png)

* Por último damos click en aceptar y guardamos todos los cambios.  Ya que instalamos algunos archivos y editamos las variables del sistema es necesario un **reinicio**.

### 4) Ejecución de ANTLR4

* Una vez reainiciado el sistema ya podremos empezar a utilizar ANTLR4 en cualquier parte.  Para probar de manera rápida vamos a crear una gramática sencilla de la siguiente forma:

![](https://hackmd.io/_uploads/rywVVDX32.png)

* Nótese que al crear un archivo con extension ".g4" se crea automáticamente una carpeta llamada ".antlr" allí encontraremos archivos de apoyo de ANTLR4.

* La gramática se vé de la siguiente manera, contiene producciones sencillas para interpretar instrucciones y expresiones.

![](https://hackmd.io/_uploads/r1WRNDm22.png)

* Para poder ejecutar ANTLR4 y que convierta nuestra gramática en código utilizable de Go primero abrimos una nueva terminal y nos situamos en la misma carpeta donde está nuestra gramática.

![](https://hackmd.io/_uploads/HJ7_HD72h.png)

* Luego ingresamos el siguiente comando y presionamos **enter**: 

```bash=
antlr4 -Dlanguage=Go -o parser -package parser *.g4
```

* Definición del comando:

    * **-Dlanguage=Go**: con este parámetro definimos el lenguaje de salida que dará ANLR4, para este caso le indicamos que trabaje con Go.
    * **-o parser**: con este comando indicamos un directorio de salida "parser" para todos los archivos que se generen.
    * **-package parser**: con esta instrucción indicamos el packete de Go al que pertenecen los archivos generados.
    * ***.g4**: con esta opción le indicamos que utilice todos los archivos terminados en ".g4" que se encuentren en el directorio.

* Cuando termine el proceso nos dará una respuesta como la siguiente

![](https://hackmd.io/_uploads/SJ1KdDQ3n.png)

* **¡Listo!** ya generamos nuestro analizador en base a una gramática utilizando ANTLR4, solo resta implementar los archivos en nuestro programa de Go.

![](https://hackmd.io/_uploads/BkdcdD73h.png)



-------------
| Carne     | Nombre                     |
| --------- | -------------------------- |
| 201504220 | José Andres Rodas Arrecis  |
