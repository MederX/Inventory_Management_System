# Inventory Management System

## Project Overview
This project is an Inventory Management System built using Spring Boot. The system integrates with a MySQL database and exposes REST APIs for managing products, categories, and inventory stock levels. The project includes Swagger for API documentation.

## Entities

### Product
- Tracks information about individual items in inventory.

### Category
- Groups related products (e.g., Electronics, Groceries).

### Inventory
- Tracks stock levels for products.

## Relationships
- A Category can have multiple Products.
- Each Product is associated with a single Category.

## Features

### CRUD Operations
- Create, Read, Update, and Delete for Product and Category.

### Inventory Management
- Add stock for a product.
- Deduct stock for a product (with quantity validation).
- Check stock levels.

### Search and Filter
- Filter products by Category.
- Search products by name.

### Reports
- Generate a report of low-stock products (e.g., stock < 10).

### Validation
- Validate inputs using `javax.validation` annotations.

## Spring Boot Dependencies
- **Spring Web**: For RESTful API.
- **Spring Data JPA**: For database interaction.
- **MySQL Driver**: For MySQL integration.
- **Validation**: For input validation.
- **Spring Boot DevTools** (optional): For rapid development.
- **Swagger**: For API documentation.

## Getting Started

### Prerequisites
- Java 11 or higher
- Maven
- MySQL

### Installation
1. Clone the repository:
    ```sh
    git clone https://github.com/your-username/inventory-management-system.git
    ```
2. Navigate to the project directory:
    ```sh
    cd inventory-management-system
    ```
3. Configure the MySQL database in `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/your-database-name
    spring.datasource.username=your-username
    spring.datasource.password=your-password
    spring.jpa.hibernate.ddl-auto=update
    ```
    ### Running the Application
   just run in the intellij
   ### API Documentation
- Access the Swagger UI at `http://localhost:8080/swagger-ui.html` for API documentation and testing.

- how to test the application

- 1) Create a Category
Request: POST /api/categories
Body: 
{
    "name": "Electronics"
}

-----------------------------
2) Get All Categories: 
Request: GET /api/categories

------------------------------------
3) Get a Category by ID:
id == int
Request: GET /api/categories/{id}

--------------------------------------
4) Update a Category
Request: PUT /api/categories/{id}
Body:
{
    "name": "Updated Electronics"
}

--------------------------------------------

5) Delete a Category
Request: DELETE /api/categories/{id}


================== Product Management ================

1) Create a Product

Request: POST /api/products
Body:
{
    "name": "Laptop",
    "description": "A high-performance laptop",
    "price": 1200.00,
    "stockLevel": 100,
    "categoryId": 1
}

-----------------------------
2) Get All Products
Request: GET /api/products

------------------------------------
3) Get a Product by ID
id == int
Request: GET /api/products/{id}

--------------------------------------
4) Update a Product
Request: PUT /api/products/{id}
Body:
{
    "name": "Updated Laptop",
    "description": "An updated high-performance laptop",
    "price": 1250.00,
    "stockLevel": 90,
    "categoryId": 1
}


--------------------------------------------
5) Delete a Product
Request: DELETE /api/products/{id}


------------------------------------
6) Filter Products by Category
Request: GET /api/products/category/{categoryId}

--------------------------------------
7) Search Products by Name
Request: GET /api/products/search?name={name}

--------------------------------------------
8) Get Low Stock Products
Request: GET /api/products/low-stock?stockLevel={stockLevel}

================== Inventory Management ================

1) Add Stock to a Product

Request: POST /api/inventory/add/{productId}
Parameters: quantity
Example: POST http://localhost:8080/api/inventory/add/1?quantity=10

-----------------------------
2) Deduct Stock from a Product
Request: POST /api/inventory/deduct/{productId}
Parameters: quantity
Example:POST http://localhost:8080/api/inventory/deduct/1?quantity=5

---------------------------------
3)Get Stock Level of a Product
Request: GET /api/inventory/{productId}
Example: GET http://localhost:8080/api/inventory/1
