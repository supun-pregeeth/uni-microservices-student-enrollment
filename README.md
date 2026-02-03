# uni-microservices-student-enrollment
University microservices system built with Spring Boot, featuring user signup/login, student profile management, and course enrollment using RESTful APIs and Mariadb databases.
# University Microservices (Auth + Student + Enrollment)

Small Spring Boot microservices project for a university system:
- User Signup/Login (Auth Service)
- Student Profile CRUD (Student Service)
- Course Enrollment (Enrollment Service)

## Tech Stack
- Java 17+
- Spring Boot 3
- Maven
- MySQL
- Spring Data JPA
- Validation (Jakarta)
- (Optional) Docker Compose

## Services
| Service | Port | Database |
|--------|------|----------|
| auth-service | 8081 | university_auth_db |
| student-service | 8082 | university_student_db |
| enrollment-service | 8083 | university_enrollment_db |

## Features
- Signup and Login
- Create and update student details
- Enroll student into courses
- Basic validation (email, not blank, etc.)

## How to Run (Local)
### 1) Create MySQL databases
```sql
CREATE DATABASE university_auth_db;
CREATE DATABASE university_student_db;
CREATE DATABASE university_enrollment_db;
