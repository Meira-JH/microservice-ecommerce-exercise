# microservice-ecommerce-exercise

Exercise of Microservice Architecture for Infnet's **Software Architecture Postgraduate Course**.

This project uses Spring Framework and was built through Spring Initializr.
For more information: https://start.spring.io/

## Basic Configs
project: maven
boot: 3.1.9
java 17

## Architecture overview
This system was structured using C4 models. The diagrams stand below:

### Microservices:
- Eureka server: responsible for managing requests between Java microservices
- Auth: responsible for registration CRUD operations
- Product: responsible for product CRUD operations
- Order: responsible for order CRUD operations
