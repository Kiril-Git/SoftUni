SELECT 
    *
FROM
    minions.towns;

USE minions;
-- 2 

ALTER TABLE minions ADD COLUMN town_id INT;

ALTER TABLE minions
ADD
FOREIGN KEY (town_id) REFERENCES towns(id) ON DELETE CASCADE;


-- 3

INSERT INTO towns (`id`, `name`) 
VALUES
(1, 'Sofia'), 
(2, 'Plovdiv'), 
(3, 'Varna');

INSERT INTO minions (name, age, town_id) 
VALUES
('Kevin', 22, 1), 
('Bob', 15, 3), 
('Steward', NULL, 2);

-- 4

-- 5

DROP TABLE minions;
DROP TABLE towns;

-- 6

CREATE TABLE people (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(200) NOT NULL,
    picture BLOB,
    height DOUBLE(10 , 2 ),
    weight DOUBLE(10 , 2 ),
    gender CHAR(1) NOT NULL,
    birthdate DATE NOT NULL,
    biography TEXT
);

INSERT INTO people (name, gender, birthdate)
VALUES 
('Dido', 'M', DATE(now())),
('Ivo', 'M', '1971-06-06'),
('Yordan', 'M', '1971-10-17'),
('Kalin', 'M', '1971-06-10'),
('Malin', 'M', '1971-11-06');


-- 7

CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(30) NOT NULL,
    password VARCHAR(26) NOT NULL,
    profile_picture BLOB,
    last_login_time DATETIME,
    is_deleted BOOLEAN
);

INSERT INTO users(username, password)
VALUES
('Donga', '2323'),
('Buzema', '2323'),
('Kozhata', '1616'),
('shepard', '2323'),
('Dan4o', '1616')
;

-- 8

ALTER TABLE users
DROP PRIMARY KEY,
ADD CONSTRAINT pk_users
PRIMARY KEY users(id, username);

-- 9

USE minions;

ALTER TABLE users
CHANGE COLUMN last_login_time  
last_login_time DATETIME DEFAULT NOW();

-- 10

ALTER TABLE users
DROP PRIMARY KEY,
ADD CONSTRAINT pk_users
PRIMARY KEY users(id),
CHANGE COLUMN username
username VARCHAR(30) UNIQUE;


-- 11

CREATE DATABASE Movies;
use Movies;

CREATE TABLE directors (
    id INT PRIMARY KEY AUTO_INCREMENT,
    director_name VARCHAR(30) NOT NULL,
    notes TEXT
);
CREATE TABLE genres (
    id INT PRIMARY KEY AUTO_INCREMENT,
    genre_name VARCHAR(30) NOT NULL,
    notes TEXT
);
CREATE TABLE categories (
    id INT PRIMARY KEY AUTO_INCREMENT,
    category_name VARCHAR(30) NOT NULL,
    notes TEXT
);
CREATE TABLE movies (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(30) NOT NULL,
    director_id INT,
    copyright_year YEAR,
    length DOUBLE(10, 2),
    genre_id INT,
    category_id INT,
    rating DOUBLE(3, 2),
    notes TEXT,
    
    FOREIGN KEY (director_id) REFERENCES directors(id) ON DELETE CASCADE,
	FOREIGN KEY (genre_id) REFERENCES genres(id) ON DELETE CASCADE,
	FOREIGN KEY (category_id) REFERENCES categories(id) ON DELETE CASCADE
);

INSERT INTO directors (`director_name`)
VALUES ('Steven Spielberg'),
('Alfred Hitchcock'),
('Quentin Tarantino'),
('Akira Kurosawa'),
('Francis Ford Coppola');

INSERT INTO genres (`genre_name`, `notes`)
VALUES ('Adventure', 'this masterful storyteller continues to push boundaries. ...'),
('Horror', 'this masterful storyteller continues to push boundaries. ...'),
('Thriller', 'this masterful storyteller continues to push boundaries. ...'),
('Animation', 'this masterful storyteller continues to push boundaries. ...'),
('Science fiction', 'this masterful storyteller continues to push boundaries. ...');

INSERT INTO categories (`category_name`, `notes`)
VALUES ('Best Picture', 'this masterful storyteller continues to push boundaries. ...'),
('Best Production Design', 'this masterful storyteller continues to push boundaries. ...'),
('Best Story', 'this masterful storyteller continues to push boundaries. ...'),
('Best Director', 'this masterful storyteller continues to push boundaries. ...'),
('Best Actor', 'this masterful storyteller continues to push boundaries. ...');

INSERT INTO movies (`title`, `director_id`, `genre_id`, `category_id`, `notes`)
VALUES('JAWS', 1, 2, 1, 'a killer shark unleashes chaos on a beach commu...'),
('VERTIGO', 2, 2, 2, 'a 1958 American psychological thriller film dir..'),
('DJANGO', 3, 1, 3, ' a German bounty-hunter, a freed slave sets'),
('Dreams', 4, 4, 4, '1990 magical realist anthology film of eight'),
('Tetro', 5, 5, 5, '2009 drama film written, produced and directed by ');
    
 -- 12   
    
CREATE DATABASE car_rental;
USE car_rental;

CREATE TABLE categories (
    id INT PRIMARY KEY AUTO_INCREMENT,
    category VARCHAR(30),
    daily_rate DOUBLE(6 , 2 ),
    weekly_rate DOUBLE(6 , 2 ),
    monthly_rate DOUBLE(6 , 2 ),
    weekend_rate DOUBLE(6 , 2 )
);

