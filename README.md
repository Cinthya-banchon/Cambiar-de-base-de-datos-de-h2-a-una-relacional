# Cambiar de base de datos de h2 a una relacional
Primero debemos descargar el Spring con las extensiones de Spring Web, PostgreSQL Driver y Spring Data JPA.

![image](https://github.com/Cinthya-banchon/Cambiar-de-base-de-datos-de-h2-a-una-relacional/assets/170268641/4e0ca218-564b-4efc-9c3b-ae161c3c90a2)


#Estructura del Proyecto

Este proyecto es una aplicación de gestión de hoteles desarrollada en Java utilizando el framework Spring Boot. A continuación se describe la estructura de carpetas del proyecto:

# Carpeta Principal

hotels/

.gitignore
HELP.md

mvnw

mvnw.cmd

pom.xml

# Descripción de Carpetas y Archivos respectivamente.

.mvn/wrapper

maven-wrapper.properties: Archivo de configuración para el wrapper de Maven.

src/main/java/com/ug/hotels

HotelsApplication.java: Clase principal que inicia la aplicación Spring Boot.

- controllers/HotelController.java: Clase controladora que maneja las solicitudes HTTP relacionadas con los hoteles.
![image](https://github.com/Cinthya-banchon/Cambiar-de-base-de-datos-de-h2-a-una-relacional/assets/170268641/c4e33d26-3643-4eb6-8fb1-0a9a0a2ac7a5)


- model/Hotel.java: Clase modelo que representa la entidad Hotel.
![image](https://github.com/Cinthya-banchon/Cambiar-de-base-de-datos-de-h2-a-una-relacional/assets/170268641/ea216668-ea57-4765-b9cb-4d9fe90b1938)


- repositories/HotelRepository.java: Interfaz de repositorio que proporciona métodos para interactuar con la base de datos de hoteles.
![image](https://github.com/Cinthya-banchon/Cambiar-de-base-de-datos-de-h2-a-una-relacional/assets/170268641/751efb9c-7afb-4758-8e78-fe0c165b381b)


- services/HotelService.java: Interfaz que define los métodos del servicio de hoteles.
![image](https://github.com/Cinthya-banchon/Cambiar-de-base-de-datos-de-h2-a-una-relacional/assets/170268641/a6a396a0-c8cc-41f9-8b82-1cfd0a74d69e)


- services/HotelServiceImpl.java: Implementación de la interfaz HotelService.

# Hacemos clic en Run para que ejecute el Spring y se haga exitosamente la conexión.

![image](https://github.com/Cinthya-banchon/Cambiar-de-base-de-datos-de-h2-a-una-relacional/assets/170268641/679ce916-d329-4079-8d8e-596009468a6d)

# Resultado de la Ejecución:

Después de ejecutar el script, la tabla hotel en la base de datos PostgreSQL se verá de la siguiente manera:

![image](https://github.com/Cinthya-banchon/Cambiar-de-base-de-datos-de-h2-a-una-relacional/assets/170268641/2620f398-7d9d-461b-92bd-6ee6a38ef11b)


# vemos la tabla del postgres

![image](https://github.com/Cinthya-banchon/Cambiar-de-base-de-datos-de-h2-a-una-relacional/assets/170268641/fc57cba0-75e3-4877-9d28-092dd1b0f89a)


# src/main/resources
application.properties: Archivo de configuración de Spring Boot.

data.sql: Archivo SQL con datos iniciales para la base de datos.

templates/application.yml: Archivo YAML de configuración adicional.

- src/test/java/com/ug/hotels

HotelsApplicationTests.java: Clase de prueba para la aplicación.

# target/classes

Esta carpeta contiene los archivos compilados de la aplicación:

- application.properties

- data.sql

- com/ug/hotels/

- HotelsApplication.class

- controllers/HotelController.class

- model/Hotel.class

- repositories/HotelRepository.class

- services/HotelService.class

- services/HotelServiceImpl.class

- templates/application.yml

- target/test-classes
com/ug/hotels/HotelsApplicationTests.class: Clase compilada para pruebas.

# Descripción del Código


@Entity: Indica que esta clase es una entidad JPA que se mapea a una tabla en la base de datos.

@Id: Indica el campo que es la clave primaria de la entidad.

@GeneratedValue(strategy = GenerationType.AUTO): Especifica que el valor del campo hotelId se generará automáticamente.

# Campos:
hotelId: Identificador único del hotel.

hotelName: Nombre del hotel.

hotelAddress: Dirección del hotel.

Constructor: Constructor vacío requerido por JPA.

Métodos Getters y Setters: Métodos para acceder y modificar los campos de la entidad.
