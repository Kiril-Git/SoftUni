USE book_library;

SELECT id, title FROM books;

SELECT id, SUBSTRING(title, 1, 10) FROM books;

SELECT substring('123456789', 2, 5);	--	23456

SELECT substring('123456789', -3);		-- 789

-- 1

SELECT title FROM books WHERE substr(title, 1, 3) = 'The';

-- -

SELECT replace('123456789', 123, 000);		-- 0456789

SELECT id, replace(title, 'Murder', '***') FROM books;

-- 2

SELECT replace(title, 'The', '***')
title FROM books WHERE substr(title, 1, 3) = 'The';

-- 

SELECT '          text', ltrim('	  text');		-- 	"text"	(no space - left side)

SELECT '    text    ', rtrim(('	   text  '));		-- 	"text"	(no space - left and right side)

SELECT char_length('абвг'), length('абвг');			-- 4	8

SELECT id, char_length(title), length(title) FROM books;	--	19 	19

SELECT left('123456789', 4);								--	1234
SELECT substring('123456789', 1, 4);						--	1234

SELECT right('123456789', 4);								--	6789
SELECT substring('123456789', -4);							--	6789

SELECT lower('Make your stay in London truly special');		-- all lowercase 
SELECT UPPER('Make your stay in London truly special');		-- all uppercase  

SELECT title FROM books WHERE lower(substring(title, 1, 3)) = 'the';

SELECT reverse('123456789-');	-- reverse function

SELECT repeat('123456789-', 3);	-- repeat function

 SELECT title FROM books WHERE locate('the', title);	-- 	LOCATE function
 
 -- 'The' - Определителен член
 
 SELECT insert('123456789', 7, 3, '000');				-- 123456000 		INSERT & DELETE
 SELECT insert('123456789', 7, 0, '000');				-- 123456000789		INSERT 

-- - 

 SELECT 5 DIV 2;		-- 	2
 SELECT 5 / 2;			-- 	2.5000
 SELECT 5 MOD 2; 		--	1
 SELECT 5 % 2;			-- 	1
 
SELECT PI();			-- 	3.141593
SELECT ABS(5);			--	5
SELECT ABS(-6);			--	6
SELECT SQRT(25);		--	5
SELECT POW(3);			-- 	9

SELECT CONV(13, 10, 2);			--	1101
SELECT CONV(1101, 2, 10);		--	13
SELECT CONV(1101, 2, 16);		--	D

SELECT ROUND(2.356), ROUND(2.356, 2), FLOOR(2.356), CEILING(2.356);		--	2	2.36	2	3

SELECT ROUND (23.356, -1);												-- 20

SELECT SIGN (- 23.356);				-- 	-1		

SELECT RAND();						-- 0.41299254765081456 	(always from 0 to 1)
 
SELECT FLOOR( RAND() * 10);			-- SELECT random number from 1 to 10	(int)

											--	SELECT FLOOR(RAND()*(b-a+1))+a;									

SELECT FLOOR( RAND() * (25-12+1))+12;		-- 	SELECT random number from 12 to 25	(int)

SELECT EXTRACT(YEAR FROM '2023-05-16');		--	2023

SELECT title, extract(year from year_of_release) AS 'Year of Release'
FROM books; 

SELECT TIMESTAMPDIFF(YEAR, '2023-05-16', '2022-05-15');				--	-1
SELECT ABS( TIMESTAMPDIFF(YEAR, '2023-05-16', '2022-05-15'));		--	 1

SELECT TIMESTAMPDIFF(MONTH, '2023-05-31', '2023-05-30');			--	 0
SELECT TIMESTAMPDIFF(MONTH, '2023-05-31', '2023-07-01');			--	 1

 USE mydb;
 SELECT employee_id, CONCAT_WS(' ', first_name, last_name) AS 'Full Name', 
 TIMESTAMPDIFF (YEAR, hire_date, now()) AS 'Years in Service'
 FROM employees;													--	20

--		3

SELECT SUM(cost) FROM books;				--	SELECT SUM(column_name) FROM table_name; 

SELECT ROUND( SUM(cost), 2) FROM books;		--  628.63

--		4

SELECT CONCAT_WS(' ', first_name, last_name) AS 'Full Name', 
 TIMESTAMPDIFF (DAY, born, died) AS 'Days Lived'
 FROM authors;													--	31164
 
 -- 	-
 
 SELECT now();
 
 -- 	-
 
 INSERT INTO authors (first_name, last_name, born) VALUES('Donga', 'Stankov', '1971-10-10');
 UPDATE authors
 SET first_name = 'Делян', last_name = 'Станков'
 WHERE id = 10;
 
 --		-
 
SELECT concat_ws(' ',first_name, last_name) AS 'name',
TIMESTAMPDIFF(YEAR, born, NOW()) AS 'years'
FROM authors;

--		-

SELECT concat_ws(' ', first_name, last_name) AS 'name',
 date_format(born, '%D %M  %x') AS 'born'
FROM authors;

--		5 

SELECT title FROM books WHERE title LIKE 'Harry Potter%';

SELECT title FROM books WHERE title REGEXP 'Harry Potter';

SELECT title FROM books WHERE title REGEXP 'Harry Potter and the [do]';









