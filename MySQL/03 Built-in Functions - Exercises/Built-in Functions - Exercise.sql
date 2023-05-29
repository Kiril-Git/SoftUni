SELECT * FROM soft_uni.employees;

--		1

SELECT first_name, last_name FROM employees WHERE first_name LIKE 'sa%';

SELECT first_name, last_name FROM employees WHERE first_name REGEXP '^sa';

SELECT first_name, last_name FROM employees WHERE substr(first_name, 1, 2) = 'Sa';

--		2

SELECT first_name, last_name FROM employees WHERE last_name LIKE '%ei%';

--		3

SELECT first_name FROM employees WHERE department_id in (3, 10) and 
year(hire_date) between 1995 and 2005 order by employee_id asc;

SELECT first_name FROM employees WHERE department_id in (3, 10) and 
hire_date between '1995-01-01' and '2005-12-31' order by employee_id asc;

SELECT first_name FROM employees WHERE department_id in (3, 10) and 
hire_date >= '1995-01-01' and hire_date <= '2005-12-31' order by employee_id asc;

--		4

SELECT first_name, last_name FROM employees WHERE job_title not LIKE '%engineer%';












