/*
SQLyog Ultimate - MySQL GUI v8.32 
MySQL - 5.5.20 : Database - mybatis
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatis` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mybatis`;

/*Table structure for table `mytables` */

DROP TABLE IF EXISTS `mytables`;

CREATE TABLE `mytables` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `ISBN` varchar(50) NOT NULL,
  `name` varchar(19) NOT NULL,
  `price` int(10) NOT NULL,
  `discount` varchar(10) NOT NULL,
  `publisher` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `mytables` */

insert  into `mytables`(`id`,`ISBN`,`name`,`price`,`discount`,`publisher`) values (1,'k58282-1-1-','李白',50,'5折','广东省'),(2,'k53821-1-3','李让',51,'5折','广西省'),(3,'k6832-135e-1','王菲',68,'5折','武汉');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
