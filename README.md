# Insert Image Spring Boot 🌱

Aplicación basada en **Spring Boot v3.1.5** Permite almacenar imágenes en base64, recuperarlas por ID y convertirlas a formato de imagen en el sistema.

## Descripción 🔍

Aplicación que permite el almacenamiento de imágenes en formato base64 en una base de datos, utilizando una imagen Docker de PostgreSQL. Ofrece la capacidad de recuperar estas imágenes mediante un ID, convertirlas a su formato original y guardarlas en el directorio local.

## 🚀 Tecnologías y Dependencias

### Tecnologías principales

- **JDK 17**
- **Spring Boot**: v3.1.5
- **Base de datos**: PostgreSQL v16
- **Administrador de base de datos**: pgAdmin (versión: latest)
- **Docker**: v4.20

### Dependencias de Maven

```xml
<!-- Lombok para reducir boilerplate code -->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <optional>true</optional>
</dependency>

<!-- Web starter para el desarrollo web -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<!-- JPA para la persistencia de datos -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<!-- Docker Compose support -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-docker-compose</artifactId>
    <scope>runtime</scope>
    <optional>true</optional>
</dependency>

<!-- Driver para PostgreSQL -->
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>
```

## Funcionalidades 📐

### Almacenamiento de imágenes

**Endpoint**: `/upload`  
**Método**: `POST`

👨‍🚀 **Postman:** 

1. Abre Postman.
2. Selecciona el método POST.
3. Ingresa la URL del endpoint: http://localhost:8080/images/upload
4. Ve a la pestaña Body.
5. Selecciona form-data.
6. Agrega una clave file y selecciona el tipo File. Luego, carga tu imagen.
7. Presiona Send.

![Sin título](https://github.com/mndiazf/insert-image-spring-boot/assets/110750463/cea75a15-5b54-4813-84fa-b1a0fb1d77c6)
<br>
<br>

**Solicitud realizada con exito:**

![Captura](https://github.com/mndiazf/insert-image-spring-boot/assets/110750463/97568863-e8bd-4ecd-9a9a-0a23d8cea466)


**Base de datos:**

![Captura](https://github.com/mndiazf/insert-image-spring-boot/assets/110750463/ae2c89fc-ace6-49cb-b6ba-7c09876a1881)

<br>
<br>

## Recuperación por ID

**Endpoint**: `/download`  
**Método**: `GET`

👨‍🚀 **Postman:**

1. Abre Postman.
2. Selecciona el método GET.
3. Ingresa la URL del endpoint: http://localhost:8080/images/download/id-de-la-imagen.
4. Presiona Send.
   
<br>

![Captura](https://github.com/mndiazf/insert-image-spring-boot/assets/110750463/878b4960-4063-450d-96a4-4a44bb8d0aa4)


**Solicitud realizada con exito:**

![Captura](https://github.com/mndiazf/insert-image-spring-boot/assets/110750463/bbc72744-1034-4569-a209-dd971bda2451)

   
<br>

🌐  **Navegador:**

Simplemente introduce la URL en la barra de direcciones de tu navegador:

```bash
http://localhost:8080/images/download/1
```

<br>

<br>

# Instalación y Uso ⚙️

**Clonar el repositorio:**

```bash
git clone https://github.com/mndiazf/insert-image-spring-boot.git
```

**Navegar al directorio del proyecto:**

```bash
cd insert-image-spring-boot
```

**Instalar las dependencias:**

```bash
mvn install
```

**Ejecutar la aplicación:**

```bash
mvn spring-boot:run
```


## Desarrollador del Proyecto


<table>
    <tr>
        <td><img src="https://github.com/mndiazf/insert-image-spring-boot/assets/110750463/79e9fe0e-a55c-4b68-9e86-2929d9e24683" width="100"></td>
        <td>
            <strong>Nombre:</strong> Manolo Diaz  :pencil2:<br>
            <strong>Correo:</strong> mn.diaz.f@gmail.com  :envelope:<br>
            <strong>LinkedIn:</strong> https://www.linkedin.com/in/manolo-diaz-fernandez-215567224/  :briefcase:<br>
            <strong>GitHub:</strong> https://github.com/mndiazf  :octocat:
        </td>
    </tr>
</table>



