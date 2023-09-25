


# Proyecto Hotel-Alura

## Sistema de Registro de Huéspedes y Reservas en Java

Este es un programa de registro de huespedes y creacion de reservas desarrollado en Java. Permite la creacion, modificacion y eliminacion de requistros de huespedes y reservas en una base de datos sql a travez de una UI de facil uso.
Este es mi proyecto fue creado con el proposito de cumplir con los requisitos propuestos en el  segundo desafio del curso Java Backend en Alura. 


## Características

- Registro de huespedes.
- creacion de reservas.
- Calculo del costo de la resevas dependiendo la cantidad de dias del hospedaje.
- Muestra el listado de huespedes y reservas dentro de un JTable donde se nos permite, buscar, actualizar y eliminar cada uno deestos.

## Uso
### Antes de Ejecutar

1. Modifique los datos de conexión con la base de datos en la clase `AutenticadorDB`, ubicada en "Hotel\src\main\java\com\mycompany\DBAdmin\AutenticadorDB.java".
2. Inicie una base de datos SQL y cree las siguientes tablas: "reservas" y "huéspedes". Dentro de la carpeta `Tablas` que se encuentra en la raíz, adjunto un script SQL para la creación automática con algunos ejemplos.

### Ejecución

1. Ejecute el programa.
2. Haga clic en "Login".
3. Ingrese el usuario y la contraseña (predeterminados son "admin" y "admin").
4. Elija entre las dos opciones del menú principal: "Búsqueda" o "Registro de reservas" (recomiendo usar el scrip ubicado en la carpeta `Tablas` para empezar con datos de ejemplo).



## Requisitos

- JDK 17 o superior.
- usuario/password predeterminados: "admin"
- Dependencias:
1. gson-2.10 [[MVN REPO link]](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.10) [[Download]](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10/gson-2.10.jar)
2. AbsoluteLayout [[MVN REPO link]](https://mvnrepository.com/artifact/netbeans/netbeans-absolutelayout/1.0) [[Download]](https://nexus.web.cern.ch/nexus/content/repositories/public/netbeans/netbeans-absolutelayout/1.0/netbeans-absolutelayout-1.0.jar)
3. flatlaf-3.2. [[MVN REPO link]](https://mvnrepository.com/artifact/com.formdev/flatlaf/3.2.1) [[Download]](https://repo1.maven.org/maven2/com/formdev/flatlaf/3.2/flatlaf-3.2.jar)
4. Jcalendar-1.4  [[MVN REPO link]](https://mvnrepository.com/artifact/com.toedter/jcalendar/1.4) [[Download]](https://repo1.maven.org/maven2/com/toedter/jcalendar/1.4/jcalendar-1.4.jar)
5. mysql-connector-java-8.0.28 [[MVN REPO link]](https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.28)  [[Download]](https://repo1.maven.org/maven2/mysql/mysql-connector-java/8.0.28/mysql-connector-java-8.0.28.jar)
6. protobuf-java-3.11.4  [[MVN REPO link]](https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java/3.11.4)
  

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para obtener más detalles.


Creado por: [ERCamilo](https://github.com/ERCamilo)

Diseño de la UI: ALURA LATAM
