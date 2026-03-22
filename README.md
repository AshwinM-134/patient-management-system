# Patient Management System

A microservices-based system for managing patient information.

## Services

### Patient Service

The `patient-service` is a Spring Boot application that handles the core patient data.

#### Technology Stack
- **Java 17**
- **Spring Boot 4.0.4**
- **Spring Data JPA** (for database operations)
- **PostgreSQL** (production) / **H2** (development)
- **Lombok** (to reduce boilerplate)
- **Spring Boot Validation** (for input validation)
- **OpenAPI 3 / Swagger UI** (for API documentation)

#### Getting Started

1.  Navigate to the `patient-service` directory:
    ```bash
    cd patient-service
    ```
2.  Run the application using Maven:
    ```bash
    ./mvnw spring-boot:run
    ```
    The service will start on port `4000`.

#### API Endpoints

- **GET `/patients`**: Retrieve a list of all patients.
- **POST `/patients`**: Create a new patient record.
- **PUT `/patients/{id}`**: Update an existing patient record.
- **DELETE `/patients/{id}`**: Remove a patient record.

#### Patient Data Model

- `name`: (String) Full name of the patient.
- `email`: (String) Unique email address.
- `address`: (String) Residential address.
- `dateOfBirth`: (String) Date of birth.
- `registeredDate`: (String) Date of registration.

#### API Documentation
Once the service is running, you can access the Swagger UI for interactive API documentation at:
`http://localhost:4000/swagger-ui/index.html`

## Recent Changes
- Initial project setup with Git.
- Added root `.gitignore`.
- Created `patient-service` with CRUD functionality.
- Integrated Swagger UI for API documentation.
- Added Apache 2.0 LICENSE.
- Added comprehensive `README.md`.
