--		1:

SELECT employee_id,	job_title,	e.address_id,	address_text 
FROM employees AS e
JOIN addresses AS a ON a.address_id = e.address_id
ORDER BY address_id
LIMIT 5;

--		2:

SELECT first_name,	last_name,	t.name AS 'town',	address_text
FROM employees AS e
JOIN addresses AS a ON a.address_id = e.address_id
JOIN towns AS t ON t.town_id = a.town_id
ORDER BY first_name ASC, last_name
LIMIT 5;

--		3:

SELECT employee_id,	first_name,	last_name,	d.name AS 'department_name'
FROM employees AS e
JOIN departments AS d ON d.department_id = e.department_id
WHERE d.name = 'Sales'
ORDER BY employee_id DESC;

--		4:

SELECT employee_id,	first_name,	salary,	d.name AS 'department_name'
FROM employees AS e
JOIN departments AS d ON d.department_id = e.department_id
WHERE salary > 1500
ORDER BY d.department_id DESC
LIMIT 5;

--		5:

SELECT e.employee_id,	first_name 
FROM employees AS e

LEFT JOIN employees_projects AS ep ON ep.employee_id = e.employee_id
WHERE ep.project_id IS NULL
ORDER BY employee_id DESC
LIMIT 3;

--		6:

SELECT first_name,	last_name,	hire_date,	d.name AS 'dept_name'
FROM employees AS e
JOIN departments AS d ON e.department_id = d.department_id
WHERE e.department_id IN (3, 10)
HAVING year( hire_date) > 1998
ORDER BY hire_date ASC
;

--		










