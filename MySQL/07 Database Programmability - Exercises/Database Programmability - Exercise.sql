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

#       Процедурата не връща стойност, а таблица и се вика с call

#       Функцията връща ЕДНА стойност и се вика със SELECT

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

--      4

DELIMITER $$

CREATE PROCEDURE usp_get_employees_from_town  (town VARCHAR(30))
BEGIN

    SELECT first_name,	last_name
    FROM employees AS e
    JOIN addresses a on a.address_id = e.address_id
    JOIN towns t on t.town_id = a.town_id
    WHERE t.name = town
    ORDER BY first_name ASC, last_name ASC , employee_id ASC;

END
$$
DELIMITER ;
;

CALL usp_get_employees_from_town  ('Sofia');

#       Процедурата не връща стойност, а таблица и се вика с call

#       Функцията връща ЕДНА стойност и се вика със SELECT


--      5

DELIMITER $$

CREATE FUNCTION ufn_get_salary_level (salary DECIMAL(19, 4))
    RETURNS VARCHAR(7)
    DETERMINISTIC
    RETURN (
        CASE
            WHEN salary < 30000 THEN 'Low'
            WHEN salary <= 50000 THEN 'Average'
            WHEN salary > 50000 THEN 'High'
        END
        );

DELIMITER ;
;

SELECT ufn_get_salary_level   (500000);

--      6

DELIMITER $$
    DROP PROCEDURE usp_get_employees_by_salary_level_2;

    CREATE PROCEDURE usp_get_employees_by_salary_level_2(salary_level VARCHAR(7))
BEGIN

    SELECT first_name,	last_name FROM employees

    WHERE (SELECT ufn_get_salary_level(salary)) = salary_level

    ORDER BY first_name DESC , last_name DESC ;
END
$$

CALL usp_get_employees_by_salary_level_2('Low');

--      -

CREATE PROCEDURE usp_get_employees_by_salary_level(salary_level VARCHAR(7))
BEGIN

SELECT first_name,	last_name FROM employees

WHERE    (salary > 30000 AND salary_level = 'Low')
   OR    (salary > 50000 AND salary_level = 'High')
   OR    (salary BETWEEN 30000 AND 50000 AND salary_level = 'Average')

ORDER BY first_name DESC , last_name DESC ;
END
$$
DELIMITER ;
;

CALL usp_get_employees_by_salary_level  ('High');














