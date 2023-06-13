--		1:

SELECT employee_id,	job_title,	e.address_id,	address_text 
FROM employees AS e
JOIN addresses AS a ON a.address_id = e.address_id
ORDER BY address_id
LIMIT 5;