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
-- Table structure for table `sales`
--

DROP TABLE IF EXISTS `sales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sales` (
  `invoiceId` varchar(45) NOT NULL,
  `transactionId` varchar(45) DEFAULT NULL,
  `customerId` varchar(45) DEFAULT NULL,
  `customerName` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `grossSales` int(11) DEFAULT NULL,
  `discount` int(11) DEFAULT NULL,
  `transport` int(11) DEFAULT NULL,
  `netSales` int(11) DEFAULT NULL,
  `payment` int(11) DEFAULT NULL,
  `receivable` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`invoiceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sales`
--

LOCK TABLES `sales` WRITE;
/*!40000 ALTER TABLE `sales` DISABLE KEYS */;
INSERT INTO `sales` VALUES ('9001','5006','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',360,0,0,360,300,60,'2018-06-15'),('9002','5006','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',2400,50,50,2300,2000,300,'2018-06-15'),('9003','5006','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',1200,0,0,1200,1000,200,'2018-06-15'),('9005','5016','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',360,12,12,336,336,0,'2018-06-26'),('9006','5018','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',870,0,0,870,800,70,'2018-06-26'),('9007','5023','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',875,0,12,863,800,63,'2018-07-04'),('9008','5028','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',75,0,0,75,50,25,'2018-07-05'),('9009','5037','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',290,0,0,290,100,190,'2018-07-13'),('9010','5038','6002','Md.Abdual karim','Youth development Corpo.',20,0,0,20,15,5,'2018-07-13'),('9011','5039','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',60,0,0,60,50,10,'2018-07-13'),('9012','5040','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',55,0,0,55,50,5,'2018-07-13'),('9013','5041','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',190,10,10,170,150,20,'2018-07-13'),('9014','5042','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',70,0,0,70,60,10,'2018-07-13'),('9015','5043','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',80,0,0,80,60,20,'2018-07-13'),('9016','5044','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',40,0,0,40,35,5,'2018-07-13'),('9017','5045','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',60,2,3,55,50,5,'2018-07-13'),('9018','5046','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',20,1,1,18,15,3,'2018-07-13'),('9019','5047','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',260,20,20,220,200,20,'2018-07-13'),('9020','5048','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',105,0,0,105,100,5,'2018-07-13'),('9021','5049','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',60,0,0,60,55,5,'2018-07-13'),('9022','5050','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',395,0,0,395,96,299,'2018-07-13'),('9023','5051','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',275,0,0,275,200,75,'2018-07-13'),('9024','5052','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',55,0,0,55,0,55,'2018-07-13'),('9025','5053','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',230,0,0,230,0,230,'2018-07-13'),('9026','5054','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',975,0,0,975,0,975,'2018-07-13'),('9027','5055','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',100,0,0,100,0,100,'2018-07-13'),('9028','5056','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',100,0,0,100,100,0,'2018-07-13'),('9029','5057','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',55,0,0,55,0,55,'2018-07-13'),('9030','5058','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',80,0,0,80,0,80,'2018-07-13'),('9031','5059','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',80,2,2,76,2,74,'2018-07-13'),('9032','5060','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',80,0,0,80,0,80,'2018-07-13'),('9033','5061','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',60,0,0,60,0,60,'2018-07-13'),('9034','5062','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',80,0,0,80,0,80,'2018-07-13'),('9035','5063','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',60,0,0,60,0,60,'2018-07-13'),('9036','5064','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',60,0,0,60,0,60,'2018-07-13'),('9037','5065','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',80,0,0,80,0,80,'2018-07-13'),('9038','5066','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',60,0,0,60,0,60,'2018-07-13'),('9039','5067','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',60,0,0,60,0,60,'2018-07-14'),('9040','5068','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',40,0,0,40,0,40,'2018-07-14'),('9041','5069','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',20,0,0,20,0,20,'2018-07-14'),('9042','5070','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',40,0,0,40,0,40,'2018-07-14'),('9043','5071','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',55,0,0,55,0,55,'2018-07-14'),('9044','5072','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',40,0,0,40,0,40,'2018-07-14'),('9045','5073','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',40,0,0,40,0,40,'2018-07-14'),('9046','5074','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',20,0,0,20,0,20,'2018-07-14'),('9047','5075','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',20,0,0,20,0,20,'2018-07-14'),('9048','5076','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',20,0,0,20,0,0,'2018-07-14'),('9049','5077','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',40,0,12,28,20,8,'2018-08-07'),('9050','5078','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',20,2,1,17,10,7,'2018-08-07'),('9051','5079','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',20,0,0,20,10,10,'2018-08-07'),('9052','5080','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',40,3,0,37,33,4,'2018-08-07'),('9053','5081','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',20,0,0,20,10,10,'2018-08-07'),('9054','5082','6001','Md.Mahbubur Rahman','Bangladesh sastho seva cor.',20,0,0,20,6,14,'2018-08-07'),('9055','5083','6003','Sujit Bhowmik','Legacy co.',40,0,0,40,0,40,'2018-08-07'),('9056','5088','6003','Sujit Bhowmik','Legacy co.',45000,35,0,44965,44000,965,'2018-08-08');
/*!40000 ALTER TABLE `sales` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-17 18:56:38
