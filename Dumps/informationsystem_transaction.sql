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
-- Table structure for table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transaction` (
  `transactionId` varchar(45) NOT NULL,
  `amount` int(11) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `cash` int(11) DEFAULT NULL,
  `nonCash` int(11) DEFAULT NULL,
  PRIMARY KEY (`transactionId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction`
--

LOCK TABLES `transaction` WRITE;
/*!40000 ALTER TABLE `transaction` DISABLE KEYS */;
INSERT INTO `transaction` VALUES ('5001',1200,'payment','2018-06-14',500,500),('5002',7000,'payment','2018-06-14',2000,3000),('5003',8000,'payment','2018-06-14',7000,1000),('5004',12220,'payment','2018-06-14',12220,0),('5005',20500,'payment','2018-06-15',18500,2000),('5006',1200,'sales','2018-06-15',1000,200),('5007',12000,'payment','2018-06-16',12000,0),('5008',1447,'payment','2018-06-21',2592,-1145),('5009',456,'payment','2018-06-25',456,0),('5010',456,'payment','2018-06-25',456,0),('5011',456,'payment','2018-06-25',456,0),('5012',456,'payment','2018-06-25',456,0),('5013',456,'payment','2018-06-25',456,0),('5014',12100,'payment','2018-06-26',12100,0),('5015',2130,'sales','2018-06-26',2130,0),('5016',336,'sales','2018-06-26',336,0),('5017',567,'payment','2018-06-26',567,0),('5018',870,'sales','2018-06-26',800,70),('5019',1200,'payment','2018-06-26',1000,200),('5020',500,'receive','2018-06-26',500,0),('5021',600,'receive','2018-06-26',600,0),('5022',6200,'payment','2018-07-04',4200,2000),('5023',863,'receive','2018-07-04',800,63),('5024',93,'receive','2018-07-04',93,0),('5025',100,'receive','2018-07-04',100,0),('5026',777,'receive','2018-07-05',129,648),('5027',4800,'receive','2018-07-05',4000,800),('5028',75,'receive','2018-07-05',50,25),('5029',150,'payment','2018-07-05',100,50),('5030',150,'payment','2018-07-05',100,50),('5031',100,'receive','2018-07-12',100,0),('5032',100,'receive','2018-07-12',100,0),('5033',100,'receive','2018-07-12',100,0),('5034',100,'receive','2018-07-12',100,0),('5035',100,'receive','2018-07-12',100,0),('5036',200,'receive','2018-07-12',200,0),('5037',290,'receive','2018-07-13',100,190),('5038',20,'receive','2018-07-13',15,5),('5039',60,'receive','2018-07-13',50,10),('5040',55,'receive','2018-07-13',50,5),('5041',170,'receive','2018-07-13',150,20),('5042',70,'receive','2018-07-13',60,10),('5043',80,'receive','2018-07-13',60,20),('5044',40,'receive','2018-07-13',35,5),('5045',55,'receive','2018-07-13',50,5),('5046',18,'receive','2018-07-13',15,3),('5047',220,'receive','2018-07-13',200,20),('5048',105,'receive','2018-07-13',100,5),('5049',60,'receive','2018-07-13',55,5),('5050',395,'receive','2018-07-13',96,299),('5051',275,'receive','2018-07-13',200,75),('5052',55,'receive','2018-07-13',0,55),('5053',230,'receive','2018-07-13',0,230),('5054',975,'receive','2018-07-13',0,975),('5055',100,'receive','2018-07-13',0,100),('5056',100,'receive','2018-07-13',100,0),('5057',55,'receive','2018-07-13',0,55),('5058',80,'receive','2018-07-13',0,80),('5059',76,'receive','2018-07-13',2,74),('5060',80,'receive','2018-07-13',0,80),('5061',60,'receive','2018-07-13',0,60),('5062',80,'receive','2018-07-13',0,80),('5063',60,'receive','2018-07-13',0,60),('5064',60,'receive','2018-07-13',0,60),('5065',80,'receive','2018-07-13',0,80),('5066',60,'receive','2018-07-13',0,60),('5067',60,'receive','2018-07-14',0,60),('5068',40,'receive','2018-07-14',0,40),('5069',20,'receive','2018-07-14',0,20),('5070',40,'receive','2018-07-14',0,40),('5071',55,'receive','2018-07-14',0,55),('5072',40,'receive','2018-07-14',0,40),('5073',40,'receive','2018-07-14',0,40),('5074',20,'receive','2018-07-14',0,20),('5075',20,'receive','2018-07-14',0,20),('5076',20,'receive','2018-07-14',0,0),('5077',28,'receive','2018-08-07',20,8),('5078',17,'receive','2018-08-07',10,7),('5079',20,'receive','2018-08-07',10,10),('5080',37,'receive','2018-08-07',33,4),('5081',20,'receive','2018-08-07',10,10),('5082',20,'receive','2018-08-07',6,14),('5083',40,'receive','2018-08-07',0,40),('5084',53300,'payment','2018-08-08',48300,5000),('5085',507900,'payment','2018-08-08',497900,10000),('5086',623912,'payment','2018-08-08',573912,50000),('5087',20200,'payment','2018-08-08',18200,2000),('5088',44965,'receive','2018-08-08',44000,965);
/*!40000 ALTER TABLE `transaction` ENABLE KEYS */;
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
