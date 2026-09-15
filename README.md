# Reto de Automatización QA - ServeRest

## Descripción

Proyecto de automatización de pruebas API desarrollado con **Karate DSL** para validar los endpoints de usuarios de la API **ServeRest**.

El proyecto incluye escenarios positivos y negativos para las operaciones principales de usuarios.

## Tecnologías utilizadas

* Java 17
* Maven
* Karate DSL
* JUnit 5
* IntelliJ IDEA

## Endpoints automatizados

| Método | Endpoint          | Validaciones                                     |
| ------ | ----------------- | ------------------------------------------------ |
| GET    | `/usuarios`       | Consulta de usuarios y estructura de respuesta   |
| GET    | `/usuarios/{_id}` | Consulta de usuario existente y caso negativo    |
| POST   | `/usuarios`       | Registro exitoso y validación de email duplicado |
| PUT    | `/usuarios/{_id}` | Actualización de usuario                         |
| DELETE | `/usuarios/{_id}` | Eliminación de usuario y validación de respuesta |

## Estructura del proyecto

```text
Backend/
├── src/
│   └── test/
│       ├── java/
│       │   └── karateRunner.java
│       └── resources/
│           └── REST/
│               ├── get.feature
│               ├── getid.feature
│               ├── user-post.feature
│               ├── user-put.feature
│               └── user-delete.feature
├── pom.xml
└── README.md
```

## Requisitos

* Java JDK 17 o superior
* Maven 3.9.x o superior

Verificar la instalación:

```bash
java -version
mvn -version
```

## Ejecución de las pruebas

Desde la carpeta raíz del proyecto ejecutar:

```bash
mvn test
```

También es posible ejecutar las pruebas desde IntelliJ IDEA mediante la clase:

```text
karateRunner.java
```

## Validaciones realizadas

Las pruebas incluyen:

* Validación de códigos HTTP.
* Validación de estructura de respuestas JSON.
* Validación mediante JSON Matchers de Karate.
* Escenarios positivos.
* Escenarios negativos.
* Validación de respuestas de error.
* Pruebas CRUD sobre usuarios.

## Reportes

Al finalizar la ejecución, Karate genera los reportes de ejecución automáticamente en la carpeta:

```text
target/karate-reports/
```


Proyecto desarrollado como parte del reto de automatización QA.
