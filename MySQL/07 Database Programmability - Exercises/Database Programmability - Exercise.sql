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
    --      Преизползваме функцията от 5-та задача ↓
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

--      7

DELIMITER $$
DROP FUNCTION ufn_is_word_comprised;

CREATE FUNCTION ufn_is_word_comprised (set_of_letters varchar(50), word varchar(50))
    RETURNS Binary
    RETURN word REGEXP (CONCAT('^[', set_of_letters, ']+$') ) ;

    SELECT ufn_is_word_comprised   ('0eo9fdid2gas','Sofia');

--      вариант 2 ↓

CREATE FUNCTION ufn_is_word_comprised_2 (set_of_letters varchar(50), word varchar(50))
    RETURNS INT
    DETERMINISTIC
    BEGIN
    DECLARE result INT;
    SET result := ( word REGEXP (CONCAT('^[', set_of_letters, ']+$'))
        );
RETURN result;
    END
    $$

SELECT ufn_is_word_comprised_2   ('0eo9fdid2ga','Sofia');

DELIMITER ;
;

--      8

DELIMITER $$

CREATE PROCEDURE usp_get_holders_full_name ()
BEGIN
    SELECT CONCAT_WS(' ',first_name, last_name) AS 'full_name' FROM account_holders
    ORDER BY full_name ASC , id ASC ;
END
$$

CALL usp_get_holders_full_name();

DELIMITER ;
;

--      9

DELIMITER $$
DROP PROCEDURE usp_get_holders_with_balance_higher_than ;

CREATE PROCEDURE usp_get_holders_with_balance_higher_than(num DECIMAL(19, 4))
BEGIN

    SELECT first_name,	last_name FROM account_holders AS ac
    JOIN accounts AS a ON ac.id = a.account_holder_id
    GROUP BY ac.id
    HAVING  SUM(a.balance) > num
    ORDER BY ac.id ASC;

END
$$

CALL usp_get_holders_with_balance_higher_than(7000);

DELIMITER ;
;

SELECT * from  accounts;
SELECT * from  account_holders;

--      10

DELIMITER $$
DROP FUNCTION ufn_calculate_future_value ;

CREATE FUNCTION ufn_calculate_future_value  (sum DECIMAL(19, 4), interest_rate DOUBLE, term INT)
    RETURNS DECIMAL(19, 4)
    DETERMINISTIC
BEGIN
    DECLARE FV DECIMAL(19, 4);
    SET FV := (sum * POW((1 + interest_rate), term)
);
    RETURN FV;
END
$$

SELECT ufn_calculate_future_value    (1000, 0.5, 5);

DELIMITER ;
;

--      11

DELIMITER $$
DROP PROCEDURE usp_calculate_future_value_for_account ;

CREATE PROCEDURE usp_calculate_future_value_for_account(account_id INT, interest_rate DOUBLE)
BEGIN
    SELECT a.id AS 'account_id', ac.first_name, ac.last_name,
           a.balance AS current_balance,    # преизползваме функцията от задача 10 ↓
           ufn_calculate_future_value( a.balance, interest_rate, 5) AS balance_in_5_years
    FROM account_holders AS ac

    JOIN accounts AS a ON ac.id = a.account_holder_id
    GROUP BY ac.id
    HAVING  SUM(a.balance)

    #   AND (SELECT ufn_calculate_future_value (a.balance, interest_rate, 5))
    ORDER BY ac.id;
END
$$

CALL usp_calculate_future_value_for_account(1, 0.1);
DELIMITER ;
;

SELECT * from  accounts;
SELECT * from  account_holders;

--      12

DELIMITER $$
DROP PROCEDURE usp_deposit_money;

CREATE PROCEDURE usp_deposit_money(account_id INT, money_amount DECIMAL(19, 4))
BEGIN
    IF money_amount > 0 THEN START TRANSACTION ;

        UPDATE accounts AS a
            SET balance = balance + money_amount
            WHERE id = account_id;

        IF (SELECT balance FROM accounts WHERE id = account_id) < 0 THEN ROLLBACK;

            ELSE COMMIT;

        END IF;
    END IF;
END
$$
        CALL usp_deposit_money(1, 10.0);

DELIMITER ;
;

--      13

DELIMITER $$
DROP PROCEDURE usp_withdraw_money ;

CREATE PROCEDURE usp_withdraw_money(account_id INT, money_amount DECIMAL(19, 4))
BEGIN
    IF money_amount > 0 THEN START TRANSACTION ;

    UPDATE accounts AS a
    SET balance = balance - money_amount
    WHERE id = account_id;

    IF (SELECT balance FROM accounts WHERE id = account_id) < 0 THEN ROLLBACK;

    ELSE COMMIT;

    END IF;
    END IF;
END
$$

CALL usp_withdraw_money(1, 10);

DELIMITER ;
;

--      14

DELIMITER $$
DROP PROCEDURE usp_transfer_money ;

CREATE PROCEDURE usp_transfer_money(from_account_id INT, to_account_id INT, amount DECIMAL(19, 4))
BEGIN
    IF amount > 0
           AND
       (SELECT balance FROM accounts WHERE id = from_account_id) >= to_account_id
        AND
       (SELECT id FROM accounts WHERE id = from_account_id) IS NOT NULL
        AND
       (SELECT id FROM accounts WHERE id = to_account_id) IS NOT NULL
    THEN START TRANSACTION  ;

    UPDATE accounts AS a
    SET balance = balance - amount
    WHERE id = from_account_id;

    UPDATE accounts AS a
    SET balance = balance + amount
    WHERE id = to_account_id;

    IF (SELECT balance FROM accounts WHERE id = from_account_id) < 0 THEN ROLLBACK;

    ELSE COMMIT;

    END IF;
    END IF;
END
$$

CALL usp_transfer_money(1, 2, 10);

DELIMITER ;
;

--      15

DROP TABLE logs;

CREATE  TABLE logs(
    log_id INT PRIMARY KEY AUTO_INCREMENT,
    account_id INT NOT NULL ,
    old_sum DECIMAL(19, 4),
    new_sum Decimal(19, 4),

    FOREIGN KEY (account_id) references accounts(id) ON DELETE CASCADE
);

DROP TRIGGER tr_balance_update;

CREATE TRIGGER tr_balance_update
    AFTER UPDATE ON accounts
    FOR EACH ROW
    BEGIN
        IF OLD.balance <> NEW.balance THEN
            INSERT INTO logs(account_id, old_sum, new_sum)
                VALUES (OLD.id, OLD.balance, NEW.balance);
        END IF;
    END;

SELECT * FROM logs;
SELECT  * FROM notification_emails;

--      16

CREATE TABLE notification_emails(
    id INT PRIMARY KEY AUTO_INCREMENT,
    recipient INT,
    subject TEXT,
    body TEXT
    );

CREATE TRIGGER tr_email_notification
    AFTER INSERT ON logs                    --      Преизползваме от задача 15
    FOR EACH ROW
    BEGIN
        INSERT INTO notification_emails ( recipient, subject, body)
            VALUES (NEW.account_id,
                    CONCAT_WS(' ','Balance change for account:', NEW.account_id),
                    CONCAT_WS(' ','On', DATE_FORMAT(NOW(), '%b %d %Y at %r'), 'your balance was changed from',
                        ROUND(NEW.old_sum, 2), 'to', ROUND(NEW.new_sum, 2),'.')
                   );
    END;





























