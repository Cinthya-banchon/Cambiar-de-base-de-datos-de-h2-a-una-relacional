# Deber

Para cambiar la base de datos de mi aplicación de H2 a PostgreSQL, hice varias modificaciones en la configuración de Spring Boot y en el esquema de la base de datos. 

# Modificaciones Realizadas

1. Cambio de Configuración en application.properties:

Primero cambié la URL de conexión para que apunte a mi base de datos PostgreSQL en lugar de la base de datos H2 en memoria. Luego cambié el driver de H2 por el driver de PostgreSQL. Después actualicé el nombre de usuario y la contraseña para conectarme a PostgreSQL. Finalmente cambié el dialecto de Hibernate de H2 a PostgreSQL y ajusté otras configuraciones.

![image](https://github.com/user-attachments/assets/b3738fe9-2306-413c-b9d6-a11b0d4d24b1)


2. Modificación del Esquema de la Base de Datos:

Actualicé la definición de la tabla hotel para que use sintaxis estándar de PostgreSQL. Cambié AUTO_INCREMENT por SERIAL y eliminé las comillas invertidas.

![image](https://github.com/user-attachments/assets/fec88f64-9d20-4a7c-a1b3-a53de37a608d)


# Ejecución
Para asegurarme de que todo estaba funcionando como se esperaba, realicé las siguientes verificaciones:

1. Verifiqué la Conexión a la Base de Datos:

Ejecute el archivo para aseguré de que la aplicación pudiera conectarse a la base de datos de PostgreSQL.

![image](https://github.com/user-attachments/assets/8850a69a-47ff-4627-a733-1ebfeba0eaf7)


2. Comprobé la Creación de la Tabla:

Usé una herramienta de administración de PostgreSQL para verificar que la tabla hotel se hubiera creado correctamente con la estructura correcta.

![image](https://github.com/user-attachments/assets/44569495-2200-40d8-8c0b-8a1eb999f8ee)


3. Revisé los Datos Iniciales:

Verifiqué que los datos iniciales (los registros de los hoteles) estuvieran presentes en la tabla hotel.

![image](https://github.com/user-attachments/assets/33af01da-2540-467e-a094-0b45922f7b60)

