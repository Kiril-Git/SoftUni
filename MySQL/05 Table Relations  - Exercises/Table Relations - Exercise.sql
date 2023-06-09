CREATE DATABASE one_to_one_relationship;

--		1

CREATE TABLE people(
person_id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(30) NOT NULL,
salary DECIMAL(10, 2), 
passport_id INT,

FOREIGN KEY (passport_id) REFERENCES passports(passport_id) ON DELETE CASCADE
);

CREATE TABLE passports(
passport_id INT PRIMARY KEY AUTO_INCREMENT,
passport_number VARCHAR(10) UNIQUE
);

SELECT * FROM people;

INSERT INTO passports(passport_number) VALUE
('N34FG21B'),
('K65LO4R7'),
('ZE657QP2');

INSERT INTO people(first_name, salary, passport_id) VALUE
('Roberto', 43300.00, 102),
('Tom', 56100.00, 103),
('Yana', 60200.00, 101);

--		2

CREATE DATABASE one_to_many_relationship;

CREATE TABLE manufacturers(
manufacturer_id INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(10) UNIQUE,
established_on DATE
);

CREATE TABLE models(
model_id INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(10) UNIQUE,
manufacturer_id INT,

FOREIGN KEY (manufacturer_id) REFERENCES manufacturers(manufacturer_id) ON DELETE CASCADE
);

INSERT INTO manufacturers(name, established_on) VALUE
('BMW', '1916-03-01'),
('Tesla', '2003-01-01'),
('Lada', '1966-05-01');

INSERT INTO models(model_id, name, manufacturer_id) VALUE
(101, 'X1', 1),
(102, 'i6', 1),
(103, 'Model S', 2),
(104, 'Model X', 2),
(105, 'Model 3', 2),
(106, 'Nova', 3);

SELECT * FROM models;






