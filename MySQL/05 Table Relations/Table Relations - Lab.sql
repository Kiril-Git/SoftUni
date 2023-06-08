CREATE DATABASE mountains_and_peaks;

--		1

CREATE TABLE `mountains`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR (30) 
);

CREATE TABLE `peaks`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR (30),
`mountains_id` INT,
CONSTRAINT `peaks_mountains_id`
FOREIGN KEY (`mountains_id`) REFERENCES mountains (`id`) ON DELETE CASCADE
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

 --		2
 USE camp;
 
SELECT 
    driver_id,
    vehicle_type,
    CONCAT_WS(' ',first_name, last_name) AS driver_name
FROM
    vehicles
        JOIN
    campers ON driver_id = campers.id;
 
--		3

SELECT 
    starting_point AS 'route_starting_point',
    end_point AS 'route_ending_point',
    leader_id,
    CONCAT_WS(' ', first_name, last_name) AS leader_name
FROM
    routes
        JOIN
    campers ON leader_id = campers.id;
    
    --		4
    
    USE mountains_and_peaks;
    
    DELETE FROM mountains WHERE id = 1;
    
    --		53
    
    CREATE DATABASE project_management_db;
    
    CREATE TABLE employees(
    id INT(11) PRIMARY KEY AUTO_INCREMENT,
	`first_name` VARCHAR (30) ,
	`last_name` VARCHAR (30) ,
	project_id INT(11),
    
	CONSTRAINT `fk_project_id`
	FOREIGN KEY (`project_id`) REFERENCES projects (`id`) ON DELETE CASCADE
    );
    
    CREATE TABLE clients(
    id INT(11) PRIMARY KEY AUTO_INCREMENT,
	`client_name` VARCHAR (100) 
    
    );
    
       CREATE TABLE projects(
    id INT(11) PRIMARY KEY AUTO_INCREMENT,
	client_id INT(11),
	project_lead_id INT(11),
	
    CONSTRAINT `fk_client_id`
	FOREIGN KEY (`client_id`) REFERENCES clients (`id`) ON DELETE CASCADE
    );
    
    ALTER TABLE projects ADD
    CONSTRAINT `fk_project_lead_id`
	FOREIGN KEY (`project_lead_id`) REFERENCES employees (`id`) ON DELETE CASCADE;
    
    SELECT * FROM projects;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    