INSERT INTO categories (`category`, `daily_rate`,  `weekly_rate`)
VALUES ('blue', 50.00, 300.00),
('red', 60.00, 350.00),
('green', 70.00, 400.00);


CREATE TABLE cars (
    id INT PRIMARY KEY AUTO_INCREMENT,
    plate_number VARCHAR(10),
    make VARCHAR(30),
    model VARCHAR(30),
    car_year YEAR,
    category_id INT,
    doors INT,
    picture BLOB,
    car_condition VARCHAR(30) NOT NULL,
    available DATE,
    
    FOREIGN KEY (category_id) REFERENCES categories (id) ON DELETE CASCADE
);

INSERT INTO cars(`plate_number`, `make`, `category_id`, `car_condition`)
VALUES('XX 2244 XX', 'KAMAZ', 1, 'NEW'),
('YY 8844 XX', 'GAZ', 2, 'RENOVATED'),
('CC 2200 XX', 'UAZ', 3, 'ANTIC');

CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    title VARCHAR(10),
    notes TEXT
);

INSERT INTO employees(`first_name`, `last_name`, `title`)
VALUES('Dido', 'Stankov', 'Mr.'),
('Yordan', 'Gogovski', 'Mr.'),
('Didi', 'Dimitrova', 'Mrs.');

CREATE TABLE customers (
    id INT PRIMARY KEY AUTO_INCREMENT,
    driver_licence_number VARCHAR(30) NOT NULL,
    full_name VARCHAR(30) NOT NULL,
    address VARCHAR(30),
    city VARCHAR(30),
    zip_code VARCHAR(30),
    notes TEXT
);

INSERT INTO customers(`driver_licence_number`, `full_name`, `city`)
VALUES('A-123456 DF', 'Ivo Andonov', 'Buzema'),
('Lili', 'Ivanova', 'Kubrat'),
('Kaloyan', 'Petrov', 'Petrich');

CREATE TABLE rental_orders (
    id INT PRIMARY KEY AUTO_INCREMENT,
    employee_id INT,
    customer_id INT,
    car_id INT,
    car_condition VARCHAR(30),
    tank_level DOUBLE(6 , 3 ),
    kilometrage_start DOUBLE(10 , 3 ) NOT NULL,
    kilometrage_end DOUBLE(10 , 3 ) NOT NULL,
    total_kilometrage DOUBLE(10 , 3 ),
    start_date DATE,
    end_date DATE,
    total_days INT,
    rate_applied DOUBLE(10 , 3 ),
    tax_rate DOUBLE(10 , 3 ),
    order_status VARCHAR(30),
    notes TEXT,
    
    FOREIGN KEY (employee_id) REFERENCES employees (id) ON DELETE CASCADE,
    FOREIGN KEY (customer_id) REFERENCES customers (id) ON DELETE CASCADE,
    FOREIGN KEY (car_id) REFERENCES cars (id) ON DELETE CASCADE
);

INSERT INTO rental_orders( 
`employee_id`, `customer_id`, `car_id`, kilometrage_start, kilometrage_end)
VALUES (1, 2, 3, 15000.250, 16000),
(2, 3, 1, 25000, 26000),
(3, 1, 2, 300000, 300050);


-- 13

CREATE DATABASE soft_uni;
USE soft_uni;

CREATE TABLE towns (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30)
);

INSERT INTO towns(`name`)
VALUES ('Sofia'),
('Plovdiv'),
('Varna'),
('Burgas');

CREATE TABLE addresses (
    id INT PRIMARY KEY AUTO_INCREMENT,
    address_text VARCHAR(50),
    town_id INT,
    
    FOREIGN KEY (town_id) REFERENCES towns (id) ON DELETE CASCADE
);


CREATE TABLE departments (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50)
);

 INSERT INTO departments(`name`)
VALUES ('Engineering'),
('Sales'),
('Marketing'),
('Software Development'),
('Quality Assurance');


CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(30),
    middle_name VARCHAR(30),
    last_name VARCHAR(30),
    job_title VARCHAR(30),
    department_id INT,
    hire_date DATE,
    salary DOUBLE(8 , 2 ),
    address_id INT,
    
    FOREIGN KEY (department_id) REFERENCES departments(id),
    FOREIGN KEY (address_id) REFERENCES addresses(id)
);

 INSERT INTO employees(`first_name`, `middle_name`, `last_name`, `job_title`,`department_id`, `hire_date`, `salary`)
VALUES ('Ivan', 'Ivanov', 'Ivanov', '.NET Developer', 4, '2013-02-01', 3500.00),
('Petar', 'Petrov', 'Petrov', 'Senior Engineer', 1, '2004-03-02', 4000.00),
('Maria', 'Petrova', 'Ivanova', 'Intern', 5, '2016-08-28', 525.25),
('Georgi', 'Terziev', 'Ivanov', 'CEO', 2, '2007-12-09', 3000.00),
('Peter', 'Pan', 'Pan', 'Intern', 3, '2016-08-28', 599.88);


-- 14

SELECT * FROM towns;
SELECT * FROM departments;
SELECT * FROM employees;


-- 15

SELECT * FROM towns as t ORDER BY t.name;
SELECT * FROM departments as d ORDER BY d.name;
SELECT * FROM employees as e ORDER BY e.salary DESC;


-- 16

SELECT name FROM towns;
SELECT name FROM departments;
SELECT first_name, last_name, job_title, salary FROM employees;

-- 17

UPDATE employees
SET salary = salary * 1.1;

SELECT salary from employees;






















