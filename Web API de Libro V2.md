# Estudiante: Contrera Segido Jhon Jairo
# Materia: Aplicaciones Distribuidas
# Curso: SIN-S-MA-5-8

### Notas sobre la Migración del Repositorio

Intenté mover este proyecto a un nuevo repositorio en GitHub, pero tuve problemas técnicos. Al empujar los cambios, encontré errores porque el repositorio remoto tenía cambios que yo no tenía localmente. Aunque intenté resolverlo con un `git pull`, no pude completar la fusión. Al final, los cambios se quedaron en el repositorio original en lugar del nuevo. Fue frustrante no poder trasladar el proyecto como había planeado.



## Cambios Recientes

### Versión 1.5 (01/06/2024)

- **Cambios para esta nueva Versión**:
- El controlador LibroController con la nueva funcionalidad para enviar el estado de CREATE al crear un nuevo libro:
![Funcionalidad - Controller](https://github.com/Jhoncito07/Project_Libros/assets/151545686/4908e8c0-34aa-4d83-a187-a4eb1e20db8c)

- Ahora, cuando se crea un nuevo libro, se envía el estado de "CREATE" como parte de la respuesta.
  ![Postman - Create y mensaje](https://github.com/Jhoncito07/Project_Libros/assets/151545686/05ddbf36-8bb8-4f8f-a143-20e76544f2f4)

### `GlobalException`
Controlador de excepciones global que maneja todas las excepciones no capturadas en la aplicación, proporcionando una forma consistente de manejar errores en toda la aplicación.
![GlobalExeption](https://github.com/Jhoncito07/Project_Libros/assets/151545686/c7d883cb-b6cf-4a4c-84b1-e52499d6717e)

### `LibroException`
Excepción personalizada para errores específicos relacionados con operaciones de libros, como cuando un libro solicitado no se encuentra en la base de datos. Proporciona un mensaje claro y específico para ayudar a identificar y solucionar el problema.
![LibroExeption](https://github.com/Jhoncito07/Project_Libros/assets/151545686/466859d1-11be-423c-8f36-78d09cb750cc)


### En "LibroController"
Este método `getLibro(int id)` busca un libro por su ID. Si el libro no se encuentra, lanza una excepción `LibroException` con un mensaje indicando que el libro con el ID especificado no se encuentra. Si el libro se encuentra, lo devuelve.
![libroExeption](https://github.com/Jhoncito07/Project_Libros/assets/151545686/049e0e38-7a96-431d-8315-61065fa032c9)


- **Prueba en (PostMan)**: Ahora, cuando se consulta un libro por su ID y no existe, se lanza una excepción `LibroException`, enviando el estado `NOT_FOUND` junto con un mensaje personalizado.
  - Esto garantiza una mejor gestión de errores y una respuesta clara cuando se intenta acceder a un libro que no existe en la base de datos.

- **Corrección de Error**: Se solucionó un problema en el que no se manejaba correctamente la situación cuando se solicitaba un libro que no existía. Ahora, se lanza una excepción `LibroException` con el estado `NOT_FOUND` y un mensaje personalizado.
  - Esto mejora la robustez de la aplicación y proporciona una respuesta adecuada en caso de que un usuario intente acceder a un libro inexistente.

![Not_Found](https://github.com/Jhoncito07/Project_Libros/assets/151545686/d1f29a3b-4067-4c55-bd81-7e44c70973a1)
![Not_found](https://github.com/Jhoncito07/Project_Libros/assets/151545686/73556979-ad87-42e9-b9a5-0234675b11f9)

## Estructura del Proyecto (Versión 1.5)

![estructura](https://github.com/Jhoncito07/Project_Libros/assets/151545686/f488cdb3-103e-4d56-bf9c-fa936527e320)

## Recursos

- [Documentación de Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
- [Guía de Postman](https://learning.postman.com/docs/getting-started/introduction/)
- [Markdown Guide](https://www.markdownguide.org/)






