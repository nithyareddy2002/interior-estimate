CREATE DATABASE  IF NOT EXISTS `anurag` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `anurag`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: anurag
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `client` (
  `id` int NOT NULL AUTO_INCREMENT,
  `last_name` varchar(20) DEFAULT NULL,
  `first_name` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `phone_number` int DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=83 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (3,'Pooja','Nithya','xxx@gmail.com',123456,'xxxxxx'),(4,'Pooja','Nithya','xxx@gmail.com',123456,'xxxxxx'),(5,'Pooja','Nithya','xxx@gmail.com',123456,'xxxxxx'),(17,'Pooja','Nithya','xxx@gmail.com',123456,'xxxxxx'),(18,'Pooja','Nithya','xxx@gmail.com',123456,'xxxxxx'),(19,'Pooja','Nithya','xxx@gmail.com',123456,'xxxxxx'),(20,'Pooja','Nithya','xxx@gmail.com',123456,'xxxxxx'),(21,'Pooja','Nithya','xxx@gmail.com',123456,'xxxxxx'),(22,'Pooja','Nithya','xxx@gmail.com',123456,'xxxxxx'),(23,'Pooja','Nithya','xxx@gmail.com',123456,'xxxxxx'),(24,'Sharath','Nithya','xxx@gmail.com',123456,'xxxxxx'),(25,'Sharath','Maadhu','xxx@gmail.com',123456,'xxxxxx'),(26,'Sharath','Maadhu','xxx@gmail.com',123456,'xxxxxx'),(27,'Sharath','Anusha','xxx@gmail.com',123456,'xxxxxx'),(28,'Kudumula','Anusha','xxx@gmail.com',123456789,'123 Sample St'),(29,'K','Anusha','xxx@gmail.com',123456789,'123 Sample St'),(30,'K','Anusha','xxx@gmail.com',123456789,'123 Sample St'),(31,'K','Anusha','xxx@gmail.com',123456789,'123 Sample St'),(32,'K','Anusha','xxx@gmail.com',123456789,'123 Sample St'),(33,'K',NULL,NULL,0,NULL),(34,'Sharath','','',0,''),(35,'test','new','test@gmail.com',123456,'123 test street'),(36,'test3','Sample','test2@gmail.com',123456,'xxxxxx'),(38,'hello','Sample','sample@gmail.com',123456,'xxxxxx'),(39,'new','Sample','sample@gmail.com',123456,'xxxxxx'),(40,'new 2','Sample','sample@gmail.com',123456,'xxxxxx'),(41,'new 3','Sample','sample@gmail.com',123456,'xxxxxx'),(42,'neww','Sample','sample@gmail.com',123456,'xxxxxx'),(43,'neww test','Sample','sample@gmail.com',123456,'xxxxxx'),(45,'neww test','Sample','sample@gmail.com',123456,'xxxxxx'),(46,'neww test','Sample','sample@gmail.com',123456,'xxxxxx'),(55,'neww test','Sample','sample@gmail.com',123456,'xxxxxx'),(61,'neww sharath','Sample','sample@gmail.com',123456,'xxxxxx'),(62,'neww sharath','Sample','sample@gmail.com',123456,'xxxxxx'),(63,'neww sharath','Sample','sample@gmail.com',123456,'xxxxxx'),(70,'neww sharath 2','Sample','sample@gmail.com',123456,'xxxxxx'),(71,'neww sharath 2','Sample','sample@gmail.com',123456,'xxxxxx'),(72,'neww','Sample','sample@gmail.com',123456,'xxxxxx'),(74,'S','Nithya','s@gmail.com',123,'123 st'),(78,'sample','Clientt','samp@gmail.com',123456,'123 street'),(80,'Sampathi','Nithya','sampn@gmail.com',123456,'123 street'),(82,'Reddy','Nithya','nithh@gmail.com',123456,'123 street');
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estimate_hist`
--

DROP TABLE IF EXISTS `estimate_hist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estimate_hist` (
  `action` varchar(8) DEFAULT 'insert',
  `revision` int NOT NULL AUTO_INCREMENT,
  `inserted_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `id` int NOT NULL,
  `client_id` int DEFAULT NULL,
  `property_address_id` int DEFAULT NULL,
  `room_id` int DEFAULT NULL,
  `unit_id` int DEFAULT NULL,
  `length` float DEFAULT NULL,
  `height` float DEFAULT NULL,
  `depth` float DEFAULT NULL,
  `area` double DEFAULT NULL,
  `finish_id` int DEFAULT NULL,
  `brand_id` int DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `price_per_sft` double DEFAULT NULL,
  `total` double DEFAULT NULL,
  `created_time` timestamp NULL DEFAULT NULL,
  `modified_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`,`revision`),
  KEY `client_id` (`client_id`),
  KEY `property_address_id` (`property_address_id`),
  KEY `room_id` (`room_id`),
  KEY `unit_id` (`unit_id`),
  KEY `finish_id` (`finish_id`),
  KEY `brand_id` (`brand_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estimate_hist`
--

LOCK TABLES `estimate_hist` WRITE;
/*!40000 ALTER TABLE `estimate_hist` DISABLE KEYS */;
INSERT INTO `estimate_hist` VALUES ('insert',1,'2024-07-19 09:19:47',1,1,1,1,1,5,5,5,5,1,1,1,10,NULL,NULL,NULL),('update',2,'2024-07-19 09:22:35',1,1,1,1,1,10,5,5,5,1,1,1,10,NULL,NULL,NULL),('delete',3,'2024-07-19 09:24:38',1,1,1,1,1,10,5,5,5,1,1,1,10,NULL,NULL,NULL),('insert',4,'2024-07-20 05:57:59',1,1,1,1,1,5,5,5,25,1,1,1,100,2500,NULL,NULL),('delete',5,'2024-07-20 09:00:10',1,1,1,1,1,5,5,5,25,1,1,1,100,2500,NULL,NULL);
/*!40000 ALTER TABLE `estimate_hist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `material`
--

DROP TABLE IF EXISTS `material`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `material` (
  `id` int NOT NULL,
  `cost` double DEFAULT NULL,
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `material`
--

LOCK TABLES `material` WRITE;
/*!40000 ALTER TABLE `material` DISABLE KEYS */;
INSERT INTO `material` VALUES (1,50,'plywood branded'),(2,25,'plywood non-branded'),(3,75,'laminate branded'),(4,55,'laminate non-branded');
/*!40000 ALTER TABLE `material` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `property`
--

DROP TABLE IF EXISTS `property`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `property` (
  `id` int NOT NULL AUTO_INCREMENT,
  `addressline1` varchar(100) NOT NULL,
  `addressline2` varchar(100) DEFAULT NULL,
  `city` varchar(20) NOT NULL,
  `postal_code` int NOT NULL,
  `property_type_id` int DEFAULT NULL,
  `client_id` int NOT NULL,
  `status` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `property_id` (`property_type_id`),
  KEY `client_id` (`client_id`),
  CONSTRAINT `property_ibfk_1` FOREIGN KEY (`property_type_id`) REFERENCES `property_type` (`id`),
  CONSTRAINT `property_ibfk_2` FOREIGN KEY (`client_id`) REFERENCES `client` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `property`
--

LOCK TABLES `property` WRITE;
/*!40000 ALTER TABLE `property` DISABLE KEYS */;
INSERT INTO `property` VALUES (3,'12345 apt 2',NULL,'hyd',500036,1,17,NULL),(4,'12345 apt 420',NULL,'hyd',500036,1,19,NULL),(5,'12345 apt 420',NULL,'hyd',500036,1,20,NULL),(6,'12345 apt 420',NULL,'hyd',500036,2,21,NULL),(7,'0123','12','hyd',500020,1,25,'active'),(24,'12345 apt 2',NULL,'hyd',500036,1,71,'active'),(25,'12345 apt 2',NULL,'hyd',500036,1,72,'active'),(28,'2307 Apt 1','','FWA',46835,1,80,''),(30,'123 street ','','fw',46835,2,82,'');
/*!40000 ALTER TABLE `property` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `property_type`
--

DROP TABLE IF EXISTS `property_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `property_type` (
  `id` int NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `is_obsolete` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `property_type`
--

LOCK TABLES `property_type` WRITE;
/*!40000 ALTER TABLE `property_type` DISABLE KEYS */;
INSERT INTO `property_type` VALUES (1,'apartment',1),(2,'studio',1),(3,'villa',1);
/*!40000 ALTER TABLE `property_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room` (
  `id` int NOT NULL AUTO_INCREMENT,
  `property_id` int DEFAULT NULL,
  `room_type_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `room_type_id` (`room_type_id`),
  KEY `property_id` (`property_id`),
  CONSTRAINT `room_ibfk_2` FOREIGN KEY (`room_type_id`) REFERENCES `room_type` (`id`),
  CONSTRAINT `room_ibfk_3` FOREIGN KEY (`property_id`) REFERENCES `property` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (4,25,1),(7,28,3),(9,30,2);
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room_type`
--

DROP TABLE IF EXISTS `room_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room_type` (
  `id` int NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `is_obsolete` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room_type`
--

LOCK TABLES `room_type` WRITE;
/*!40000 ALTER TABLE `room_type` DISABLE KEYS */;
INSERT INTO `room_type` VALUES (1,'kitchen',0),(2,'M Bedrrom1',0),(3,'Living Room',0);
/*!40000 ALTER TABLE `room_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unit`
--

DROP TABLE IF EXISTS `unit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `unit` (
  `id` int NOT NULL AUTO_INCREMENT,
  `category` varchar(10) NOT NULL,
  `unit_name` varchar(10) NOT NULL,
  `unit_type_id` int DEFAULT NULL,
  `room_id` int DEFAULT NULL,
  `length` float DEFAULT NULL,
  `height` float DEFAULT NULL,
  `depth` float DEFAULT NULL,
  `finish_id` int DEFAULT NULL,
  `material_id` int DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `created_time` timestamp NULL DEFAULT NULL,
  `modified_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `finish_id` (`finish_id`),
  KEY `material_id` (`material_id`),
  KEY `room_id` (`room_id`),
  CONSTRAINT `unit_ibfk_11` FOREIGN KEY (`room_id`) REFERENCES `room` (`id`),
  CONSTRAINT `unit_ibfk_8` FOREIGN KEY (`finish_id`) REFERENCES `material` (`id`),
  CONSTRAINT `unit_ibfk_9` FOREIGN KEY (`material_id`) REFERENCES `material` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unit`
--

LOCK TABLES `unit` WRITE;
/*!40000 ALTER TABLE `unit` DISABLE KEYS */;
INSERT INTO `unit` VALUES (2,'Carpentry','Table',NULL,4,10,10,5,1,2,2,NULL,NULL),(4,'Carpentry','Table',NULL,7,10,10,5,4,3,2,NULL,NULL),(5,'Carpentry','table',NULL,9,15,10,10,1,1,1,NULL,NULL);
/*!40000 ALTER TABLE `unit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'anurag'
--

--
-- Dumping routines for database 'anurag'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-31 23:03:04
