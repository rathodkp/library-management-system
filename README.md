📚 Library Management System

A simple and clean Spring Boot + Spring Data JPA + MySQL based REST API that manages library books.
This project allows you to add, view, update, and delete books from the library database.

🚀 Features
✔ Add a new book
✔ Get all books
✔ Get book by ID
✔ Update existing book
✔ Delete a book
✔ CORS enabled (frontend can easily connect)
✔ MySQL database integration

🛠 Tech Stack
Layer	   Technology

Backend	   - Java, Spring Boot, Spring Web, Spring Data JPA
Database   - MySQL
Build Tool - Maven
Tools	   - STS / IntelliJ / VS Code, Git, GitHub
API Test   - Postman


📁 Project Structure (Brief Overview)
src/main/java/com/app/
 ├── controller/BookController.java
 ├── entity/Book.java
 ├── repository/BookRepository.java
 ├── service/BookService.java
 ├── service/BookServiceImpl.java
 └── LibraryManagementSystemApplication.java

🔌 API Endpoints
1. Add Book

POST /books
Sample JSON:

{
  "title": "Java Programming",
  "author": "Kalpana Rathod",
  "category": "Programming",
  "available": true
}

2. Get All Books

GET /books

3. Get Book by ID

GET /books/{id}

4. Update Book

PUT /books/{id}
Sample JSON:

{
  "title": "Updated Title",
  "author": "Updated Author",
  "category": "Updated Category",
  "available": false
}

5. Delete Book

DELETE /books/{id}

⚙️ Database Setup
application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/librarydb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

▶️ How to Run the Project

Clone the repository

git clone https://github.com/rathodkp/library-management-system.git

Open it in STS / IntelliJ

Start MySQL server

Run the project → LibraryManagementSystemApplication.java

Test APIs using Postman

🙋‍♀️ Author

Kalpana Rathod
Java Developer | Spring Boot | Backend Developer

