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
-- Database: `drugdictionary`
--

-- --------------------------------------------------------

--
-- Table structure for table `drugdictionary`
--

CREATE TABLE `drugdictionary` (
  `name` text NOT NULL,
  `about` text NOT NULL,
  `uses` text NOT NULL,
  `moreinfo` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `drugdictionary`
--

INSERT INTO `drugdictionary` (`name`, `about`, `uses`, `moreinfo`) VALUES
('', '', '', ''),
('acyclovir', 'anti-infection medicine', 'used to treat infections caused by herpes viruses, such as genital herpes, cold sores, shingles, and chicken pox, ', 'also used to treat varicella (chickenpox), and cytomegalovirus.'),
('amoxicillin', 'anti-bacterial medicine', 'used to treat many different types of infection caused by bacteria, such as tonsillitis, bronchitis, pneumonia, gonorrhea', 'also used to treat infections of the ear, nose, throat, skin, or urinary tract.'),
('aspirin', 'Aspirin is a salicylate (sa-LIS-il-ate).', ' It works by reducing substances in the body that cause pain, fever, and inflammation.Aspirin is used to treat pain, and reduce fever or inflammation. ', 'It is sometimes used to treat or prevent heart attacks, strokes, and chest pain (angina).'),
('bisoprolol', 'beta-blocker.  ', 'used to treat Hyprtenstion', 'prevent heart attacks.'),
('baclofen', 'used to treat muscle symptoms', 'heals spasm, pain and stiffness; caused by multiple sclerosis, spinal cord injuries, or other spinal cord disorders. ', 'it is given intrathecally (directly into the spinal cord) or orally (by mouth).');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
