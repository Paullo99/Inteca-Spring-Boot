DROP DATABASE IF EXISTS `CreditDB`;
CREATE DATABASE `CreditDB`;
USE `CreditDB`;

CREATE TABLE `Credit` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `CreditName` varchar(255) NOT NULL,
   PRIMARY KEY (`ID`)
) AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `Credit` VALUES
(1, 'Kredyt 1'),
(2, 'Inny kredyt'),
(3, 'Kredyt lojanościowy'),
(4, 'Kredyt pod zastaw');