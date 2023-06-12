SELECT * FROM employees;

SELECT first_name, department_id FROM employees
INNER JOIN departments ON departments.id = employees.department_id;

--		-

SELECT first_name, department_id, departments.`name` FROM employees
INNER JOIN departments ON departments.id = employees.department_id;

--		-

SELECT first_name, department_id, departments.`name` FROM employees
LEFT JOIN departments ON departments.id = employees.department_id;

--		-

SELECT first_name, department_id, departments.`name` FROM employees
RIGHT JOIN departments ON departments.id = employees.department_id;

--		-

SELECT id, first_name from employees WHERE id < 3
UNION
SELECT id, first_name FROM employees WHERE id > 7;

--		-

SELECT id, first_name from employees WHERE id IN (1, 2, 4, 8)
UNION
SELECT id, first_name FROM employees WHERE id > 7;

--		- 

SELECT first_name, departments.name from employees 
LEFT JOIN departments ON departments.id = employees.department_id
UNION
SELECT first_name, departments.name from employees 
RIGHT JOIN departments ON departments.id = employees.department_id;

--		1:

SELECT 
employee_id,
CONCAT_WS(' ',first_name, last_name) AS full_name,
departments.department_id,
departments.name AS 'department_name'
FROM employees
INNER JOIN
departments ON departments.manager_id = employees.employee_id
ORDER BY employees.employee_id LIMIT 5;

--		2: 

SELECT addresses.town_id, towns.name AS 'town_name', address_text 
FROM addresses
RIGHT JOIN towns ON towns.town_id = addresses.town_id
WHERE towns.name IN ('San Francisco', 'Sofia', 'Carnation')
ORDER BY town_id, address_id;

--		3

SELECT employee_id, first_name, last_name, department_id, salary 
FROM employees
WHERE manager_id IS NULL;

--		4

SELECT AVG(salary) FROM employees;
 
 SELECT COUNT(*) AS 'count' FROM employees 
 WHERE salary > (SELECT AVG(salary) FROM employees);














