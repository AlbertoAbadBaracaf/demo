# SISCON - Sistema de Gestión de Empleados

SISCON es una aplicación de gestión de empleados desarrollada con Spring Boot siguiendo los principios de la Arquitectura Hexagonal (Ports and Adapters). Esta arquitectura permite una clara separación de responsabilidades y facilita la mantenibilidad y testabilidad del código.

## Características

- Gestión completa de empleados (CRUD)
- Arquitectura Hexagonal
- API RESTful
- Persistencia con PostgreSQL
- Validación de datos
- Manejo de excepciones centralizado

## Tecnologías utilizadas

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- PostgreSQL
- Lombok
- Maven

## Arquitectura

El proyecto sigue la Arquitectura Hexagonal, también conocida como "Ports and Adapters", que divide la aplicación en tres capas principales:

### Dominio

Contiene las entidades de negocio y la lógica de dominio:

- `domain/model`: Entidades de dominio (Employee)
- `domain/exception`: Excepciones específicas del dominio

### Aplicación

Contiene la lógica de aplicación y define los puertos (interfaces) para comunicarse con el exterior:

- `application/ports/input`: Puertos de entrada (casos de uso)
- `application/ports/output`: Puertos de salida (interfaces para persistencia)
- `application/service`: Implementaciones de los casos de uso

### Infraestructura

Contiene los adaptadores que implementan los puertos definidos en la capa de aplicación:

- `infrastructure/adapters/input/rest`: Controladores REST
- `infrastructure/adapters/output/persistence`: Implementación de persistencia

## Estructura del proyecto

```
src/main/java/com/siscon/demo/
├── SisconAbadApplication.java
├── application
│   ├── ports
│   │   ├── input
│   │   │   └── EmployeeServicePort.java
│   │   └── output
│   │       └── EmployeePersistencePort.java
│   └── service
│       └── EmployeeService.java
├── domain
│   ├── exception
│   │   └── EmployeeNotFoundException.java
│   └── model
│       ├── Employee.java
│       └── ErrorResponse.java
└── infrastructure
    ├── adapters
    │   ├── input
    │   │   └── rest
    │   │       ├── EmployeeRestAdapter.java
    │   │       ├── GlobalControllerAdvice.java
    │   │       ├── mapper
    │   │       └── model
    │   └── output
    │       └── persistence
    │           ├── EmployeePersistenceAdapter.java
    │           ├── entity
    │           │   └── EmployeeEntity.java
    │           ├── mapper
    │           │   └── EmployeePersistenceMapper.java
    │           └── repository
    │               └── EmployeeRepository.java
    └── utils
```

## Configuración

La aplicación utiliza PostgreSQL como base de datos. La configuración se encuentra en el archivo `application.yml`:

```yaml
spring:
  application:
    name: siscon-Abad
  jackson:
    default-property-inclusion: non_null
    property-naming-strategy: SNAKE_CASE
  datasource:
    url: ${DB_HOST:jdbc:postgresql://localhost:5432/siscon}
    username: ${DB_USER:postgres}
    password: ${DB_PASSWORD:postgres}
    driver-class-name: org.postgresql.Driver
  jpa:
    show-sql: true
    hibernate:
      ddl-auto: create
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
logging:
  level:
    org.hibernate.SQL: debug
    com.siscon.demo: debug
```

## Instalación y ejecución

### Requisitos previos

- Java 17 o superior
- Maven 3.6 o superior
- PostgreSQL 12 o superior

### Pasos para ejecutar

1. Clonar el repositorio:

```bash
git clone https://github.com/tu-usuario/siscon-abad.git
cd siscon-abad
```

2. Compilar y ejecutar la aplicación:

```bash
./mvnw clean install
./mvnw spring-boot:run
```

## API REST

La aplicación expone los siguientes endpoints:

### Obtener todos los empleados

```
GET /employees/v1/api
```

### Obtener un empleado por ID

```
GET /employees/v1/api/{idEmployee}
```

### Crear un nuevo empleado

```
POST /employees/v1/api
```

Cuerpo de la solicitud:

```json
{
  "firstname": "Marisol",
  "middlename": "Roberta",
  "lastname": "Abad",
  "secondsurname": "Nuñez",
  "age": "18",
  "gender": "Femenino",
  "birthdate": "1985-11-13",
  "position": "Desarrolador"
}
```

### Actualizar un empleado existente

```
PUT /employees/v1/api/{idEmployee}
```

Cuerpo de la solicitud: igual que en la creación.


## Contribución

Si deseas contribuir a este proyecto, por favor sigue estos pasos:

1. Haz un fork del repositorio
2. Crea una rama para tu funcionalidad (`git checkout -b feature/nueva-funcionalidad`)
3. Haz commit de tus cambios (`git commit -am 'Añadir nueva funcionalidad'`)
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`)
5. Crea un nuevo Pull Request

## Licencia

Este proyecto está licenciado bajo la Licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.