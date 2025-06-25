# 📝 Task API

### 🚀 Backend para una aplicación de lista de tareas (ToDo)
Este repositorio contiene el backend de una aplicación de lista de tareas (ToDo), diseñado para gestionar usuarios, autenticación y tareas. ¡Ideal para organizar tu día a día de forma eficiente!

---

## 🌟 **¿Qué hace esta API?**
Proporciona una API RESTful para:
- 📋 **Gestionar tareas**: Crear, editar, eliminar y marcar como completadas.
- 🔐 **Registrar y autenticar usuarios**: Manejo de cuentas y autenticación segura con **JSON Web Tokens (JWT)**.
- 🛡️ **Proteger rutas sensibles**: Solo usuarios autenticados pueden gestionar tareas.

---

## 🔧 **Características**
- ✅ CRUD completo para tareas.
- 🔐 Autenticación segura con JWT.
- 🔒 Rutas protegidas para manejar tareas de manera personalizada.
- 💾 Base de datos PostgreSQL para almacenamiento robusto.

---

## 📚 **Endpoints de la API**
### 🔑 **Autenticación**
- `POST /api/auth/register`  
  _Registra un nuevo usuario._

- `POST /api/auth/login`  
  _Inicia sesión y obtiene un token JWT._

### 📝 **Gestión de tareas**
- `GET /api/tasks`  
  _Obtiene todas las tareas del usuario autenticado._

- `POST /api/tasks`  
  _Crea una nueva tarea._

- `PUT /api/tasks/:id`  
  _Actualiza una tarea existente._

- `DELETE /api/tasks/:id`  
  _Elimina una tarea._

---

## 🛠️ **Cómo contribuir**
¡Tu ayuda es bienvenida! Sigue estos pasos para colaborar:

1. 🍴 Haz un fork del repositorio.
2. 🌱 Crea una nueva rama para tu funcionalidad (`git checkout -b nueva-funcionalidad`).
3. 💻 Realiza tus cambios y haz un commit (`git commit -am 'Agregué nueva funcionalidad'`).
4. 📤 Haz push a tu rama (`git push origin nueva-funcionalidad`).
5. 📨 Abre un Pull Request en GitHub.

---

## 📅 **Futuras Actualizaciones**
- 🌐 Internacionalización (soporte para múltiples idiomas).
- 🔔 Notificaciones para tareas pendientes.
- 📊 Panel de estadísticas sobre el progreso de tareas.
- 🌈 Interfaz gráfica para administradores.

---

## 🛡️ **Tecnologías Usadas**
- 🖥️ **Lenguaje**: Java.
- 🗄️ **Base de datos**: PostgreSQL.
- 🔑 **Autenticación**: JWT.

---

¡Gracias por visitar este repositorio! 🌟 Si tienes alguna sugerencia o encuentras un problema, no dudes en abrir un _issue_. 💬
