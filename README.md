# Task API

Backend de una aplicación de lista de tareas (ToDo), con funcionalidades para registrar usuarios, autenticación JWT y manejo de tareas (crear, editar, eliminar y marcar como completadas).

Este repositorio contiene el backend de una aplicación de lista de tareas (ToDo), con funcionalidades para gestionar tareas, usuarios y autenticación, implementado en **JAVA** y utilizando **PostgreSQL** como base de datos.

---

## **Descripción**

Este proyecto proporciona la API RESTful para una aplicación de lista de tareas (ToDo). Permite a los usuarios realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre tareas, así como gestionar su cuenta mediante autenticación y autorización usando JWT.

---

## **Características**

- CRUD para tareas (agregar, editar, eliminar, marcar como completadas).
- Autenticación de usuarios mediante JWT (JSON Web Tokens).
- Rutas protegidas por autenticación para gestionar las tareas.

---

## **Endpoints**

Aquí tienes una lista de los endpoints de la API:

### **Autenticación**

- `POST /api/auth/register`: Registra un nuevo usuario.
- `POST /api/auth/login`: Inicia sesión con un usuario registrado.

### **Tareas**

- `GET /api/tasks`: Obtiene todas las tareas del usuario autenticado.
- `POST /api/tasks`: Crea una nueva tarea.
- `PUT /api/tasks/:id`: Actualiza una tarea existente.
- `DELETE /api/tasks/:id`: Elimina una tarea.

---

## **Contribución**

Si deseas contribuir a este proyecto, sigue estos pasos:

- 1 - Haz un fork del repositorio.
- 2 - Crea una rama con tu nueva funcionalidad (git checkout -b nueva-funcionalidad).
- 3 - Realiza tus cambios y haz un commit (git commit -am 'Agregué nueva funcionalidad').
- 4 - Haz push a la rama (git push origin nueva-funcionalidad).
- 5 - Abre un Pull Request en GitHub.

