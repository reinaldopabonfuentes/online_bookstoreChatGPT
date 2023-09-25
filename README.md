# online_bookstoreChatGPT
Repository made with the help of chatGPT

# Online Bookstore Application

## Description
The Online Bookstore Application is a simple web-based platform that allows users to perform CRUD operations on books, authors, and genres. Books have attributes such as title, author, genre, price, and quantity available. Users can also search for books by title, author, or genre. The application uses Spring Boot and Hibernate to persist data to a MySQL database.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL
- Maven
- Spring Initializr
- Docker

## Getting Started

### Prerequisites
- Docker: [Install Docker](https://docs.docker.com/get-docker/)
- Java Development Kit (JDK) 17: [Install JDK 17](https://openjdk.java.net/install/)

### Running the Application
1. Clone the repository to your local machine:

git clone https://github.com/reinaldopabonfuentes/online_bookstoreChatGPT.git


2. Navigate to the project directory:

cd online-bookstore-app


3. Start the MySQL Docker container:
docker run -d --name mysql-online-bookstore -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=online_bookstore -p 3306:3306 mysql:latest


4. Build and run the Spring Boot application:
   mvn spring-boot:run


5. The application will start and be accessible at [http://localhost:8080](http://localhost:8080).

### API Endpoints
- Books: [http://localhost:8080/api/books](http://localhost:8080/api/books)
- Authors: [http://localhost:8080/api/authors](http://localhost:8080/api/authors)
- Genres: [http://localhost:8080/api/genres](http://localhost:8080/api/genres)

## Usage
- Use Postman or any API client to interact with the API and perform CRUD operations on books, authors, and genres.
- Refer to the API documentation for details on available endpoints and request formats.

## Contribution
Contributions are welcome! If you find any issues or have improvements to suggest, please open an issue or create a pull request.

## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
