CREATE TABLE IF NOT EXISTS "users"
(
    id INT NOT NULL GENERATED ALWAYS AS IDENTITY,
    username VARCHAR(64) NOT NULL,
    password VARCHAR(64) NOT NULL,
    first_name VARCHAR(64) NOT NULL,
    last_name VARCHAR(64) NOT NULL,
    email VARCHAR(64) NOT NULL,
    role VARCHAR(16) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO users
    (username, password, first_name, last_name, email, role)
VALUES
    ('leslie_andrews', 'passpass@123', 'Leslie', 'Andrews', 'leslie@example.com', 'administrator'),
    ('juanvegagaga', 'passpass@123', 'Juan', 'Vega', 'juan@example.com', 'doctor'),
    ('max_verstappen', 'passpass@123', 'Maximilian', 'Verstappen', 'verstappen_max@example.com', 'patient');


