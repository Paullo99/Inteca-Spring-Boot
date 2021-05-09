DROP DATABASE IF EXISTS `ProductDB`;
CREATE DATABASE `ProductDB`;
USE `ProductDB`;

CREATE TABLE `Product` (
  `CreditID` int NOT NULL AUTO_INCREMENT,
  `ProductName` varchar(255) NOT NULL,
  `Value` int NOT NULL,
   PRIMARY KEY (`CreditID`)
) AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `Product` VALUES
(1, 'Ex1', 100000),
(2, 'Ex2', 500000),
(3, 'Ex3', 300000),
(4, 'Ex4', 450000);
