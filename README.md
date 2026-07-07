# LlanquihueTourApp

## Descripcion

Este proyecto corresponde al sistema desarrollado para la agencia Llanquihue Tour.

La aplicacion permite cargar informacion de guias turisticos desde un archivo CSV, mostrar los datos por consola y realizar una busqueda por nombre. Ademas, se implemento una jerarquia de clases utilizando herencia y, en esta semana, se incorporo el uso de polimorfismo y colecciones para gestionar distintos tipos de servicios turisticos.

## Objetivo de la semana 7

Implementar polimorfismo mediante una coleccion `List<ServicioTuristico>`, almacenando distintos tipos de servicios turisticos en una misma lista y recorriendolos mediante referencias de la superclase. Cada subclase sobrescribe el metodo `mostrarInformacion()` para mostrar su informacion especifica.

## Paquetes

* app: contiene la clase Main.
* model: contiene las clases Persona, Guia, RutaTuristica, ServicioTuristico, RutaGastronomica, PaseoLacustre y ExcursionCultural.
* service: contiene la logica para mostrar y buscar guias.
* util: contiene la lectura del archivo CSV.
* data: contiene la clase GestorServicios.

## Funcionalidades implementadas

* Carga de guias desde un archivo CSV.
* Busqueda de guias por nombre.
* Jerarquia de clases utilizando herencia.
* Sobrescritura del metodo `mostrarInformacion()`.
* Uso de una coleccion `List<ServicioTuristico>`.
* Recorrido de los servicios mediante polimorfismo.

## Como ejecutar

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el archivo `guias.csv` este en la raiz del proyecto.
3. Ejecutar la clase `Main` ubicada en el paquete `app`.
4. Revisar la salida en consola, donde se mostraran los guias cargados y la informacion de los servicios turisticos utilizando polimorfismo.