# First REST API Spring Application

# Project Overview
This is a simple REST API application built with Spring Boot that performs CRUD (Create, Read, Delete) operations on products. The application uses an H2 in-memory database and includes Swagger UI for API documentation.

# Technologies Used
- **Java 21**
- **Spring Boot 3.2.0**
- **Spring Web** - for REST API endpoints
- **Spring Data JPA** - for database operations
- **H2 Database** - in-memory database
- **Spring Boot DevTools** - for automatic restarts
- **Swagger UI (OpenAPI 3.0)** - for API documentation

# Project Structure
src/main/java/pl/edu/vistula/firstrestapispring/
├── product/
│ ├── api/
│ │ ├── ProductController.java
│ │ ├── request/
│ │ │ └── ProductRequest.java
│ │ └── response/
│ │ └── ProductResponse.java
│ ├── domain/
│ │ └── Product.java
│ ├── repository/
│ │ └── ProductRepository.java
│ ├── service/
│ │ └── ProductService.java
│ └── support/
│ ├── ProductMapper.java
│ ├── GlobalExceptionHandler.java
│ └── exception/
│ ├── ProductNotFoundException.java
│ └── ProductExceptionSupplier.java
├── shared/
│ └── api/
│ └── response/
│ └── ErrorMessageResponse.java
└── Task22Application.java
# Prerequisites
- Java 21 or 17
- Maven
- IntelliJ IDEA (or any Java IDE)
- Postman (for testing)

# How to Run the Application

# Using IntelliJ IDEA
1. Open the project in IntelliJ IDEA
2. Wait for Maven dependencies to download
3. Navigate to `Task22Application.java`
4. Click the green Run button 

# Using Maven Command Line
```bash
mvn spring-boot:run

# Swagger UI

![Swagger UI](screenshots/swagger-ui.png)

# Testing with Postman

# 1. Create a Product (POST)

![Create Product](screenshots/postman-create.png)

# 2. Get All Products (GET)

![Get All Products](screenshots/postman-get-all.png)

# 3. Get Product by ID (GET)

![Get Product by ID](screenshots/postman-get-by-id.png)

# 4. Delete Product (DELETE)

![Delete Product](screenshots/postman-delete.png)

# 5. Error Response (Product Not Found)

![Error Response](screenshots/postman-error.png)

# H2 Database Console

![H2 Console](screenshots/h2-console.png)