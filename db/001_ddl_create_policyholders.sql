CREATE TABLE policyholders
(
    id       SERIAL PRIMARY KEY,
    name     VARCHAR(255),
    surname  VARCHAR(255),
    lastname VARCHAR(255),
    birthday DATE,
    serial   VARCHAR(30) unique,
    number   VARCHAR(30) unique
);