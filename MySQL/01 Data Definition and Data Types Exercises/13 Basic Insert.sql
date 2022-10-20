CREATE DATABASE soft_uni;

USE soft_uni;

CREATE TABLE towns(

id INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR(50),
CONSTRAINT pk_towns PRIMARY KEY (id)
);

CREATE TABLE addresses(

id INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR(100),
town_id INT,
CONSTRAINT pk_addresses PRIMARY KEY (id),
CONSTRAINT fk_addresses_towns FOREIGN KEY (town_id) REFERENCES towns(id)

);

CREATE TABLE departments(

id INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR(50),
CONSTRAINT pk_departments_id PRIMARY KEY (id)

);

CREATE TABLE employees(

`id` INT NOT NULL AUTO_INCREMENT,
`forename` VARCHAR(50),
`middle_name` VARCHAR(50),
`surname` VARCHAR(50),
`job_title` VARCHAR(50),
department_id INT,
hire_date DATETIME,
salary DOUBLE(12, 4),
address_id INT,
CONSTRAINT pk_employees PRIMARY KEY (id),
CONSTRAINT fk_employees_departments FOREIGN KEY (department_id) REFERENCES departments(id),
CONSTRAINT fk_employees_addresses FOREIGN KEY (address_id) REFERENCES addresses(id)

);
INSERT INTO towns (`name`) VALUES ('Sofia');
INSERT INTO towns (`name`) VALUES ('Plovdiv');
INSERT INTO towns (`name`) VALUES ('Varna');
INSERT INTO towns (`name`) VALUES ('Burgas');
INSERT INTO towns (`name`) VALUES ('Lom');

INSERT INTO departments (`name`) VALUES ('Engineering');
INSERT INTO departments (`name`) VALUES ('Sales');
INSERT INTO departments (`name`) VALUES ('Marketing');
INSERT INTO departments (`name`) VALUES ('Software Development');
INSERT INTO departments (`name`) VALUES ('Quality Assurance');
INSERT INTO departments (`name`) VALUES ('something else');

INSERT INTO employees (forename, middle_name, surname, job_title, department_id, hire_date, salary) 
VALUES 
('Ivan', 'Ivanov', 'Ivanov', '.NetDev', (SELECT id FROM  departments WHERE name = ' Engineering'), 01/02/2013, '3500.00');
INSERT INTO employees (forename, middle_name, surname, job_title, department_id, hire_date, salary) 
VALUES
('Petko', 'Ivanov', 'Petrov', 'maistor', (SELECT id FROM  departments WHERE name = 'Software Engineer'), 01/02/2013, '3500.00');
INSERT INTO employees (forename, middle_name, surname, job_title, department_id, hire_date, salary) 
VALUES
('Mimi', 'Petrakova', 'Ivanova', 'host', (SELECT id FROM  departments WHERE name = 'Quality Assurance'), 10/11/2012, '3555.00');
INSERT INTO employees (forename, middle_name, surname, job_title, department_id, hire_date, salary) 
VALUES
('Go6o', 'Pelov', 'Pelev', 'CEO', (SELECT id FROM  departments WHERE name = 'Sales'), 10/11/2012, '3555.00');
INSERT INTO employees (forename, middle_name, surname, job_title, department_id, hire_date, salary) 
VALUES
('Petra', 'Pelova', 'Peneva', 'Intern', (SELECT id FROM  departments WHERE name = 'Marketing'), '2012-10-11', '3555.0015');













