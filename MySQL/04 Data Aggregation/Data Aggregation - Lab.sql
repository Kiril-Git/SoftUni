SELECT * FROM employees ORDER BY department_id;

SELECT department_id,  SUM(salary) AS 'total_salary' from employees GROUP BY 
department_id ORDER BY department_id;

--		1

SELECT department_id,  COUNT(id) AS 'Number of employees' from employees GROUP BY 
department_id ORDER BY department_id, 'Number of employees';



