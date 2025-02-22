# Ecomerce_Task
Full Stack Java Project for Product Management
# Spring Boot Category & Product API

This project is a **Spring Boot REST API** for managing **categories and products** with a **one-to-many relationship**. It supports **CRUD operations** and **pagination** using **Spring Data JPA**.

---

## 🚀 Features

- CRUD operations for **Categories** and **Products**
- **One-to-Many Relationship** (One Category → Multiple Products)
- **Server-side Pagination** for fetching data
- **Spring Security Integration**
- **Exception Handling** for better error responses
- Uses **Spring Boot, JPA, Hibernate, and MySQL/PostgreSQL**

---
## 🛠 Technologies Used

- **Spring Boot** (REST APIs)
- **Spring Data JPA & Hibernate**
- **Spring Security** (if enabled)
- **MySQL / PostgreSQL** (Database)
- **Maven** (Dependency Management)

---

## 📌 API Endpoints

### 📂 **Category APIs**

| Method   | Endpoint                 | Description                        |
| -------- | ------------------------ | ---------------------------------- |
| `GET`    | `/api/categories?page=1` | Get all categories with pagination |
| `POST`   | `/api/categories`        | Create a new category              |
| `GET`    | `/api/categories/{id}`   | Get category by ID                 |
| `PUT`    | `/api/categories/{id}`   | Update category by ID              |
| `DELETE` | `/api/categories/{id}`   | Delete category by ID              |

### 📂 **Product APIs**

| Method   | Endpoint               | Description                               |
| -------- | ---------------------- | ----------------------------------------- |
| `GET`    | `/api/products?page=1` | Get all products with pagination          |
| `POST`   | `/api/products`        | Create a new product                      |
| `GET`    | `/api/products/{id}`   | Get product by ID (with category details) |
| `PUT`    | `/api/products/{id}`   | Update product by ID                      |
| `DELETE` | `/api/products/{id}`   | Delete product by ID                      |

---

## 🔧 Setup & Installation

### 1️⃣ Clone the Repository

```sh
git clone https://github.com/your-username/your-repo.git
cd your-repo

### 2️⃣ Configure Database in application.properties
```sh
spring.datasource.url=jdbc:mysql://localhost:3306/demo_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

### 3️⃣ Run the Application
mvn spring-boot:run

### 4️⃣ Test using Postman/cURL
curl -X GET http://localhost:8080/api/categories?page=1

---

## 📂 Project File Structure
```bash
src/main/java/com/nimap/
 ├── controller/
 │   ├── CategoryController.java
 │   ├── ProductController.java
 ├── entity/
 │   ├── Category.java
 │   ├── Product.java
 ├── repository/
 │   ├── CategoryRepository.java
 │   ├── ProductRepository.java
 ├── service/
 │   ├── CategoryService.java
 │   ├── ProductService.java
 ├── exception/
 │   ├── ResourceNotFoundException.java
 ├── Application.java
'''
