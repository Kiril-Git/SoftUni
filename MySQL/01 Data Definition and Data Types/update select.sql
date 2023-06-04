SELECT * FROM towns ORDER BY towns.name;
SELECT t.name FROM towns AS t ORDER BY t.name;
SELECT * FROM departments d ORDER BY d.NAME DESC;		# desc order sorting (d stends for departments)
SELECT * FROM employees AS e ORDER BY e.salary;			# AS is optional, eventually :)
UPDATE `employees` SET `hire_date` = '2010-02-02'  WHERE (id = 5);
UPDATE `employees` SET `hire_date` = '2000-03-03'  WHERE (id = 4);
UPDATE `employees` SET `hire_date` = '2010-10-10'  WHERE (id = 3);
UPDATE `employees` SET `hire_date` = '2010-08-08'  WHERE (id = 2);
UPDATE `employees` SET `job_title` = 'Software Engineer'  WHERE (id = 2);
SET SQL_SAFE_UPDATES = 0;
UPDATE `employees` SET `salary` = employees.salary * 1.1;
SELECT e.salary FROM employees AS e;
SELECT * FROM employees AS e;

UPDATE `employees` SET department_id =  id  WHERE (`name` = 'Engineering') ;

