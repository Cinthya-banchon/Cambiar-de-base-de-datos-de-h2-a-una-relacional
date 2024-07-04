# Cambiar de base de datos de h2 a una relacional
Primero debemos descargar el Spring con las extensiones de Spring Web, PostgreSQL Driver y Spring Data JPA.

![spring]![image](https://github.com/Cinthya-banchon/Cambiar-de-base-de-datos-de-h2-a-una-relacional/assets/170268641/8a8d5db2-b0dd-4c7c-a1bd-701750c62b57)

#Estructura del Proyecto

Este proyecto es una aplicación de gestión de hoteles desarrollada en Java utilizando el framework Spring Boot. A continuación se describe la estructura de carpetas del proyecto:

# Carpeta Principal

hotels/

.gitignore
HELP.md

mvnw

mvnw.cmd

pom.xml

# Descripción de Carpetas y Archivos

.mvn/wrapper

maven-wrapper.properties: Archivo de configuración para el wrapper de Maven.

src/main/java/com/ug/hotels

HotelsApplication.java: Clase principal que inicia la aplicación Spring Boot.

- controllers/HotelController.java: Clase controladora que maneja las solicitudes HTTP relacionadas con los hoteles.
![image]![image](https://github.com/Cinthya-banchon/Cambiar-de-base-de-datos-de-h2-a-una-relacional/assets/170268641/d862e6c7-5f48-474f-9c3e-54c06fdebdbb)



- model/Hotel.java: Clase modelo que representa la entidad Hotel.
![image]![image](https://github.com/Cinthya-banchon/Cambiar-de-base-de-datos-de-h2-a-una-relacional/assets/170268641/85529362-937b-43ce-af53-0a2248be619c)



- repositories/HotelRepository.java: Interfaz de repositorio que proporciona métodos para interactuar con la base de datos de hoteles.
![image]![image](https://github.com/Cinthya-banchon/Cambiar-de-base-de-datos-de-h2-a-una-relacional/assets/170268641/69cbf89a-67e5-40ef-a2da-60ab75ddd343)



- services/HotelService.java: Interfaz que define los métodos del servicio de hoteles.
![image]![image](https://github.com/Cinthya-banchon/Cambiar-de-base-de-datos-de-h2-a-una-relacional/assets/170268641/37df4b84-8eac-4043-a891-a7c90f6127b5)


- services/HotelServiceImpl.java: Implementación de la interfaz HotelService.

# Hacemos clic en Run para que ejecute el Spring y se haga exitosamente la conexión.

![image](https://github.com/Wellington-Granados/Cambiar-de-base-de-datos-de-h2-a-una-relacional/assets/170190822/12e20dc5-fd58-47f5-b5d2-66f8cca3ec33)

# Resultado de la Ejecución:

Después de ejecutar el script, la tabla hotel en la base de datos PostgreSQL se verá de la siguiente manera:
![image](https://github.com/Wellington-Granados/Cambiar-de-base-de-datos-de-h2-a-una-relacional/assets/170190822/18382197-b85f-411e-ac37-101f0b830248)


# vemos la tabla del postgres
![image](https://github.com/Wellington-Granados/Cambiar-de-base-de-datos-de-h2-a-una-relacional/assets/170190822/e8540a4e-0ac5-409a-bf6c-c4328a642562)



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
