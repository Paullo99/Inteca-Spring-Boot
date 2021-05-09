DROP DATABASE IF EXISTS `CustomerDB`;
CREATE DATABASE `CustomerDB`;
USE `CustomerDB`;

CREATE TABLE `Customer` (
  `CreditID` int NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(255) NOT NULL,
  `Surname` varchar(255) NOT NULL,
  `Pesel` varchar(255) NOT NULL,
   PRIMARY KEY (`CreditID`)
) AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `Customer` VALUES
(1, 'Jan', 'Kowalski', '990219035012'),
(2, 'Ewa', 'Nowak', '92419214421'),
(3, 'Michał', 'Piątek', '0024321412'),
(4, 'Artur', 'Zysek', '8042142121');