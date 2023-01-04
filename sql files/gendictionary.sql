-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 28, 2020 at 05:24 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gendictionary`
--

-- --------------------------------------------------------

--
-- Table structure for table `gendictionary`
--

CREATE TABLE `gendictionary` (
  `input` text NOT NULL,
  `meaning` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gendictionary`
--

INSERT INTO `gendictionary` (`input`, `meaning`) VALUES
('apple', '1.\r\nthe round fruit of a tree of the rose family, which typically has thin green or red skin and crisp flesh.\r\n2.\r\nthe tree bearing apples, with hard pale timber that is used in carpentry and to smoke food.\r\n'),
('apple', '1.\r\nthe round fruit of a tree of the rose family, which typically has thin green or red skin and crisp flesh.\r\n2.\r\nthe tree bearing apples, with hard pale timber that is used in carpentry and to smoke food.\r\n'),
('mango', 'a fleshy, oval, yellowish-red tropical fruit that is eaten ripe or used green for pickles or chutneys.\r\n'),
('mango', 'a fleshy, oval, yellowish-red tropical fruit that is eaten ripe or used green for pickles or chutneys.\r\n'),
('banana', 'a long curved fruit which grows in clusters and has soft pulpy flesh and yellow skin when ripe.'),
('jackfruit', 'a fast-growing tropical Asian tree related to the breadfruit.\r\nthe very large edible fruit of the jackfruit tree, resembling a breadfruit and important as food in the tropics.'),
('orange', 'a large round juicy citrus fruit with a tough bright reddish-yellow rind.');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
