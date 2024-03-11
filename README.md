Exercise of Microservice Architecture for Infnet's **Software Architecture Postgraduate Course**.

This project uses Spring Framework and was built through Spring Initializr.
For more information: https://start.spring.io/

## Basic Configs
project: maven
boot: 3.1.9
java 17

## Architecture overview
This system was structured using C4 models. The diagrams stand below:

#### Context
<img width="293" alt="Screenshot 2024-03-08 at 18 04 31" src="https://github.com/Meira-JH/microservice-ecommerce-exercise/assets/60922841/972a5733-c759-4585-8699-1dea4b75e686">

#### Containers
<img width="936" alt="Screenshot 2024-03-08 at 18 04 20" src="https://github.com/Meira-JH/microservice-ecommerce-exercise/assets/60922841/0f5aa473-9631-48d3-888a-2ed519591eec">

#### Components
<img width="658" alt="Screenshot 2024-03-08 at 18 03 43" src="https://github.com/Meira-JH/microservice-ecommerce-exercise/assets/60922841/80d8346c-ae12-489f-8952-062d9a5fdf0a">


## The Microservices:
- Eureka server: responsible for managing requests between Java microservices
- Auth: responsible for registration CRUD operations
- Product: responsible for product CRUD operations
- Order: responsible for order CRUD operations

## Other details:
- This project is based on SOLID best practices
- The communication between microsservices use queue messaging (RabbitMQ)
- Local development is suported by H2 tecnology for Database mockup
