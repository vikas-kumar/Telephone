-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Mar 18 Juin 2013 à 18:56
-- Version du serveur: 5.5.24-log
-- Version de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `telephone`
--

-- --------------------------------------------------------

--
-- Structure de la table `administrateur`
--

CREATE TABLE IF NOT EXISTS `administrateur` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `mdpAdmin` varchar(255) DEFAULT NULL,
  `numAdmin` int(11) NOT NULL,
  `pseudoAdmin` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cpAdr` varchar(255) DEFAULT NULL,
  `emailCli` varchar(255) DEFAULT NULL,
  `mdpCli` varchar(255) DEFAULT NULL,
  `nomAdr` varchar(255) DEFAULT NULL,
  `nomCli` varchar(255) DEFAULT NULL,
  `numAdr` int(11) NOT NULL,
  `paysAdr` varchar(255) DEFAULT NULL,
  `prenomCli` varchar(255) DEFAULT NULL,
  `telCli` varchar(255) DEFAULT NULL,
  `villeAdr` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `commande`
--

CREATE TABLE IF NOT EXISTS `commande` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `actif` bit(1) NOT NULL,
  `cpAdr` varchar(255) DEFAULT NULL,
  `dateCommande` datetime DEFAULT NULL,
  `emailCli` varchar(255) DEFAULT NULL,
  `marque` varchar(255) DEFAULT NULL,
  `modelProd` varchar(255) DEFAULT NULL,
  `nomAdr` varchar(255) DEFAULT NULL,
  `nomCli` varchar(255) DEFAULT NULL,
  `numAdr` int(11) NOT NULL,
  `paysAdr` varchar(255) DEFAULT NULL,
  `prenomCli` varchar(255) DEFAULT NULL,
  `prixProd` varchar(255) DEFAULT NULL,
  `telCli` varchar(255) DEFAULT NULL,
  `villeAdr` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `marque`
--

CREATE TABLE IF NOT EXISTS `marque` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nomMarque` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Contenu de la table `marque`
--

INSERT INTO `marque` (`id`, `nomMarque`) VALUES
(1, 'apple'),
(2, 'BlackBerry'),
(3, 'Samsung');

-- --------------------------------------------------------

--
-- Structure de la table `produit`
--

CREATE TABLE IF NOT EXISTS `produit` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `capaciteProd` int(11) NOT NULL,
  `dimensionProd` varchar(255) DEFAULT NULL,
  `image_prod` varchar(255) DEFAULT NULL,
  `modelProd` varchar(255) DEFAULT NULL,
  `osProd` varchar(255) DEFAULT NULL,
  `prixProd` varchar(255) DEFAULT NULL,
  `marque_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK50C6658982E586FE` (`marque_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=16 ;

--
-- Contenu de la table `produit`
--

INSERT INTO `produit` (`id`, `capaciteProd`, `dimensionProd`, `image_prod`, `modelProd`, `osProd`, `prixProd`, `marque_id`) VALUES
(2, 1, '109.0x60.0x12.7', '8b94d01b-9f36-418b-a22e-74316bb204d0|image/jpeg', '9320', 'BlackBerry', '140', 2),
(3, 0, '109.0*60.0*11.0', '3fb79a97-d3a9-4fc0-8820-2101d40f5e8e|image/jpeg', '9360', 'BlackBerry', '290', 2),
(4, 8, '110.0*60.0*11.4', '19c1e761-69e1-447e-8531-69b7b08cfc3d|image/jpeg', '9790', 'BlackBerry', '350', 2),
(5, 8, '115.0*66.0*10.5', '38195d10-09e5-4730-bb75-b499b8cb039e|image/jpeg', '9900', 'BlackBerry', '479.99', 2),
(6, 16, '130.0*65.6*9.0', '9bf698a3-c3e3-44df-bc8f-cb234536ac7c|image/jpeg', 'Z10', 'BlackBerry', '489.95', 2),
(7, 8, '115.2*58.6*9.3', 'f9cdb042-fd63-436c-9096-32daa3c2a792|image/jpeg', 'Iphone 4', 'IOS', '389', 1),
(8, 16, '115.2*58.6*9.3', 'e59628b3-ba07-4aaa-8d46-7b7b32b364bf|image/jpeg', 'Iphone 4S', 'IOS', '549', 1),
(9, 16, '123.8*58.5*7.6', '5facca24-c823-4e76-8897-2631c127e4b3|image/jpeg', 'Iphone 5', 'IOS', '599', 1),
(10, 16, '146.9*83.0*9.7', '95d47987-3ff4-4e26-bf1d-d987a68101a8|image/jpeg', 'Galaxy Note', 'Android', '435', 3),
(11, 16, '151.1*80.5*9.4', 'e8c0323c-ef46-449f-86b1-b53a0b068075|image/jpeg', 'Galaxy Note II', 'Android', '429', 3),
(12, 160, '112.4*59.9*11.5', 'a9974a92-5c64-4438-9ff3-9b1a2f7c9141|image/jpeg', 'Galaxy Ace', 'Android', '99', 3),
(13, 16, '125.3*66.1*8.5', '8cd80616-a5fd-4062-a051-46a59b3a52b2|image/jpeg', 'Galaxy S2', 'Android', '336', 3),
(14, 16, '136.6*70.6*8.6', 'b2f2c5ee-480b-47a5-8384-cdb8a04bf005|image/jpeg', 'Galaxy S3', 'Android', '349', 3),
(15, 160, '110 x 60,6 x 12,1', '846818ff-d204-44b7-8c88-0f3bd4d1c188|image/jpeg', 'Galaxy mini', 'Android', '99.90', 3);

-- --------------------------------------------------------

--
-- Structure de la table `verifier`
--

CREATE TABLE IF NOT EXISTS `verifier` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT,
  `Verif` int(11) NOT NULL,
  `mail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `produit`
--
ALTER TABLE `produit`
  ADD CONSTRAINT `FK50C6658982E586FE` FOREIGN KEY (`marque_id`) REFERENCES `marque` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
