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
-- Table structure for table `billing`
--

DROP TABLE IF EXISTS `billing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `billing` (
  `id` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `model` varchar(45) DEFAULT NULL,
  `unitPrice` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  `invoiceId` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `billing`
--

LOCK TABLES `billing` WRITE;
/*!40000 ALTER TABLE `billing` DISABLE KEYS */;
INSERT INTO `billing` VALUES ('1002','Ram','wer54',20,2,40,'9011'),('1001','C.P.U','SE-345gi',15,1,15,'9012'),('1002','Ram','wer54',20,2,40,'9012'),('1001','C.P.U','SE-345gi',15,10,150,'9013'),('1002','Ram','wer54',20,2,40,'9013'),('1001','C.P.U','SE-345gi',15,2,30,'9014'),('1002','Ram','wer54',20,2,40,'9014'),('1002','Ram','wer54',20,2,40,'9015'),('1002','Ram','wer54',20,2,40,'9015'),('1002','Ram','wer54',20,2,40,'9016'),('1002','Ram','wer54',20,2,40,'9017'),('1002','Ram','wer54',20,1,20,'9017'),('1002','Ram','wer54',20,1,20,'9018'),('1002','Ram','wer54',20,2,40,'9019'),('1002','Ram','wer54',20,1,20,'9019'),('1002','Ram','wer54',20,10,200,'9019'),('1001','C.P.U','SE-345gi',15,3,45,'9020'),('1002','Ram','wer54',20,3,60,'9020'),('1001','C.P.U','SE-345gi',15,2,30,'9021'),('1001','C.P.U','SE-345gi',15,2,30,'9021'),('1002','Ram','wer54',20,10,200,'9022'),('1001','C.P.U','SE-345gi',15,13,195,'9022'),('1002','Ram','wer54',20,10,200,'9023'),('1001','C.P.U','SE-345gi',15,1,15,'9023'),('1002','Ram','wer54',20,3,60,'9023'),('1001','C.P.U','SE-345gi',15,1,15,'9024'),('1002','Ram','wer54',20,2,40,'9024'),('1002','Ram','wer54',20,10,200,'9025'),('1001','C.P.U','SE-345gi',15,2,30,'9025'),('1002','Ram','wer54',20,45,900,'9026'),('1001','C.P.U','SE-345gi',15,1,15,'9026'),('1002','Ram','wer54',20,3,60,'9026'),('1002','Ram','wer54',20,2,40,'9027'),('1001','C.P.U','SE-345gi',15,2,30,'9027'),('1001','C.P.U','SE-345gi',15,2,30,'9027'),('1001','C.P.U','SE-345gi',15,2,30,'9028'),('1001','C.P.U','SE-345gi',15,2,30,'9028'),('1002','Ram','wer54',20,2,40,'9028'),('1001','C.P.U','SE-345gi',15,1,15,'9029'),('1002','Ram','wer54',20,2,40,'9029'),('1002','Ram','wer54',20,2,40,'9030'),('1002','Ram','wer54',20,2,40,'9030'),('1002','Ram','wer54',20,2,40,'9031'),('1002','Ram','wer54',20,2,40,'9031'),('1002','Ram','wer54',20,2,40,'9032'),('1002','Ram','wer54',20,2,40,'9032'),('1002','Ram','wer54',20,2,40,'9033'),('1002','Ram','wer54',20,1,20,'9033'),('1002','Ram','wer54',20,2,40,'9034'),('1002','Ram','wer54',20,2,40,'9034'),('1002','Ram','wer54',20,2,40,'9035'),('1002','Ram','wer54',20,1,20,'9035'),('1002','Ram','wer54',20,2,40,'9036'),('1002','Ram','wer54',20,1,20,'9036'),('1002','Ram','wer54',20,1,20,'9037'),('1002','Ram','wer54',20,3,60,'9037'),('1002','Ram','wer54',20,1,20,'9038'),('1002','Ram','wer54',20,1,20,'9038'),('1002','Ram','wer54',20,1,20,'9038'),('1002','Ram','wer54',20,2,40,'9039'),('1002','Ram','wer54',20,1,20,'9039'),('1002','Ram','wer54',20,1,20,'9040'),('1002','Ram','wer54',20,1,20,'9040'),('1002','Ram','wer54',20,1,20,'9041'),('1002','Ram','wer54',20,1,20,'9042'),('1002','Ram','wer54',20,1,20,'9042'),('1002','Ram','wer54',20,2,40,'9043'),('1001','C.P.U','SE-345gi',15,1,15,'9043'),('1002','Ram','wer54',20,1,20,'9044'),('1002','Ram','wer54',20,1,20,'9044'),('1002','Ram','wer54',20,1,20,'9045'),('1002','Ram','wer54',20,1,20,'9045'),('1002','Ram','wer54',20,1,20,'9046'),('1002','Ram','wer54',20,1,20,'9047'),('1002','Ram','wer54',20,1,20,'9048'),('1002','Ram','wer54',20,2,40,'9049'),('1002','Ram','wer54',20,1,20,'9050'),('1002','Ram','wer54',20,1,20,'9051'),('1002','Ram','wer54',20,2,40,'9052'),('1002','Ram','wer54',20,1,20,'9053'),('1002','Ram','wer54',20,1,20,'9054'),('1002','Ram','wer54',20,2,40,'9055'),('1001','C.P.U','SE-345gi',1500,10,15000,'9056'),('1001','C.P.U','SE-345gi',1500,10,15000,'9056'),('1001','C.P.U','SE-345gi',1500,10,15000,'9056');
/*!40000 ALTER TABLE `billing` ENABLE KEYS */;
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
