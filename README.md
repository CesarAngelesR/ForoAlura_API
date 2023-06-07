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
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/99fac27c-4531-4332-8369-ada97017fe6d">
</p>

Se habilitara el Request body donde colocaremos el email y contraseña en formato JSON que por origen es:

`{
  "email": "admin@admin",
  "contrasena": "123456"
}`

Asimismo se hablilitaran los botones "Execute", "Cancel" y "Reset". El boton "Cancel" nos regresara el boton "Try it out" y el boton "Reset" reinciciara el Request body. De click en "Execute" una vez se ingresen los datos requeridos de Request body para ejecutar el metodo. 

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/c8b076ce-14fc-497d-97d6-6de2d58c1f91">
</p>

Se desplegara el Response body con informacion dentro la cual es un JWT Token el cual debemos de "copiar unicamente" lo que se encuentra entre comillas.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/5c5c6f59-5657-4ccc-b741-d103c4194530">
</p>

Posteriormente hacemos click en el boton "Authorice" que se encuentra del lado derecho de la pantalla en la parte superior. 

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/5377593a-30f2-4839-b2d6-fa40b73d907e">
</p>

Se presentara un cuadro de dialogo en el cual pegaremos el JWT Token dentro del cuadro "Value" y hacemos click en "Authorize". Se colocolara un cuadro de dialogo donde se podra hacer "Logout" para salir o "Close" para cerrar el cuadro de dialogo y continuar con al documentacion. Hacemos click en close. 

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/07041b55-5998-4d2e-bcb5-5536d2a142a7">
</p>

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/f45dba36-cd89-4009-abf9-64adc78724ce">
</p>

- `Registrar topico:` Una vez hecho el "login" documentaremos cada uno de los metodos del "topicos-controller" haremos click en "Post/topicos" donde registraremos un nuevo topico.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/07db8ec2-a9cf-42a1-972d-bb81156559b2">
</p>

Se desplegara la informacion del metodo "Post/topicos" y haremos click en "Try it out" para habilitar el Request body.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/c53c511c-231c-4b30-ba2a-f1732d9ae32e">
</p>

Se desplegara informacion y tambian se habilitara el Request body donde mediante formato JSON solicitara informacion para el regitro del topico. La informacion que solicita es:

`{
  "titulo": "Se coloca en este campo el titulo del topico",
  "mensaje": "En este campo se coloca el mensaje que se descea colocar",
  "autor": "Se coloca el nombre de la persona que registra el topico",
  "curso": "Se coloca el curso en el cual se tiene la duda o sugerencia. Es importante informar que este campo es de seleccion multiple y unicamente se pueden colocar 4 cursos: Front_End, Back_End, MySQL, Soft_Skills"
}`

Una vez se llenen los requerimientos solicitados del metodo se da click en el boton "Execute" para ejecutar el metodo.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/6fc8903e-de54-4fef-95ea-9a17824d3d7f">
</p>

En caso de omitir alguno de los campos solicitados se regresara un mensaje de error 400 en el Response body informando que el campo no debe ser nulo.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/a6dbab19-c602-47ac-b2b6-99c2647d9f29">
</p>

Ejecutando correctamente el meotodo, nos arrojara un codigo 201 y el Response body nos dara un mensaje con el registro realizado incluyendo el "Id", la fecha de crecion y con el Status quedando finalemnte el topico registrado. 

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/7ce2fa6b-8ba4-4b2c-87f1-31be7a8e3077">
</p>

El campo Status tambien es de seleccion multiple y se encuentra como Enum:
NO_RESPONDIDO, NO_SOLUCIONADO, SOLUCIONADO, CERRADO. Al momento de registrar se pondrá como "NO_RESPONDIDO" en automatico y posteriormente al momento de editar el topico sera posible cambiarlo.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/eca6ffae-ce81-457c-8fc9-fccd4646d36d">
</p>

El boton "Clear" limpia el Request body. El boton "Cancel" cierra el Request body y el boton Reset regresa el metodo a su estado posterior y regresa el boton "Try it out".

- `Edicion de topico:` Para editar un topico guardado hacemos click en "PUT/topicos" posteriormente hacemos click en el boton "Try it out" para habilitar el Request body.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/098b268c-f8f6-4502-9752-3e517c24bf52">
</p>

En el Request body debemos de colocar necesarimente el numero de "Id" para indicarl el topico que vamos a modificar. El los campos "Status" y "Curso" debemos considerar que son Enum y que unicamente se tiene que colocar alguno de las opciones disponibles.

Status: Front_End, Back_End, MySQL, Soft_Skills.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/eca6ffae-ce81-457c-8fc9-fccd4646d36d">
</p>

Curso: NO_RESPONDIDO, NO_SOLUCIONADO, SOLUCIONADO, CERRADO.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/ed7af2d3-a170-45c3-ae96-3e7e2aa8ca3b">
</p>

En el JSON del Request body vamos ca colocar el "Id" y el campo a modificar, ejemplo vamos a modificar "titulo" y "mensaje" del topico con "Id" no. 4.

`{
  "id": 5,
  "titulo": "¿Duda sobre Querys de MySQL",
  "mensaje": "¿Las Querys de MySQL tambien se escriben en mayusculas en el archivo SQL del migrate?"
}`

y damos click en "Execute" para ejecutar el metodo.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/abb0d6ca-650c-4aba-bd3e-b11608f48fdc">
</p>

Nos aparecera un codigo 200 y en el Response body el topico con las modificaciones realizadas.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/516c811c-330f-4e67-9dac-a2d050fd61e7">
</p>

- `Lista de Topicos:` Para listar los topicos regitrados hacermos click el "GET/topicos" y hacemos click en "Try it out" para habiliar el Request body. En el Request body unicamente colocaremos en el JSON una llave abriendo y otra llave cerrando "{}" y damos click en "Execute".

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/1e015391-d1dc-4ae4-b3ad-606fe549011f">
</p>

Nos aparecera un codigo 200 y en el Response body una lista en formato JSON con la informacion de todos los topicos registrados.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/37e7145c-36ac-425c-8a85-dd589083a65a">
</p>

- `Busqueda de topico por Id:`  Para hacer una busqueda por "Id" hacemos click en "GET/topicos{id}" y porteriomente en "Try it out" para habilitar el Request body y colocar el "Id" y hacer click en "Execute" para ejecutar el metodo. En el ejemplo buscamos el topico con  "Id" no. 5.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/7ac18bed-fbc7-4dbf-a885-d14ced2e5502">
</p>

No aparecera un codigo 200 y en el Response body nos aparece el topico seleccionado en el "Id".

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/ba1dcfbc-38d5-4f2d-9b65-c3af3126fe4f">
</p>

- `Eliminar topico`: Para eliminar un topico damos click en "DELETE/topicos{id}"y posteriormente en "Try it out" para habilitar el Request body y colocar el "Id" y hacer click en "Execute" para ejecutar el metodo.En el ejemplo eliminaremos el topico con  "Id" no. 5.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/fb055e2e-dc67-4f27-aa42-1fe61bd7f00a">
 </p>

Nos dara un codigo 200 con un "OK" lo cual indica que se elimino el registro.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/638b6f58-a3c8-4cb2-9b2e-d4e34870a72c">
</p>

Si visualizamos la tabla topicos veremos que fue eliminado el topico con "Id" no. 5.

<p align="center" >
     <img width="500" heigth="500" src="https://github.com/CesarAngelesR/ForoAlura_API/assets/123194477/0fdbc895-1b7c-49d2-97fd-76fc85e9d6f5">
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
