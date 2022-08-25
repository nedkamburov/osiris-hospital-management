# Osiris Hospital Management System
#### Simple Hospital Management System built with Springboot and React
#### [Click here for the Heroku-hosted DEMO](https://osiris-healthcare-management.herokuapp.com)

### Architecture
The standard MVC model is used to provide the functionality but hexagonal (onion) architecture provides a more modular approach for development.
<br> 
The back-end is built with Spring boot and Postgres. The front-end is managed by a React app.

### Functionality 
The system manages: 
- users (administrators, doctors and patients)
- treatments (linked to patients and doctors)
- equipment such as beds, medical devices, etc.

### CI/CD
Heroku deploys automatically all new builds from the main so the online demo is always up-to-date.