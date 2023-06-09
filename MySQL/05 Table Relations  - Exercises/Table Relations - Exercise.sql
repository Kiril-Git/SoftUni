CREATE DATABASE one_to_one_relationship;

--		1:

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

--		2: 

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
)
AUTO_INCREMENT = 101
;

INSERT INTO manufacturers(name, established_on) VALUE
('BMW', '1916-03-01'),
('Tesla', '2003-01-01'),
('Lada', '1966-05-01');

INSERT INTO models(name, manufacturer_id) VALUE
('X1', 1),
('i6', 1),
('Model S', 2),
('Model X', 2),
('Model 3', 2),
('Nova', 3);

SELECT * FROM models;

--		3:

CREATE DATABASE many_to_many_relationship;

CREATE TABLE students(
student_id INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(30) 
);

CREATE TABLE exams(
exam_id INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(30) 
)
AUTO_INCREMENT = 101
;

CREATE TABLE students_exams(
student_id INT,
exam_id INT,
PRIMARY KEY (student_id, exam_id),

FOREIGN KEY (student_id) REFERENCES students(student_id) ON DELETE CASCADE,
FOREIGN KEY (exam_id) REFERENCES exams(exam_id) ON DELETE CASCADE
);

INSERT INTO students(name) VALUE
('Mila'),
('Toni'),
('Ron');

INSERT INTO exams(name) VALUE
('Spring MVC'),
('Neo4j'),
('Oracle 11g');

INSERT INTO students_exams(student_id, exam_id) VALUES
(1, 101),
(1, 102),
(2, 101),
(3, 103),
(2, 102),
(2, 103);

SELECT * FROM students_exams;

--		4:

CREATE DATABASE self_referencing;

USE self_referencing;

CREATE TABLE teachers(
teacher_id INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(30),
manager_id INT,

FOREIGN KEY (manager_id) REFERENCES teachers(teacher_id) ON DELETE CASCADE
)
AUTO_INCREMENT = 101
;

INSERT INTO teachers(`name`, manager_id) VALUES
('John', NULL),
('Maya', 106),
('Silvia', 106),
('Ted', 105),
('Mark', 101),
('Greta', 101);


SELECT * FROM teachers;

--		5:

CREATE DATABASE online_store; 

CREATE TABLE item_types(
item_type_id INT(11) PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(50)
);

CREATE TABLE items(
item_id INT(11) PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(50),
item_type_id INT,

FOREIGN KEY (item_type_id) REFERENCES item_types(item_type_id) ON DELETE CASCADE
);

CREATE TABLE order_items(
order_id INT(11) PRIMARY KEY AUTO_INCREMENT,
item_id INT,

FOREIGN KEY (item_id) REFERENCES items(item_id) ON DELETE CASCADE
);

CREATE TABLE cities(
city_id INT(11) PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(50)
);

CREATE TABLE customers(
customer_id INT(11) PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(50),
`birthday` DATE,
city_id INT,

FOREIGN KEY (city_id) REFERENCES cities(city_id) ON DELETE CASCADE
);

CREATE TABLE orders(
order_id INT,
customer_id INT,

FOREIGN KEY (order_id) REFERENCES order_items(order_id) ON DELETE CASCADE,
FOREIGN KEY (customer_id) REFERENCES customers(customer_id) ON DELETE CASCADE
);

--		6:

CREATE DATABASE University; 

CREATE TABLE subjects(
subject_id INT(11) PRIMARY KEY AUTO_INCREMENT,
`subject_name` VARCHAR(50)
);

CREATE TABLE majors(
major_id INT(11) PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(50)
);

CREATE TABLE students(
student_id INT(11) PRIMARY KEY AUTO_INCREMENT,
student_number VARCHAR(12) UNIQUE NOT NULL,
student_name VARCHAR(50) NOT NULL,
major_id INT,

FOREIGN KEY (major_id) REFERENCES majors(major_id) ON DELETE CASCADE
);

CREATE TABLE agenda(
student_id INT,
subject_id INT,

FOREIGN KEY (student_id) REFERENCES students(student_id) ON DELETE CASCADE,
FOREIGN KEY (subject_id) REFERENCES subjects(subject_id) ON DELETE CASCADE
);

CREATE TABLE payments(
payment_id INT(11) PRIMARY KEY AUTO_INCREMENT,
payment_date DATE,
payments_amount DECIMAL(8, 2),
student_id INT,

FOREIGN KEY (student_id) REFERENCES students(student_id) ON DELETE CASCADE
);
















