DROP TABLE IF EXISTS details CASCADE;
CREATE TABLE details
(
    id           SERIAL PRIMARY KEY,
    city         VARCHAR(15),
    phone_number VARCHAR(25),
    email        VARCHAR(30)
);


DROP TABLE IF EXISTS employees CASCADE;
CREATE TABLE employees
(
    id         SERIAL PRIMARY KEY,
    first_name VARCHAR(15),
    last_name  VARCHAR(25),
    department VARCHAR(20),
    details_id SERIAL,
    FOREIGN KEY (details_id) REFERENCES details (id)
);