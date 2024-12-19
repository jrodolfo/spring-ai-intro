# Spring AI Introduction

This is a Spring Boot application that integrates with OpenAI APIs to generate responses for various questions. The application provides a simple way to interact with OpenAI's models in Java projects. The code comes from the course:

    Spring AI: Beginner to Guru
    Use Java to Unlock the Power of OpenAI's ChatGPT Artificial Intelligence (AI) with Spring AI
    https://www.udemy.com/course/spring-ai-beginner-to-guru
    Created by John Thompson

## Technologies Used

- Java 21
- Spring Boot Framework
- JUnit 5 for Testing
- OpenAI API Integration
- SLF4J/Java Util Logging for Logging

## Prerequisites

- JDK 21
- Maven
- OpenAI API key (available from https://platform.openai.com/)

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <project-folder>
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

4. Configure your OpenAI API key in `application.properties`:
   ```properties
   openai.api.key=your-api-key
   ```

## Usage Instructions

To interact with the OpenAI service, use the following endpoints:

- Example API endpoint: `/openai/ask`
- Example Payload:
  ```json
  {
    "question": "What is the meaning of life?"
  }
  ```

Example response:
```json
{
    "answer": "The meaning of life is 42."
}
```

## Running Tests

Run unit tests with Maven:
```bash
mvn test
```

## Configuration Guide

Edit your `application.properties` file to include the following:
```properties
spring.application.name=spring-ai-intro
spring.ai.openai.api-key=${OPENAI_API_KEY}
```

[//]: # (## License)

[//]: # ()
[//]: # (This project is licensed under the MIT License. See LICENSE.md for details.)