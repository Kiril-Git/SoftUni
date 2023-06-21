

SELECT 5;

DELIMITER $$
 CREATE FUNCTION ufn_select_5()
 RETURNS INT
 DETERMINISTIC
 BEGIN
	RETURN (SELECT 5);
 END $$
 
 DELIMITER ;
 DROP FUNCTION ufn_select_5;
 SELECT ufn_select_5();
 SELECT CONCAT('a', 'b'), ufn_select_5();		-- >		ab
 
 SELECT * FROM towns WHERE town_id < ufn_select_5();
 
 --		-
 
 DELIMITER $$
 CREATE FUNCTION ufn_append_before(STR VARCHAR(50))
 RETURNS VARCHAR(75)
 DETERMINISTIC
 BEGIN
	RETURN CONCAT_WS (' ','function', 'str');
    END$$
    DELIMITER ;
    ;
 
 DROP FUNCTION ufn_append_before;
 SELECT ufn_append_before('TEST');
 
 SELECT ufn_append_before(first_name) FROM employees;
 
 --		-
 
  DROP FUNCTION ufn_count_employees_by_town;
 
 DELIMITER $$
 CREATE FUNCTION ufn_count_employees_by_town(`town_name` VARCHAR(50))
 RETURNS INT
 DETERMINISTIC
 BEGIN
 
 RETURN (
 SELECT COUNT(*) 											-- >	21
FROM employees AS e
JOIN addresses AS a ON e.address_id = a.address_id
JOIN towns AS t ON a.town_id = t.town_id
WHERE t.name = town_name
);
 END$$
 
 DELIMITER ;
 ;
 SELECT ufn_count_employees_by_town('Redmond') AS 'Count';		-- >		21
 SELECT name, ufn_count_employees_by_town(name) FROM towns;

--		-

DELIMITER $$
CREATE FUNCTION ufn_return_var()
RETURNS INT 
DETERMINISTIC
BEGIN
	DECLARE result INT;
    SET result := 10;

RETURN result;
END$$

SELECT ufn_return_var()$$					--		10

--		-

DELIMITER $$

DROP PROCEDURE usp_select_employees;

CREATE PROCEDURE usp_select_employees(max_id INT)
BEGIN
	SELECT * FROM employees WHERE employee_id < max_id;
END$$

DELIMITER ;
;
CALL usp_select_employees();

--		-

DELIMITER $$
CREATE PROCEDURE usp_raise_salaries(percent DECIMAL(3, 2), OUT total_increase DECIMAL(19, 4))
BEGIN
	DECLARE local_increase DECIMAL (19, 4);
    SET local_increase := (SELECT ABS(SUM(salary) - SUM(salary) * percent) FROM employees);
    SET total_increase = local_increase;
    
    UPDATE employees SET salary = salary * percent;
END$$
DELIMITER ;
;

SELECT ABS( SUM(salary) - SUM(salary) * 1.1) FROM employees;

SET @increase = 0;
CALL usp_raise_salaries(1.1, @increase);
SELECT @increase;

--		-

DELIMITER $$

DROP PROCEDURE usp_transaction;

CREATE PROCEDURE usp_transaction()
BEGIN
	START TRANSACTION;
		UPDATE employees SET first_name = 'Changed';
        UPDATE towns SET name = 'Changed';
		UPDATE departments SET name = 'Changed';
	ROLLBACK;
END$$
DELIMITER ;
;

SELECT * FROM towns;
CALL usp_transaction();
SELECT * FROM employees;

--		-

CREATE TABLE deleted_employees(
employee_id INT PRIMARY KEY,
first_name VARCHAR(50),
last_name VARCHAR(50),
job_title VARCHAR(50),
department_name VARCHAR(50),
hire_date TIMESTAMP(6)
);

DELIMITER $$
DROP TRIGGER tr_after_delete_employees;
CREATE TRIGGER tr_after_delete_employees
AFTER DELETE
ON employees
FOR EACH ROW
BEGIN
	 INSERT INTO deleted_employees VALUES(
     OLD.employee_id, 
     OLD.first_name, 
     OLD.last_name, 
     OLD.job_title, 
     (SELECT 'name' FROM departments WHERE department_id = OLD.department_id), 
     OLD.hire_date);
END$$
DELIMITER ;
;
UPDATE employees_projects SET employee_id = 3 WHERE employee_id = 2;

DELETE FROM employees WHERE employee_id = 2;


--		1:

DELIMITER $$

DROP FUNCTION ufn_count_employees_by_town;

CREATE FUNCTION ufn_count_employees_by_town(town_name VARCHAR(30)) 
RETURNS INT
DETERMINISTIC
BEGIN
RETURN(
SELECT COUNT(*) FROM employees AS e
	JOIN addresses AS a ON e.address_id = a.address_id
	JOIN towns AS t ON a.town_id = t.town_id
WHERE t.name = town_name
);
END$$

SELECT ufn_count_employees_by_town('Sofia') AS 'count';


--		2

DROP PROCEDURE usp_raise_salaries$$

CREATE PROCEDURE usp_raise_salaries(department_name VARCHAR(30))
BEGIN
    UPDATE employees SET salary = salary * 1.05  WHERE department_id = (
    SELECT department_id FROM departments WHERE name = department_name);
END $$

CALL usp_raise_salaries('Finance')$$
SELECT first_name, salary FROM employees WHERE department_id = 10$$

-- 		-

DROP PROCEDURE usp_raise_salaries_2;

CREATE PROCEDURE usp_raise_salaries_2(department_name VARCHAR(30))
BEGIN
	UPDATE employees AS e
    JOIN departments AS d ON e.department_id = d.department_id
    SET salary = salary * 1.05
    WHERE name = department_name;
	
END $$

CALL usp_raise_salaries_2('Finance')$$
SELECT first_name, salary FROM employees WHERE department_id = 10$$

--		3

CREATE PROCEDURE usp_raise_salary_by_id(id INT) 
BEGIN
	    UPDATE employees SET salary = salary * 1.05  WHERE employee_id = id;

END $$

CALL usp_raise_salary_by_id(17)$$
SELECT  salary FROM employees WHERE employee_id = 17$$

--		4

DROP TABLE deleted_employees;

CREATE TABLE deleted_employees(
employee_id INT PRIMARY KEY AUTO_INCREMENT, 
first_name VARCHAR(30),
last_name VARCHAR(30),
middle_name VARCHAR(30),
job_title VARCHAR(30),
department_id INT,
salary DECIMAL(19, 4)
);

CREATE TRIGGER tr_after_deleted_employees
AFTER DELETE
ON employees
FOR EACH ROW
BEGIN
	 INSERT INTO deleted_employees(
     first_name, last_name, middle_name, job_title, department_id, salary
     )
     VALUES( 
     OLD.first_name, 
     OLD.last_name, 
     OLD.middle_name, 
     OLD.job_title, 
     OLD.department_id,
	 OLD.salary
     );
     
END$$

 --    (SELECT 'name' FROM departments WHERE department_id = OLD.department_id), OLD.hire_date);


UPDATE employees_projects SET employee_id = 3 WHERE employee_id = 2 $$

DELETE FROM employees WHERE employee_id = 2













 
 
 