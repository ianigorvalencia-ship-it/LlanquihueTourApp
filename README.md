# LlanquihueTourApp

## Descripcion

Este proyecto corresponde a una aplicacion desarrollada en Java para la agencia Llanquihue Tour.

La aplicacion permite trabajar con informacion de guias turisticos, servicios y vehiculos. Durante las distintas semanas se fueron agregando nuevas funcionalidades como carga de datos desde un archivo CSV, herencia, polimorfismo, colecciones, interfaces y una interfaz grafica usando JOptionPane.

## Objetivo semana 7

En esta semana se implemento el uso de polimorfismo y colecciones, permitiendo almacenar distintos tipos de servicios turisticos dentro de una misma lista utilizando la clase padre `ServicioTuristico`.

Cada clase hija cuenta con su propia implementacion del metodo `mostrarInformacion()` para mostrar sus datos correspondientes.

## Objetivo semana 8

En esta semana se incorporo el uso de interfaces en Java.

Se creo la interfaz `Registrable`, la cual permite que distintas clases puedan ser almacenadas dentro de una misma coleccion utilizando `ArrayList<Registrable>`.

Tambien se agrego una interfaz grafica con `JOptionPane`, donde el usuario puede ingresar nuevos guias, vehiculos y visualizar la informacion registrada.

## Paquetes

* app: contiene la clase principal Main.
* model: contiene las clases del modelo como Persona, Guia, RutaTuristica, ServicioTuristico, RutaGastronomica, PaseoLacustre, ExcursionCultural y Vehiculo.
* service: contiene la logica relacionada con la gestion de guias.
* util: contiene la lectura del archivo CSV.
* data: contiene la clase GestorServicios.
* interfaz: contiene la interfaz Registrable.
* ui: contiene la clase de la interfaz grafica.

## Funcionalidades implementadas

* Lectura de guias desde un archivo CSV.
* Busqueda de guias por nombre.
* Uso de herencia entre clases.
* Uso de polimorfismo con servicios turisticos.
* Implementacion de la interfaz Registrable.
* Uso de ArrayList para almacenar objetos registrables.
* Agregar guias mediante una ventana grafica.
* Agregar vehiculos mediante una ventana grafica.
* Mostrar las entidades ingresadas.

## Conceptos utilizados

Durante el desarrollo del proyecto se aplicaron los siguientes conceptos:

* Programacion orientada a objetos.
* Clases y objetos.
* Herencia.
* Polimorfismo.
* Interfaces.
* Colecciones con ArrayList.
* Uso de instanceof.
* Organizacion del proyecto mediante paquetes.
* Uso de JOptionPane para la interfaz grafica.

## Como ejecutar

1. Abrir el proyecto en IntelliJ IDEA.
2. Revisar que el archivo `guias.csv` se encuentre en la carpeta principal del proyecto.
3. Ejecutar la clase `Main` ubicada en el paquete `app`.
4. Seguir las opciones que aparecen en la interfaz grafica.

## Menu del programa

El programa cuenta con las siguientes opciones:

1. Agregar guia.
2. Agregar vehiculo.
3. Mostrar entidades.
4. Salir.

## Autor

Ian Igor Carreara  
Analista Programador Computacional  
Duoc UC