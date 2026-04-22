# Use Case #1: Legacy Application Modernization

## Objective

Modernize a legacy application into a scalable, maintainable, and modern architecture using current technologies and best practices.

---

## Current State

The current application is built using outdated technologies and tightly coupled architecture patterns.

### Current Architecture

- Java + JSP architecture
- Direct database access through `DbUtil.class`
- Oracle database
- SQL queries executed directly from JSP pages
- Tight coupling between presentation layer and data access layer
- Limited scalability
- Difficult maintenance process

---

## Current Application Flow

The current application follows this flow:

1. JSP pages trigger database operations
2. `DbUtil.class` handles direct database connectivity
3. SQL queries are executed directly against the Oracle database
4. Results are returned directly to JSP pages for rendering

### Current JSP Pages

- `index.jsp`
- `buscar.jsp`
- `actualizador.jsp`


<img width="1037" height="453" alt="image" src="https://github.com/user-attachments/assets/3fde5a99-361e-40f3-98cd-739e7390c838" />

---

# Target State

Modernize the application into a scalable and maintainable architecture using modern technologies.

---

## Expected Outcomes

### Modern Java Backend Architecture

Migrate from JSP-based architecture to a modern backend architecture using Spring Boot.

### Key Improvements

- Separation of concerns
- Layered architecture design
- Better maintainability
- Improved scalability

---

## Backend Configuration Management

All backend configuration values must be externalized using:

```yaml
application.yml
```

Examples include:

- Database connection configuration
- Server ports
- Environment variables
- API configuration
- External service configurations
  
No configuration values should be hardcoded.

---

## Database Modernization
Replace Oracle database with PostgreSQL.


---

## Modern Frontend
Replace legacy JSP pages with a modern frontend application built using:
- React
- Next.js
- Tailwind CSS
- shadcn/ui

### Frontend Goals
- Improve UI/UX
- Create reusable components
- Better maintainability
- Separate frontend from backend logic

---

## Application Improvements

### Validation Layer

Implement validation in both:

- Frontend
- Backend

---

## API Documentation
Document backend APIs using OpenAPI standards.


---

## Responsive Design
The application must support:

- Desktop devices
- Tablets
- Mobile devices

This improves accessibility across multiple platforms.

---

# DevOps / Deployment
## Easy Deployment Strategy
Adopt a Docker-first deployment model.
Fast setup using a single Docker Compose configuration
All application components must be containerized.
### Containerized Components
- Backend application
- Frontend application
- PostgreSQL database

---

## Fast Environment Setup

The entire application should be deployable using a single command:

```bash
docker-compose up
```
---
