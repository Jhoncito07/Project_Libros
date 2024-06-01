## FACULTAD DE INGENIERIA INDUSTRIAL
## CARRERA DE SISTEMAS DE LA INFORMACIÓN
## Estudiante: Contrera Segido Jhon Jairo
## Materia: Aplicaciones Distribuidas
## Curso: SIN-S-MA-5-8



# Libros API

Este proyecto es una API RESTful desarrollada en Spring Boot para gestionar una colección de libros. Proporciona endpoints para obtener todos los libros, obtener un libro por su ID y agregar nuevos libros.

## Tecnologías Utilizadas

- **Java 11**
- **Spring Boot 2.5.4**
- **Maven**
- **H2 Database (para pruebas)**
- **Postman (para pruebas de API)**

### Prerrequisitos

Asegúrate de tener instalados los siguientes programas:

- [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [Git](https://git-scm.com/)
- [Postman](https://www.postman.com/downloads/)

## Probar la API y Capturas de Pantalla de las Pruebas

Podemos usar Postman para probar los diferentes endpoints de la API.

![image](https://github.com/Jhoncito07/Project_Libros/assets/151545686/c6728f66-6b21-4c8d-b6d0-64a9b7d263f4)


### Obtenemos Todos los Libros

- **Método:** `GET`
- **URL:** `http://localhost:8080/libros`
- **Descripción:** Obtenemos la lista de todos los libros disponibles.

### Captura de Muestra
  
![image](https://github.com/Jhoncito07/Project_Libros/assets/151545686/14eb918f-ebc3-4735-a584-38fb26c4c2f3)


### Obtenemos un Libro por su ID

- **Método:** `GET`
- **URL:** `http://localhost:8080/libros/{id}`
- **id:** ID del libro a obtener
- **Descripción:** Obtenemos un libro específico basado en el ID.

### Captura de Muestra

![image](https://github.com/Jhoncito07/Project_Libros/assets/151545686/6f76e771-f977-4c80-bf2c-797a7ac31232)
![image](https://github.com/Jhoncito07/Project_Libros/assets/151545686/f245db98-c958-45cf-a821-2f7b6408c146)


### Agregamos un Nuevo Libro

- **Método:** `POST`
- **URL:** `http://localhost:8080/libros`
- **Descripción:** Agregamos un nuevo libro a la colección.

### Captura de Muestra

![image](https://github.com/Jhoncito07/Project_Libros/assets/151545686/7018fecc-3d41-42f8-879d-1ff34c6686b1)
![image](https://github.com/Jhoncito07/Project_Libros/assets/151545686/0ec84487-226a-45c3-90cf-32ad6f425ef5)
![image](https://github.com/Jhoncito07/Project_Libros/assets/151545686/6b198a27-12ee-4f29-a3e2-98642b80bdc6)


## Captura de la Estructura y Descripción de Carpetas y Archivos

![image](https://github.com/Jhoncito07/Project_Libros/assets/151545686/bb420090-5049-4a22-964d-2c1efb4814fa)


- **.vscode/**: Configuraciones específicas de Visual Studio Code.
  - `launch.json`: Configuración de inicio para depuración.
  - `settings.json`: Configuraciones de usuario y proyecto.

- **libros/**: Directorio raíz del proyecto Spring Boot.
  - **.mvn/**: Archivos de configuración de Maven Wrapper.
  - **src/**: Contiene el código fuente del proyecto.
    - **main/**:
      - **java/com/demo/libros/**: Paquete base del proyecto.
        - **controllers/**: Contiene los controladores REST.
          - `LibroController.java`: Controlador que maneja las solicitudes HTTP relacionadas con los libros.
        - **models/**: Contiene las clases de modelo.
          - `Libro.java`: Clase de modelo que representa un libro.
        - **repositories/**: Contiene las interfaces y clases de repositorios.
          - `LibroRepository.java`: Interfaz del repositorio de libros.
          - `LibroRepositoryDemo.java`: Implementación de demostración del repositorio de libros.
          - `LibroRepositoryImpl.java`: Implementación del repositorio de libros.
        - **services/**: Contiene las interfaces y clases de servicios.
          - `LibroService.java`: Interfaz del servicio de libros.
          - `LibroServiceImpl.java`: Implementación del servicio de libros.
        - `HolaSpringApplication.java`: Clase principal que inicia la aplicación Spring Boot.

- **.gitignore**: Archivo que especifica qué archivos y directorios deben ser ignorados por Git.
- **mvnw** y **mvnw.cmd**: Scripts para ejecutar Maven Wrapper.
- **pom.xml**: Archivo de configuración de Maven que gestiona las dependencias del proyecto.
- **README.md**: Archivo el cual estamos leyendo, que contiene la documentación del proyecto.


## Recursos

- [Documentación de Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
- [Guía de Postman](https://learning.postman.com/docs/getting-started/introduction/)
- [Markdown Guide](https://www.markdownguide.org/)
