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
-- Table structure for table `customer6001`
--

DROP TABLE IF EXISTS `customer6001`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer6001` (
  `invoiceId` varchar(45) DEFAULT NULL,
  `transactionId` varchar(45) DEFAULT NULL,
  `salesValue` int(8) DEFAULT NULL,
  `payment` int(8) DEFAULT NULL,
  `newReceivable` int(8) DEFAULT NULL,
  `previousReceivable` int(8) DEFAULT NULL,
  `totalReceivable` int(8) DEFAULT NULL,
  `sellingDate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer6001`
--

LOCK TABLES `customer6001` WRITE;
/*!40000 ALTER TABLE `customer6001` DISABLE KEYS */;
INSERT INTO `customer6001` VALUES ('9001','5006',360,300,60,0,60,'2018-06-15'),('9002','5006',2300,2000,300,60,360,'2018-06-15'),('9003','5006',1200,1000,200,360,560,'2018-06-15'),('9005','5016',336,336,0,560,560,'2018-06-26'),('9006','5018',870,800,70,560,630,'2018-06-26'),('9007','5023',863,800,63,630,693,'2018-07-04'),('9008','5026',777,129,648,693,1341,'2018-07-05'),('9009','5027',4800,4000,800,1341,2141,'2018-07-05'),('9008','5028',75,50,25,2141,2166,'2018-07-05'),('9010','5035',0,100,0,0,2041,'2018-07-12'),('9011','5036',0,200,0,0,1841,'2018-07-12'),('9009','5037',290,100,190,2166,2356,'2018-07-13'),('9011','5039',60,50,10,2356,2366,'2018-07-13'),('9012','5040',55,50,5,2366,2371,'2018-07-13'),('9013','5041',170,150,20,2371,2391,'2018-07-13'),('9014','5042',70,60,10,2391,2401,'2018-07-13'),('9015','5043',80,60,20,2401,2421,'2018-07-13'),('9016','5044',40,35,5,2421,2426,'2018-07-13'),('9017','5045',55,50,5,2426,2431,'2018-07-13'),('9018','5046',18,15,3,2431,2434,'2018-07-13'),('9019','5047',220,200,20,2434,2454,'2018-07-13'),('9020','5048',105,100,5,2454,2459,'2018-07-13'),('9021','5049',60,55,5,2459,2464,'2018-07-13'),('9022','5050',395,96,299,2464,2763,'2018-07-13'),('9023','5051',275,200,75,2763,2838,'2018-07-13'),('9024','5052',55,0,55,2838,2893,'2018-07-13'),('9025','5053',230,0,230,2893,3123,'2018-07-13'),('9026','5054',975,0,975,3123,4098,'2018-07-13'),('9027','5055',100,0,100,4098,4198,'2018-07-13'),('9028','5056',100,100,0,4198,4198,'2018-07-13'),('9029','5057',55,0,55,4198,4253,'2018-07-13'),('9030','5058',80,0,80,4253,4333,'2018-07-13'),('9031','5059',76,2,74,4333,4407,'2018-07-13'),('9032','5060',80,0,80,4407,4487,'2018-07-13'),('9033','5061',60,0,60,4487,4547,'2018-07-13'),('9034','5062',80,0,80,4547,4627,'2018-07-13'),('9035','5063',60,0,60,4627,4687,'2018-07-13'),('9036','5064',60,0,60,4687,4747,'2018-07-13'),('9037','5065',80,0,80,4747,4827,'2018-07-13'),('9038','5066',60,0,60,4827,4887,'2018-07-13'),('9039','5067',60,0,60,4887,4947,'2018-07-14'),('9040','5068',40,0,40,4947,4987,'2018-07-14'),('9041','5069',20,0,20,4987,5007,'2018-07-14'),('9042','5070',40,0,40,5007,5047,'2018-07-14'),('9043','5071',55,0,55,5047,5102,'2018-07-14'),('9044','5072',40,0,40,5102,5142,'2018-07-14'),('9045','5073',40,0,40,5142,5182,'2018-07-14'),('9046','5074',20,0,20,5182,5202,'2018-07-14'),('9047','5075',20,0,20,5202,5222,'2018-07-14'),('9048','5076',20,0,0,5222,5222,'2018-07-14'),('9049','5077',28,20,8,5222,5230,'2018-08-07'),('9050','5078',17,10,7,5230,5237,'2018-08-07'),('9051','5079',20,10,10,5237,5247,'2018-08-07'),('9052','5080',37,33,4,5247,5251,'2018-08-07'),('9053','5081',20,10,10,5251,5261,'2018-08-07'),('9054','5082',20,6,14,5261,5275,'2018-08-07');
/*!40000 ALTER TABLE `customer6001` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-17 18:56:44
