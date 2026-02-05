# TaskFlow - Microservices Task Management

## Services
- User Service (8081) - Authentication
- Task Service (8082) - Task management
- Notification Service (8083) - Notifications
- API Gateway (8080) - Entry point

## Tech Stack
- Java 21
- Spring Boot 3.2
- PostgreSQL 16
- Apache Kafka
- Docker

## Setup
```bash
# Start databases
docker-compose up -d

# Run each service
cd user-service && mvn spring-boot:run
```

## Status
- [ ] User Service
- [ ] Task Service
- [ ] Notification Service
- [ ] API Gateway
