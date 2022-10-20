CREATE DATABASE `minions`;

USE `minions`;

CREATE TABLE `minions`(

`id` INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(30) NOT NULL,
`age` INT

);
CREATE TABLE `towns`(

`id` INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(30) NOT NULL

);
ALTER TABLE `minions`
ADD COLUMN `id_town` INT NOT NULL;

ALTER TABLE `minions`
ADD CONSTRAINT fk_minions_towns FOREIGN KEY(
`id_town`) REFERENCES `towns` (`id`);

INSERT INTO `towns` (name) VALUES ('Sofia');
INSERT INTO `towns` (name) VALUES ('Muletarovo');
INSERT INTO `minions` (name, age, id_town) VALUES ('Donga', 51, 1);
INSERT INTO `minions` (name, age, id_town) VALUES ('Kozhata', 51, 2);

 TRUNCATE TABLE `minions`;







