# LlanquihueTourApp

## Descripcion

Este proyecto corresponde al sistema desarrollado para la agencia Llanquihue Tour.

La aplicacion permite cargar informacion de guias turisticos desde un archivo CSV, mostrar los datos por consola y realizar una busqueda por nombre. Ademas, en esta semana se incorporo una jerarquia de clases utilizando herencia para representar distintos tipos de servicios turisticos.

## Objetivo de la semana 6

Implementar una jerarquia de clases aplicando herencia simple, reutilizando atributos comunes mediante una clase base y creando subclases con atributos especificos. Tambien se utilizo sobrescritura del metodo `toString()` para mostrar la informacion de cada servicio turistico.

## Paquetes

* app: contiene la clase Main.
* model: contiene las clases Persona, Guia, RutaTuristica, ServicioTuristico, RutaGastronomica, PaseoLacustre y ExcursionCultural.
* service: contiene la logica para mostrar y buscar guias.
* util: contiene la lectura del archivo CSV.
* data: contiene la clase GestorServicios que crea los objetos de prueba de los servicios turisticos.

## Clases agregadas en la semana 6

* ServicioTuristico
* RutaGastronomica
* PaseoLacustre
* ExcursionCultural
* GestorServicios

## Como ejecutar

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el archivo `guias.csv` este en la raiz del proyecto.
3. Ejecutar la clase `Main` ubicada en el paquete `app`.
4. Revisar la salida en consola, donde se mostraran los guias cargados desde el archivo y los servicios turisticos creados para la actividad de la semana 6.