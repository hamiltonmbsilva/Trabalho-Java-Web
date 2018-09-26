CREATE DATABASE  IF NOT EXISTS `db_cfcweb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `db_cfcweb`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: db_cfcweb
-- ------------------------------------------------------
-- Server version	5.7.22-log

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
-- Table structure for table `atendente`
--

DROP TABLE IF EXISTS `atendente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atendente` (
  `idatendente` int(11) NOT NULL AUTO_INCREMENT,
  `login_idlogin` int(11) NOT NULL,
  PRIMARY KEY (`idatendente`,`login_idlogin`),
  KEY `fk_atendente_login1_idx` (`login_idlogin`),
  CONSTRAINT `fk_atendente_login1` FOREIGN KEY (`login_idlogin`) REFERENCES `login` (`idlogin`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `endereco` (
  `idendereco` int(11) NOT NULL AUTO_INCREMENT,
  `rua` varchar(45) NOT NULL,
  `complemento` varchar(45) NOT NULL,
  `numero` int(11) NOT NULL,
  `cidade` varchar(45) NOT NULL,
  `estado` varchar(45) NOT NULL,
  PRIMARY KEY (`idendereco`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `idlogin` int(11) NOT NULL AUTO_INCREMENT,
  `status` varchar(45) NOT NULL,
  `login` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `painel` varchar(45) NOT NULL,
  PRIMARY KEY (`idlogin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `professor`
--

DROP TABLE IF EXISTS `professor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `professor` (
  `idprofessor` int(11) NOT NULL AUTO_INCREMENT,
  `login_idlogin` int(11) NOT NULL,
  `usuario_idusuario` int(11) NOT NULL,
  PRIMARY KEY (`idprofessor`,`login_idlogin`,`usuario_idusuario`),
  KEY `fk_professor_login1_idx` (`login_idlogin`),
  KEY `fk_professor_usuario1_idx` (`usuario_idusuario`),
  CONSTRAINT `fk_professor_login1` FOREIGN KEY (`login_idlogin`) REFERENCES `login` (`idlogin`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_professor_usuario1` FOREIGN KEY (`usuario_idusuario`) REFERENCES `usuario` (`idusuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tabela_aula`
--

DROP TABLE IF EXISTS `tabela_aula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tabela_aula` (
  `idtabela_aula` int(11) NOT NULL AUTO_INCREMENT,
  `aula_teorica` varchar(20) NOT NULL,
  `aula_pratica` varchar(20) NOT NULL,
  `marcar_simulado` varchar(20) NOT NULL,
  `aula_dada` tinyint(4) NOT NULL,
  `usuario_idusuario` int(11) NOT NULL,
  `professor_idprofessor` int(11) NOT NULL,
  `professor_login_idlogin` int(11) NOT NULL,
  `professor_usuario_idusuario` int(11) NOT NULL,
  PRIMARY KEY (`idtabela_aula`,`usuario_idusuario`,`professor_idprofessor`,`professor_login_idlogin`,`professor_usuario_idusuario`),
  KEY `fk_tabela_aula_usuario1_idx` (`usuario_idusuario`),
  KEY `fk_tabela_aula_professor1_idx` (`professor_idprofessor`,`professor_login_idlogin`,`professor_usuario_idusuario`),
  CONSTRAINT `fk_tabela_aula_professor1` FOREIGN KEY (`professor_idprofessor`, `professor_login_idlogin`, `professor_usuario_idusuario`) REFERENCES `professor` (`idprofessor`, `login_idlogin`, `usuario_idusuario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tabela_aula_usuario1` FOREIGN KEY (`usuario_idusuario`) REFERENCES `usuario` (`idusuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tabela_preco`
--

DROP TABLE IF EXISTS `tabela_preco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tabela_preco` (
  `idtabela_preco` int(11) NOT NULL AUTO_INCREMENT,
  `valor` int(11) NOT NULL,
  `NumeroParcela` int(11) NOT NULL,
  PRIMARY KEY (`idtabela_preco`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(45) NOT NULL,
  `cpf` int(11) DEFAULT NULL,
  `rg` varchar(12) DEFAULT NULL,
  `ativado` tinyint(4) DEFAULT NULL,
  `dataNascimento` date DEFAULT NULL,
  `nota` int(11) DEFAULT NULL,
  `endereco_idendereco` int(11) NOT NULL,
  `login_idlogin` int(11) NOT NULL,
  `tabela_preco_idtabela_preco` int(11) NOT NULL,
  `qtd_aulaTeorica` int(11) NOT NULL,
  `qtd_aulaPratica` int(11) NOT NULL,
  PRIMARY KEY (`idusuario`,`endereco_idendereco`,`login_idlogin`,`tabela_preco_idtabela_preco`),
  KEY `fk_usuario_endereco1_idx` (`endereco_idendereco`),
  KEY `fk_usuario_login1_idx` (`login_idlogin`),
  KEY `fk_usuario_tabela_preco1_idx` (`tabela_preco_idtabela_preco`),
  CONSTRAINT `fk_usuario_endereco1` FOREIGN KEY (`endereco_idendereco`) REFERENCES `endereco` (`idendereco`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuario_login1` FOREIGN KEY (`login_idlogin`) REFERENCES `login` (`idlogin`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuario_tabela_preco1` FOREIGN KEY (`tabela_preco_idtabela_preco`) REFERENCES `tabela_preco` (`idtabela_preco`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-09-13 21:26:50
