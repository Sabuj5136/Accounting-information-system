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
-- Table structure for table `purchase`
--

DROP TABLE IF EXISTS `purchase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchase` (
  `purchaseId` varchar(45) NOT NULL,
  `transactionId` varchar(45) DEFAULT NULL,
  `supplierId` varchar(45) DEFAULT NULL,
  `productId` varchar(45) DEFAULT NULL,
  `productName` varchar(45) DEFAULT NULL,
  `model` varchar(45) DEFAULT NULL,
  `brand` varchar(45) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `costPerUnit` int(11) DEFAULT NULL,
  `totalCostPrice` int(11) DEFAULT NULL,
  `transportCost` int(11) DEFAULT NULL,
  `otherCost` int(11) DEFAULT NULL,
  `totalProductCost` int(11) DEFAULT NULL,
  `payment` int(11) DEFAULT NULL,
  `payable` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`purchaseId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase`
--

LOCK TABLES `purchase` WRITE;
/*!40000 ALTER TABLE `purchase` DISABLE KEYS */;
INSERT INTO `purchase` VALUES ('3001','5003','7002','1002','Monitor','asus-324iuv','Samsung',100,500,50000,10000,5000,65000,40000,10000,'2018-06-14'),('3002','5004','7003','1003','Web-camera','hp-76ui','Hp pavilion',100,50,5000,500,500,6000,4000,1000,'2018-06-14'),('3003','5005','7003','1003','Web-camera','hp-76ui','Hp pavilion',50,100,5000,2000,3000,10000,5000,0,'2018-06-14'),('3004','5006','7001','1001','Key-board','567-oiu','Asus',100,100,10000,100,900,11000,8000,2000,'2018-06-14'),('3005','5007','7001','1004','C.P.U','intel76poq-56','Asus',50,100,5000,1000,1000,7000,1000,4000,'2018-06-14'),('3006','5008','7001','1001','Key-board','567-oiu','Asus',100,50,5000,1000,1000,7000,2000,3000,'2018-06-14'),('3007','5009','7001','1001','Key-board','567-oiu','Asus',100,50,5000,1000,1000,7000,14000,-9000,'2018-06-14'),('3008','5010','7001','1003','Web-camera','hp-76ui','Hp pavilion',100,120,12000,3000,5000,20000,5000,7000,'2018-06-14'),('3009','5011','7001','1004','C.P.U','intel76poq-56','Asus',150,100,15000,5000,1000,21000,5000,10000,'2018-06-14'),('3010','5001','7001','1003','Web-camera','hp-76ui','Hp pavilion',100,10,1000,100,100,1200,500,500,'2018-06-14'),('3011','5002','7001','1001','Key-board','567-oiu','Asus',100,50,5000,1000,1000,7000,2000,3000,'2018-06-14'),('3012','5003','7001','1001','Key-board','567-oiu','Asus',50,60,3000,2000,3000,8000,2000,1000,'2018-06-14'),('3013','5004','7001','1001','C.P.U','SE-345gi','Hp',100,120,12000,100,120,12220,12000,0,'2018-06-14'),('3014','5005','7001','1001','C.P.U','SE-345gi','Hp',200,100,20000,300,200,20500,18000,2000,'2018-06-15'),('3015','5007','7001','1001','C.P.U','SE-345gi','Hp',100,120,12000,0,0,12000,12000,0,'2018-06-16'),('3016','5008','7001','1001','C.P.U','SE-345gi','Hp',120,10,1200,123,124,1447,2345,-1145,'2018-06-21'),('3017','5014','7001','1002','Ram','wer54','hp',100,120,12000,100,0,12100,12000,0,'2018-06-26'),('3018','5019','7001','1001','C.P.U','SE-345gi','Hp',100,10,1000,100,100,1200,800,200,'2018-06-26'),('3019','5022','7003','1002','Ram','wer54','hp',100,50,5000,0,1200,6200,3000,2000,'2018-07-04'),('3020','5029','7004','1002','Ram','wer54','hp',10,15,150,0,0,150,100,50,'2018-07-05'),('3021','5030','7004','1002','Ram','wer54','hp',10,15,150,0,0,150,100,50,'2018-07-05'),('3022','5084','7004','1002','Ram','wer54','hp',100,500,50000,1000,2300,53300,45000,5000,'2018-08-08'),('3023','5085','7003','1001','C.P.U','SE-345gi','Hp',500,1000,500000,5000,2900,507900,490000,10000,'2018-08-08'),('3024','5086','7001','1002','Ram','wer54','hp',500,1200,600000,23456,456,623912,550000,50000,'2018-08-08'),('3025','5087','7005','1002','Ram','wer54','hp',100,200,20000,100,100,20200,18000,2000,'2018-08-08');
/*!40000 ALTER TABLE `purchase` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-17 18:56:49
