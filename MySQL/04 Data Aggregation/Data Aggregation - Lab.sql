SELECT * FROM employees ORDER BY department_id;

SELECT department_id,  SUM(salary) AS 'total_salary' from employees GROUP BY 
department_id ORDER BY department_id;

--		1

SELECT department_id,  COUNT(id) AS 'Number of employees' from employees GROUP BY 
department_id ORDER BY department_id, 'Number of employees';

--		-
ALTER TABLE employees
CHANGE COLUMN last_name last_name VARCHAR(30);


UPDATE employees 
SET last_name = NULL 
WHERE id in(2, 4, 6, 8);					

--  	-

ALTER TABLE employees
CHANGE COLUMN salary salary DOUBLE;


UPDATE employees 
SET salary = NULL 
WHERE id in(2, 4, 6, 8);

--		-

SELECT department_id, MAX(first_name) FROM employees GROUP BY department_id;

--		2

SELECT department_id, ROUND(AVG(salary), 2) AS 'Average Salary' FROM employees GROUP BY 
department_id ORDER BY department_id;

--		3

SELECT 
    department_id, ROUND(MIN(salary), 2) AS 'Min Salary'
FROM
    employees
WHERE
    salary > 800
GROUP BY department_id
ORDER BY department_id
LIMIT 1;

--		-

SELECT * FROM employees ORDER BY last_name DESC;

--		-

SELECT 
    department_id, MIN(salary)
FROM
    employees
GROUP BY department_id
HAVING
    MIN(salary) > 800;
    
    --		4
    
    SELECT  COUNT( price) FROM products  WHERE category_id = 2 AND price > 8;
    
    --		5
    
  SELECT 
    category_id, ROUND(AVG(price), 2) AS 'Average Price',
    ROUND(MIN(price), 2) AS 'Cheapest Product',
    ROUND(MAX(price), 2) AS 'Most Expencive Product'
FROM
    products
GROUP BY category_id
ORDER BY category_id;










