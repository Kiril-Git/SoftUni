USE book_library;

SELECT id, title FROM books;

SELECT id, SUBSTRING(title, 1, 10) FROM books;

SELECT substring('123456789', 2, 5);	--	23456

SELECT substring('123456789', -3);		-- 789

-- 2

SELECT titlle FROM books WHERE substr(title, 1, 3) = 'The';












