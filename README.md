# FOROHUB - CHALLENGE ALURA-LATAM

ForoHub es una plataforma diseñada para la gestión de foros en línea, permitiendo la creación, consulta, actualización y eliminación de tópicos. Este proyecto fue desarrollado como parte de un desafío propuesto por Alura Latam, aplicando conceptos avanzados de Java y Spring Boot, así como el uso de APIs REST y bases de datos.

## Características

- CRUD completo para la gestión de tópicos en el foro.
- Implementación de seguridad mediante JWT para la autenticación.
- Validación de datos en los endpoints REST.
- Migraciones automáticas de la base de datos usando Flyway.
- Manejo centralizado de errores mediante @ControllerAdvice.
- Documentación clara y estructura modular del código.

## Tecnologías Utilizadas

- Lenguaje de programación: Java
- Framework: Spring Boot
- Base de datos: MySQL

## Librerías y herramientas principales:
- spring-boot-starter-data-jpa para persistencia de datos.
- spring-boot-starter-security para la seguridad.
- spring-boot-starter-validation para validaciones.
- flyway-core para migraciones.
- spring-boot-starter-web para APIs REST.

## Endpoints Principales

- GET /topicos: Lista todos los tópicos.
- GET /topicos/{id}: Consulta un tópico por ID.
- POST /topicos: Crea un nuevo tópico.
- PUT /topicos/{id}: Actualiza un tópico existente.
- DELETE /topicos/{id}: Elimina un tópico por ID.

## Instalación y Configuración

1. Clona el repositorio:
    - git clone https://github.com/Juan-Valenzuela3/ForoHub.git
2. Configura las variables de entorno necesarias:

| Variable de entorno | Descripción |
   |---|---|
   | DB_HOST | Host de la base de datos |
   | DB_NAME | Nombre de la base de datos |
   | DB_USER | Usuario de la base de datos |
   | DB_PASSWORD | Contraseña del usuario de la base de datos |
   | JWT_SECRET | Clave secreta para JWT |

3. Asegúrate de tener Java 17+ y Maven instalados.
4. Ejecuta las migraciones de la base de datos con Flyway:
    - mvn flyway:migrate
5. Inicia la aplicación:
    - mvn spring-boot:run
6. Accede a la aplicación en http://localhost:8080.

## Autor

- Juan Valenzuela
- [GitHub](https://github.com/Juan-Valenzuela3)
- [LinkedIn](https://www.linkedin.com/in/juan-valenzuela-camelo)

## Licencia

Este proyecto está licenciado bajo la [Licencia MIT](./LICENSE).
