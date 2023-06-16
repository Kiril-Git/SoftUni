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
HAVING year( hire_date) > 1998		--		having hire_date > '1999-01-01 00:00:00'

ORDER BY hire_date ASC
;

--		7:

SELECT e.employee_id,	first_name, p.name AS 'project_name'
FROM employees AS e

JOIN employees_projects AS ep ON ep.employee_id = e.employee_id
JOIN projects AS p ON p.project_id = ep.project_id

WHERE p.start_date > '2002-08-13' AND p.end_date IS NULL
 
ORDER BY e.first_name ASC, p.name ASC
LIMIT 5;	

--		8

SELECT 
e.employee_id,	
first_name, 
IF(YEAR(start_date) >= 2005, NULL, p.name) AS 'project_name'
FROM employees AS e
JOIN employees_projects AS ep ON ep.employee_id = e.employee_id
JOIN projects AS p ON p.project_id = ep.project_id

WHERE e.employee_id = 24	
ORDER BY p.name;

--		9

SELECT e.employee_id,	e.first_name,	e.manager_id, m.first_name AS	'manager_name'
FROM employees AS e
JOIN employees AS m ON m.employee_id = e.manager_id
WHERE e.manager_id IN (3, 7)
ORDER BY e.first_name ASC;

--		10

SELECT e.employee_id,	
CONCAT_WS(' ',e.first_name,	e.last_name) AS 'employee_name',
CONCAT_WS(' ',m.first_name,	m.last_name) AS 'manager_name',
d.name AS 'department_name'

FROM employees AS e
LEFT JOIN employees AS m ON e.manager_id = m.employee_id 
JOIN departments AS d ON d.department_id = e.department_id
ORDER BY e.employee_id
LIMIT 5;

--		11

SELECT  AVG(salary) AS 'min_average_salary' from employees
GROUP BY department_id
ORDER BY min_average_salary
LIMIT 1;

-- 		12

SELECT c.country_code,	
mountain_range,	
peak_name,	
elevation 
FROM peaks AS p
JOIN mountains AS m ON p.mountain_id = m.id
JOIN mountains_countries AS mc ON m.id = mc.mountain_id
JOIN countries AS c ON mc.country_code = c.country_code
WHERE c.country_code = 'BG' and elevation > 2835
ORDER BY elevation  DESC;

--		13

SELECT mc.country_code, COUNT(mountain_range) 
FROM mountains AS m
JOIN mountains_countries AS mc ON m.id = mc.mountain_id
WHERE country_code IN ('BG', 'US', 'RU') 
GROUP BY country_code
ORDER BY COUNT(mountain_range) DESC;

--		14

SELECT country_name,	river_name
FROM countries AS c
LEFT JOIN countries_rivers AS cr ON c.country_code = cr.country_code
LEFT JOIN rivers AS r ON cr.river_id = r.id
WHERE continent_code = 'AF'
ORDER BY country_name ASC;

--		15

SELECT continent_code,	currency_code,	COUNT(*) AS 'currency_usage' 
FROM countries AS c
GROUP BY continent_code, currency_code
HAVING currency_usage > 1
AND currency_usage =  (SELECT COUNT(*) AS currencies_count
FROM countries AS c2
WHERE c2.continent_code = c.continent_code
GROUP BY c2.currency_code
ORDER BY currencies_count DESC
LIMIT 1)
ORDER BY continent_code ASC, currency_code ASC;

--		16

SELECT COUNT(*) AS 'country_count'
 FROM countries
 WHERE country_code NOT IN (SELECT country_code FROM mountains_countries);
 
 --		-
 
 SELECT COUNT(*) AS 'country_count'
 FROM countries AS c
 LEFT JOIN mountains_countries AS mc USING (country_code)
 LEFT JOIN mountains AS m ON mc.mountain_id = m.id
 WHERE m.id IS NULL;
 
 --		17
 
 SELECT country_name, 
 MAX(p.elevation) AS 'highest_peak_elevation',
 MAX(r.length) AS 'longest_river_length'
FROM countries AS c
JOIN mountains_countries AS mc ON c.country_code = mc.country_code
JOIN peaks AS p ON mc.mountain_id = p.mountain_id
JOIN countries_rivers AS cr ON c.country_code = cr.country_code
JOIN rivers AS r ON cr.river_id = r.id
GROUP BY country_name
ORDER BY highest_peak_elevation DESC, longest_river_length DESC, country_name ASC
LIMIT 5;

--		-










