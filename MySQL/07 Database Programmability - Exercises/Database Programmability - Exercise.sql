SET GLOBAL log_bin_trust_function_creators = 1;
SET SQL_SAFE_UPDATES = 0;

--		1

DELIMITER $$

# DROP PROCEDURE usp_get_employees_salary_above_35000;

#   judge ↓
CREATE PROCEDURE usp_get_employees_salary_above_35000()
BEGIN

    SELECT first_name,	last_name FROM employees WHERE salary > 35000
    ORDER BY first_name ASC, last_name ASC , employee_id ASC;

END
#   ↑   judge
$$
DELIMITER ;
;

CALL usp_get_employees_salary_above_35000();

--      2

DELIMITER $$

CREATE PROCEDURE usp_get_employees_salary_above (num DOUBLE(19,4))
BEGIN

    SELECT first_name,	last_name FROM employees WHERE salary >= num
    ORDER BY first_name ASC, last_name ASC , employee_id ASC;

END
$$
DELIMITER ;
;

CALL usp_get_employees_salary_above (50000);

--      3

DELIMITER $$

#        DROP PROCEDURE usp_get_towns_starting_with;

CREATE PROCEDURE usp_get_towns_starting_with  (str VARCHAR(10) )
BEGIN

    SELECT name AS 'town_name' FROM towns WHERE name LIKE CONCAT(str, '%')
    ORDER BY name ;

END
$$
DELIMITER ;
;

CALL usp_get_towns_starting_with  ('CAL');

















