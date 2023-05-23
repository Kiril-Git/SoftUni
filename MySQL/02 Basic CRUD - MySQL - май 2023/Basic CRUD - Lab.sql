SELECT 
    *
FROM
    employees;
-- - 

SELECT 
    id, first_name, last_name, job_title
FROM
    employees;

-- -
 
SELECT 
    id, first_name, last_name, job_title
FROM
    employees
ORDER BY id;

-- -

SELECT 
    id AS 'ID', first_name AS 'First Name', last_name AS 'Last Name', job_title
FROM
    employees
ORDER BY id;

-- 			- concatinating 

SELECT 
    concat(`first_name`,' ',`last_name`) AS 'Full Name', job_title AS 'Job Title', `id` AS 'No.'
FROM
    employees;

-- 			- concat with separator

SELECT 
    concat_ws(`first_name`, `last_name`) AS 'Full Name', job_title AS 'Job Title', `id` AS 'No.'
FROM
    employees;

-- 			- SELECT WHERE salary > 1000

SELECT 
    concat_ws(`first_name`, `last_name`) AS 'Full Name', job_title AS 'Job Title', `id` AS 'No.', `salary` AS 'Salary'
FROM
    employees WHERE salary > 1000;

-- -

SELECT DISTINCT
    department_id
FROM
    employees;

-- -

SELECT 
    last_name, department_id
FROM
    employees
WHERE
    department_id = 1;

-- -
SELECT id, last_name, salary FROM employees WHERE salary <= 1500;

-- -

SELECT 
    last_name, department_id
FROM
    employees
WHERE
    NOT (department_id = 2 OR department_id = 4);

-- -

SELECT 
    last_name, salary
FROM
    employees
WHERE
    salary BETWEEN 1000 AND 2000;

-- -

SELECT 
    last_name, department_id
FROM
    employees
WHERE
    department_id NOT IN (1, 2, 3);
    
    -- 2
    
SELECT 
    id,
    CONCAT_WS(' ',`first_name`, `last_name`) AS 'full_name',
    job_title,
    salary
FROM
    employees
WHERE
    salary > 1000
    ORDER BY id;

-- 			- Views – Example

CREATE VIEW v_hr_result_set AS
    SELECT 
        CONCAT_WS(' ', first_name, last_name) AS 'Full Name', salary
    FROM
        employees
    ORDER BY department_id;
    
    SELECT * FROM v_hr_result_set;
    
    -- 	- 3

UPDATE employees 
SET 
    salary = salary + 100
WHERE
    job_title = 'Manager'; 
    
    SELECT salary FROM employees;
    
    -- - 4
    
SELECT 
    *
FROM
    employees
ORDER BY salary DESC
LIMIT 1;

-- -

INSERT INTO employees (first_name, last_name, job_title, department_id, salary)
VALUES('Yordan', 'Gogovski', 'cook', 4, 1280),
('Yordan', 'Yordanov', 'painter', 4, 1150);

SELECT * FROM employees;

-- -

UPDATE employees
SET department_id = 1
WHERE id = 11;

UPDATE employees
SET first_name = 'Delyan'
WHERE id = 10;

--   -   using existing records to create a new table

CREATE TABLE `position`
AS SELECT `id`, `first_name`, `last_name`, `job_title`
FROM `employees`;

SELECT * FROM hotel.position;

-- - 

UPDATE  employees
SET salary = salary - 100
WHERE job_title = 'Manager';

-- - 6

DELETE FROM employees
WHERE id >= 10;

DELETE FROM employees
WHERE department_id = 1 OR department_id = 2;

SELECT * FROM employees
ORDER BY id;

-- -5 

SELECT * FROM employees
WHERE department_id = 4 AND salary > 1000
ORDER BY id;





















