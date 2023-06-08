CREATE DATABASE one_to_one_relationship;

--		1

CREATE TABLE people(
person_id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(30),
salary DOUBLE(7, 2), 
passport_id INT,

FOREIGN KEY (passport_id) REFERENCES passports(passport_id) ON DELETE CASCADE
);

CREATE TABLE passports(
passport_id INT PRIMARY KEY AUTO_INCREMENT,
passport_number VARCHAR(30)
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








