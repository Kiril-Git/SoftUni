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

-- -




