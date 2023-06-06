# ▶️ API Rest | Foro Alura

<p align="center" >
     <img width="300" heigth="300" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/4fb8a7bc-df65-416d-95f3-e623f107865c">
</p>

##  :bookmark_tabs: Indice:

* [Descripcion del Proyecto](#pencil-descripcion-del-proyecto)

* [Estado del proyecto](#chart_with_upwards_trend-estado-del-proyecto)

* [Características de la aplicación y demostración](#white_check_mark-características-de-la-aplicación-y-demostración)

* [Tecnologías utilizadas](#%EF%B8%8F-tecnologías-utilizadas)

* [Personas Contribuyentes](#construction_worker-personas-contribuyentes)

---
## :pencil: Descripcion del Proyecto:

API Rest Foro Alura. El foro alura es un lugar donde todos los alumnos de la plataforma Alura pueden colocar sus preguntas sobre determinados cursos, este mágico lugar está lleno de mucho aprendizaje y de colaboración entre alumnos, profesores y moderadores.

Esta API replica a nivel de back end este proceso usando Spring.

Nuestra API va a centrarse específicamente en los tópicos, y debe permitir a los usuarios:

- Crear un nuevo tópico
- Mostrar todos los tópicos creados
- Mostrar un tópico específico
- Actualizar un tópico
- Eliminar un tópico
- Es lo que conocemos comúnmente como CRUD (CREATE, READ, UPDATE, DELETE).

Asimismo, se implementa un mecanismo de autenticación en la API, para que solo los usuarios autenticados puedan interactuar con ella.

<p align="center" >
     <img width="300" heigth="300" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/c0570b3c-96d6-433d-9ce4-837302048347">
</p>

---
## :chart_with_upwards_trend: Estado del proyecto:

<h4 align="center">
:construction: Proyecto en construcción :construction:
</h4>

### Proyecto inicial, se agregaran mas funcionalidades en el futuro.

---

## :white_check_mark: Características de la aplicación y demostración:

- `Inicio de documentacion`: Para la documentacion de la API utilizaremos Swagger UI V2.1.0. Ingresamos a la dirección para iniciar una vez este corriendo el servidor de Spring Boot:
http://localhost:8080/swagger-ui/index.html

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/6f0a65d6-20ac-4d5d-910e-cc07c68742b3">
</p>

- `Hello`: Para verificar que la API se encuentra ejecutandose hacemos click en "GET/hello" del "hello-controller". 

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/b00b8eba-479a-469f-9d03-9d336520fad2">
</p>

Una vez hecho click se desplegara informacion sobre el metodo "GET/hello" del "hello-controller" y en ella haremos click en el boton "Try it out".

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/9c6d7063-f191-429c-b9ea-3763d52ca6fe">
</p>

Una vez hecho click se nos presentara un boton azul tamaño grande con el nombre "Execute" en el cual haremos click para ejecutar el metodo.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/5d26699f-81d8-417f-a536-1dcf378feea3">
</p>

Se deplegara el mensaje en Response body "Hello world from Mexico!" asimismo, se presentaran los botones "Execute", "Clear" y "Cancel". "Execute" volvera a ejecutar el metodo, "Clear" regresa al estado anterior al metodo y "Cancel" regresara al boton "Try it out"

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/dacb9906-954f-4d4c-ad85-678b7934cc02">
</p>

- `Login`: Para poder acceder a los metodos del "topicos-controller" es necesario que hagamos "login" para ello en el "autenticacion-controler" hacemos click en "POST/login"

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/14c44a1c-344c-4e8a-bfa0-7ff2f43d6e30">
</p>

Se desplegara informacion sobre el metodo y en ella haremos click en el boton "Try it out".

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/898b73f9-70da-4b60-ad14-ee9a62e42d4c">
</p>

Se habilitara el Request body donde colocaremos el email y contraseña en formato JSON que por origen es:

`{
  "email": "admin@admin",
  "contrasena": "123456"
}`

Asimismo se hablilitaran los botones "Execute", "Cancel" y "Reset". De click en "Execute" una vez se ingresen los datos requeridos de Request body para ejecutar el metodo. El boton "Cancel" nos regresara el boton "Try it out" y el boton "Reset" reinciciara el Request body.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/c8b076ce-14fc-497d-97d6-6de2d58c1f91">
</p>

Se desplegara el Response body con informacion dentro la cual es un JWT Token el cual debemos de "copiar unicamente" lo que se encuentra entre comillas.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/API-REST-1/assets/123194477/7d8ef3cf-92a4-4ed1-acc0-b4a730658be2">
</p>

Posteriormente hacemos click en el boton "Authorice" que se encuentra del lado derecho de la pantalla en la parte superior. 

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/API-REST-1/assets/123194477/68ec5bd6-d3f3-415d-bb7a-fe430e42de0c">
</p>

Se presentara un cuadro de dialogo en el cual pegaremos el JWT Token dentro del cuadro "Value" y hacemos click en "Authorize". Se colocolara un cuadro de dialogo donde se podra hacer "Logout" para salir o "Close" para cerrar el cuadro de dialogo y continuar con al documentacion. Hacemos click en close. 

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/API-REST-1/assets/123194477/a4a1c891-eb24-4e31-ada7-f50320c29a7e">
</p>

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/API-REST-1/assets/123194477/fe38cab3-9b4b-4fce-8490-9818e9a76453">
</p>

- `Registrar topico:` Una vez hecho el "login" documentaremos cada uno de los metodos del "topicos-controller" haremos click en "Post/topicos" donde registraremos un nuevo topico.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/API-REST-1/assets/123194477/5db234bc-cda5-4e27-8efc-195fb66cb5e3">
</p>

Se desplegara la informacion del metodo "Post/topicos" y haremos click en "Try it out" para habilitar el Request body.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/API-REST-1/assets/123194477/54ae1287-c415-4600-aeaa-7d1f25677385">
</p>

Se desplegara informacion y tambian se habilitara el Request body donde mediante formato JSON solicitara informacion para el regitro del topico. La informacion que solicita es:

`{
  "titulo": "Se coloca en este campo el titulo del topico",
  "mensaje": "En este campo se coloca el mensaje que se descea colocar",
  "autor": "Se coloca el nombre de la persona que registra el topico",
  "curso": "Se coloca el curso en el cual se tiene la duda o sugerencia. Es importante informar que este campo es de seleccion multiple y unicamente se pueden colocar 4 cursos: Front_End, Back_End, MySQL, Soft_Skills"
}`

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/API-REST-1/assets/123194477/d60178cc-f82a-4e3e-a57d-e35e44dcae90">
</p>

Una vez se llenen los requerimientos solicitados del metodo se da click en el boton "Execute" para ejecutar el metodo.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/API-REST-1/assets/123194477/7246d6ea-b659-4760-82cf-fabc5340cf59">
</p>

En caso de omitir alguno de los campos solicitados se regresara un mensaje de error 400 en el Response body informando que el campo no debe ser nulo.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/API-REST-1/assets/123194477/f1ea77cc-cbd8-4cb3-b98f-1d44a925c1e5">
</p>

Ejecutando correctamente el meotodo, nos arrojara un codigo 201 y el Response body nos dara un mensaje con el registro realizado incluyendo el "Id", la fecha de crecion y con el Status quedando finalemnte el topico registrado. 

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/API-REST-1/assets/123194477/586e60d5-1828-4da8-a0ea-9ff2322a3488">
</p>

El campo Status tambien es de seleccion multiple y se encuentra como Enum:
NO_RESPONDIDO, NO_SOLUCIONADO, SOLUCIONADO, CERRADO. Al momento de registrar se pondrá como "NO_RESPONDIDO" en automatico y posteriormente al momento de editar el topico sera posible cambiarlo.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/API-REST-1/assets/123194477/c03b9fb5-7b94-4947-a009-7bd167238f83">
</p>

El boton "Clear" limpia el Request body. El boton "Cancel" cierra el Request body y el boton Reset regresa el metodo a su estado posterior y regresa el boton "Try it out".

- `Edicion de topico:` Para editar un topico guardado hacemos click en "PUT/topicos" posteriormente hacemos click en el boton "Try it out" para habilitar el Request body.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/API-REST-1/assets/123194477/f68ed9ec-868a-47cf-80da-f5447c4de320">
</p>

En el Request body debemos de colocar necesarimente el numero de "Id" para indicarl el topico que vamos a modificar. El los campos "Status" y "Curso" debemos considerar que son Enum y que unicamente se tiene que colocar alguno de las opciones disponibles.

Status: Front_End, Back_End, MySQL, Soft_Skills.
Curso: NO_RESPONDIDO, NO_SOLUCIONADO, SOLUCIONADO, CERRADO.

En el JSON del Request body vamos ca colocar el "Id" y el campo a modificar, ejemplo vamos a modificar "titulo" y "mensaje" del topico con "Id" no. 4.

`{
  "id": 4,
  "titulo": "Certificado",
  "mensaje": "¿Cual es la manera de obtener el certificado del curso?"
}`
y damos click en "Execute" para ejecutar el metodo.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/API-REST-1/assets/123194477/2d47b91e-1c47-402d-b53d-9b8c41891dd5">
</p>

Nos aparecera un codigo 200 y en el Response body el topico con las modificaciones realizadas.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/API-REST-1/assets/123194477/72da65b3-4997-4152-ba09-6c99ec3fd191">
</p>

- `Lista de Topicos:` Para listar los topicos regitrados hacermos click el "GET/topicos" y hacemos click en "Try it out" para habiliar el Request body. En el Request body unicamente colocaremos en el JSON una llave abriendo y otra llave cerrando "{}" y damos click en "Execute".

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/API-REST-1/assets/123194477/51dc0b49-ca0b-41bf-9b02-11cf8a53980b">
</p>

Nos aparecera un codigo 200 y en el Response body una lista en formato JSON con la informacion de todos los topicos registrados.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/API-REST-1/assets/123194477/500403ef-1985-40c5-8b1d-632f9fab550c">
</p>

- `Busqueda de topico por Id:`  Para hacer una busqueda por "Id" hacemos click en "GET/topicos{id}" y porteriomente en "Try it out" para habilitar el Request body y colocar el "Id" y hacer click en "Execute" para ejecutar el metodo. En el ejemplo buscamos el topico con  "Id" no. 4.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/API-REST-1/assets/123194477/31a67fe8-17d7-47a1-b10a-7834e475fa25">
</p>

No aparecera un codigo 200 y en el Response body nos aparece el topico seleccionado en el "Id".

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/API-REST-1/assets/123194477/d6541c78-169c-4987-9489-33cd1ec19ba5">
</p>

- `Eliminar topico`: Para eliminar un topico damos click en "DELETE/topicos{id}"y posteriormente en "Try it out" para habilitar el Request body y colocar el "Id" y hacer click en "Execute" para ejecutar el metodo.En el ejemplo eliminaremos el topico con  "Id" no. 4.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/API-REST-1/assets/123194477/b6be4352-3a8d-4d01-98d9-653c9982a3b9">
 </p>

Nos dara un codigo 200 con un "OK" lo cual indica que se elimino el registro.

Si visualizamos la tabla topicos veremos que fue eliminado el topico con "Id" no. 4.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/API-REST-1/assets/123194477/1797def9-9248-4e1a-9308-060388e81e92">
</p>

---

## 🖥️ Tecnologías Utilizadas:

- Java
- Eclipse
- Spring Boot
- MySql
- Spring Security
- Spring Framework
- Lombok
- Flyway
- Auth0
- Springdoc Swagger
---

## :construction_worker: Personas Contribuyentes:

| [<img src="https://avatars.githubusercontent.com/u/123194477?v=4" width=115><br><sub>Cesar Angeles Rodriguez</sub>](https://github.com/CesarAngelesR) |  [<img src="https://avatars.githubusercontent.com/u/101413385?v=4" width=115><br><sub>Alura Latam Profes</sub>](https://github.com/aluralatamprofes) |  [<img src="https://avatars.githubusercontent.com/u/91544872?v=4" width=115><br><sub>Génesys Rondón</sub>](https://github.com/genesysaluralatam) |
| :---: | :---: | :---: |

# API-REST-Foro-Alura
