CREATE DATABASE mountains_and_peaks;

--		1


CREATE TABLE mountains(
id INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR (30) 
);

CREATE TABLE peaks(
id INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR (30),
mountains_id INT,
FOREIGN KEY (mountains_id) REFERENCES mountains (id) ON DELETE CASCADE
);

INSERT INTO mountains (`name`) VALUES 
('Rila'), 
('Pirin');

SELECT * FROM mountains;

INSERT INTO peaks (`name`, mountains_id) VALUES 
('Musala', 1), 
('Vihren', 2);

SELECT * FROM peaks;

--		

SELECT * FROM peaks JOIN mountains ON peaks.mountains_id = mountains_id;

INSERT INTO peaks (`name`, mountains_id) VALUES 
('Муратов връх', 2);

SELECT p.id, p.name, mountains.name FROM peaks AS p
JOIN mountains ON p.mountains_id = mountains.id;







