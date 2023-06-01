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

--  	5

SELECT name FROM towns WHERE length(name) IN (5, 6) ORDER BY name;

-- 		6

SELECT town_id, name FROM towns WHERE name LIKE 'b%' or name LIKE 'm%' ORDER BY name;

SELECT town_id, name FROM towns WHERE SUBSTR(name, 1, 1) IN ('m', 'b', 'k', 'e') ORDER BY name;

SELECT town_id, name FROM towns WHERE LEFT(name, 1) IN ('m', 'b', 'k', 'e') ORDER BY name;

--  	7

SELECT town_id, name FROM towns WHERE LEFT(name, 1) NOT IN ('r', 'b', 'd') ORDER BY name;

SELECT town_id, name FROM towns WHERE name NOT REGEXP '^[[r|b|d]]' ORDER BY name;

SELECT town_id, name FROM towns WHERE name  REGEXP '^[^rbd]' ORDER BY name;

--		8

CREATE VIEW  v_employees_hired_after_2000 AS 
SELECT first_name, last_name FROM employees WHERE YEAR(hire_date) > 2000;

SELECT * FROM  v_employees_hired_after_2000;

--		9

SELECT first_name, last_name FROM employees WHERE LENGTH(last_name) = 5;

--		10

SELECT country_name, iso_code FROM countries WHERE country_name LIKE '%a%a%a%' 
ORDER BY iso_code;

SELECT country_name, iso_code FROM countries WHERE
(char_length( country_name) -
char_length(replace(lower(country_name), 'a', ''))) > 2
ORDER BY iso_code;

SELECT country_name, iso_code FROM countries WHERE country_name REGEXP '.*a.*a.*a.*' 
ORDER BY iso_code;

--		11		REPLACE(left(river_name, 1), 1, '')

SELECT peak_name, river_name, LOWER( CONCAT( peak_name, SUBSTR(river_name, 2)) ) as mix 
FROM  peaks, rivers WHERE 
RIGHT(peak_name, 1) = LEFT(river_name, 1) ORDER BY MIX;

SELECT peak_name, river_name, CONCAT(LOWER(peak_name), SUBSTR(river_name, 2))  as mix FROM  peaks, rivers WHERE 
RIGHT(peak_name, 1) = LEFT(river_name, 1) ORDER BY MIX;

--		12

SELECT `name`, DATE_FORMAT(`start`, '%Y-%m-%d') FROM games WHERE YEAR(`start`) IN (2011, 2012) ORDER BY `start` LIMIT 50;

--  	13

SELECT user_name, SUBSTRING_INDEX( email, '@', -1) as `email provider` FROM 
users ORDER BY `email provider`,  user_name;

SELECT user_name, REGEXP_REPLACE( email, '.*@', '') as `email provider` FROM 
users ORDER BY `email provider`,  user_name;

--		14

SELECT user_name, ip_address FROM users WHERE ip_address LIKE '___.1%.%.___' ORDER BY 
user_name;

--  	15

SELECT name AS 'game', 
CASE
WHEN HOUR(start) BETWEEN 0 AND 11 THEN 'Morning'
WHEN HOUR(start) BETWEEN 12 and 17 THEN 'Afternoon'
ELSE 'Evening'
END AS 'Part of the Day',

CASE 
WHEN duration BETWEEN 0 AND 3 THEN 'Extra Short'
WHEN duration BETWEEN 4 AND 6 THEN 'Short'
WHEN duration BETWEEN 7 AND 10 THEN 'Long'
ELSE 'Extra Long'
END AS 'Duration' FROM games;

--		16

SELECT product_name, order_date,
DATE_ADD(order_date, INTERVAL 3 DAY) AS 'pay_due',
DATE_ADD(order_date, INTERVAL 1 MONTH) AS 'delivery_due'
 FROM orders;




























































































