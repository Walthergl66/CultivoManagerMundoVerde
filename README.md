
# 🌱 CultivoManager

**CultivoManager** es una aplicación backend desarrollada con **Spring Boot** que permite gestionar cultivos agrícolas, sensores ambientales, zonas de cultivo, usuarios y eventos de riego. Este proyecto forma parte de un sistema modular más amplio orientado a la innovación agrícola mediante la tecnología.

# 🧠 Lógica del Proyecto

El sistema está construido bajo una **arquitectura en N capas**, lo que permite una mayor organización, mantenibilidad y escalabilidad del código:

- **Controlador (Controller):** Maneja las peticiones HTTP entrantes.
- **Servicio (Service):** Contiene la lógica de negocio y reglas del dominio.
- **Repositorio (Repository):** Gestiona el acceso a la base de datos mediante Spring Data JPA.
- **Entidad (Model):** Representa las tablas del modelo relacional en Java.
---

# 🧩 Componentes principales

### 🔐 Seguridad

El sistema cuenta con **Spring Security** y autenticación mediante **JWT (JSON Web Tokens)**. Esto permite proteger los endpoints y garantizar el acceso solo a usuarios autenticados con roles específicos.


# 📦 Entidades del sistema

- **Usuario:** Permite la autenticación y la gestión de roles o permisos.
- **ZonaCultivo:** Representa una región delimitada del terreno agrícola.
- **Sensor:** Dispositivo que recolecta datos como humedad, temperatura, etc.
- **Cultivo:** Contiene los datos del tipo de cultivo sembrado.
- **Riego:** Registra los eventos de riego realizados de forma manual o automática.

# 🔗 Endpoints REST

Algunos ejemplos de rutas disponibles:

**http**
GET    /api/usuarios
POST   /api/cultivos
PUT    /api/sensores/{id}
DELETE /api/zonas/{id}


# 🔧 Tecnologías Usadas
**Java** 
**Spring Boot** 
**Spring Data JPA** 
**PostgreSQL**
**Maven**
**JUnit + Mockito**
**Lombok**

# Ejecutar el proyecto:
**mvn spring-boot:run**

# 👨‍💻 Autor
Walther Javier Gutierrez Loor