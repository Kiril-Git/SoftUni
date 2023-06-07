CREATE DATABASE mountains_and_peaks;

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