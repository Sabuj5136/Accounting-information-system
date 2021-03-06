-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: informationsystem
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `supplier7004`
--

DROP TABLE IF EXISTS `supplier7004`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplier7004` (
  `productId` varchar(45) DEFAULT NULL,
  `transactionId` varchar(45) DEFAULT NULL,
  `productName` varchar(45) DEFAULT NULL,
  `quantity` int(8) DEFAULT NULL,
  `unitCostPrice` int(8) DEFAULT NULL,
  `totalCost` int(8) DEFAULT NULL,
  `payment` int(8) DEFAULT NULL,
  `newPayable` int(8) DEFAULT NULL,
  `previousPayable` int(8) DEFAULT NULL,
  `totalPayable` int(8) DEFAULT NULL,
  `purchaseDate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier7004`
--

LOCK TABLES `supplier7004` WRITE;
/*!40000 ALTER TABLE `supplier7004` DISABLE KEYS */;
INSERT INTO `supplier7004` VALUES ('1002','5029','Ram',10,15,150,100,50,0,50,'2018-07-05'),('1002','5030','Ram',10,15,150,100,50,50,100,'2018-07-05'),('1002','5084','Ram',100,500,50000,45000,5000,100,5100,'2018-08-08');
/*!40000 ALTER TABLE `supplier7004` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-17 18:56:35
