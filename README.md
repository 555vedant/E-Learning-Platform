# E-Commerce Learning Platform

This is an e-commerce learning platform developed using Spring Boot, Spring Data JPA, and other associated technologies. The platform allows users to register, browse courses, and make purchases for learning resources like videos, PDFs, etc.

## Table of Contents
1. [Features](#features)
2. [Technologies Used](#technologies-used)
3. [Architecture](#architecture)
4. [Installation](#installation)
5. [Running the Application](#running-the-application)
6. [API Endpoints](#api-endpoints)
7. [Database Schema](#database-schema)
8. [Configuration](#configuration)
9. [Testing](#testing)
10. [Contributing](#contributing)

## Features
- **User Registration and Authentication**: Users can sign up and log in to the platform.
- **Course Catalog**: Browse various courses, including free and paid resources.
- **Purchase Courses**: Users can purchase courses through an integrated payment gateway.
- **Role-based Access Control**: Admins can add and manage courses, while users can only browse and purchase.
- **Resource Management**: Courses contain different types of resources like videos, files, and assessments.
- **Cart System**: Users can add courses to their cart and checkout.
  
## Technologies Used
- **Spring Boot**: For building the core application.
- **Spring Data JPA**: For database interaction.
- **Hibernate**: As the JPA implementation.
- **MySQL / PostgreSQL**: For the relational database.
- **Thymeleaf**: For server-side rendering (optional if using frontend frameworks).
- **Lombok**: To reduce boilerplate code.
- **JWT**: For securing API endpoints with JSON Web Tokens.
- **Maven**: For project build and dependency management.

## Architecture
The platform follows a layered architecture:
- **Controller Layer**: Contains REST API controllers to handle incoming HTTP requests.
- **Service Layer**: Implements the business logic of the application.
- **Repository Layer**: Handles interactions with the database using Spring Data JPA.
- **Model Layer**: Contains the entities for the database.

## Installation

### Prerequisites
- Java 17 or higher
- Maven 3.8.x or higher
- MySQL or PostgreSQL
- IDE (IntelliJ IDEA, Eclipse, etc.)

### Steps to Install
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/ecommerce-learning-platform.git
   cd ecommerce-learning-platform
