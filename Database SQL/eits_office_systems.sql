-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 12, 2018 at 12:17 AM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.5.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `eits_office_systems`
--

-- --------------------------------------------------------

--
-- Table structure for table `administrators`
--

CREATE TABLE `administrators` (
  `adminID` int(11) NOT NULL,
  `fName` varchar(45) NOT NULL,
  `lName` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `administrators`
--

INSERT INTO `administrators` (`adminID`, `fName`, `lName`, `email`, `password`) VALUES
(1, 'John', 'Doe', 'john@gmail.com', 'johnny');

-- --------------------------------------------------------

--
-- Table structure for table `caseworkers`
--

CREATE TABLE `caseworkers` (
  `caseworkerID` int(11) NOT NULL,
  `fName` varchar(45) NOT NULL,
  `lName` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `caseworkers`
--

INSERT INTO `caseworkers` (`caseworkerID`, `fName`, `lName`, `email`, `password`) VALUES
(1, 'Benjamin ', 'Clarke', 'benjamin@gmail.com', 'benji');

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `id` int(11) NOT NULL,
  `industries_id` int(11) NOT NULL,
  `code` varchar(10) NOT NULL,
  `title` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`id`, `industries_id`, `code`, `title`) VALUES
(1, 1, 'ICT50615', 'Diploma of Website Development '),
(2, 1, 'ICT50715', 'Diploma of Software Development');

-- --------------------------------------------------------

--
-- Table structure for table `industries`
--

CREATE TABLE `industries` (
  `id` int(11) NOT NULL,
  `industryDesc` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `industries`
--

INSERT INTO `industries` (`id`, `industryDesc`) VALUES
(1, 'Information Communication Technology');

-- --------------------------------------------------------

--
-- Table structure for table `units`
--

CREATE TABLE `units` (
  `id` varchar(10) NOT NULL,
  `unitDesc` varchar(255) NOT NULL,
  `courses_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `units`
--

INSERT INTO `units` (`id`, `unitDesc`, `courses_id`) VALUES
('ICTICT403', 'Apply software development methodologies', 2),
('ICTICT418', 'Contribute to copyright, ethics and privacy in an ICT environment', 2),
('ICTICT503', 'Validate quality and completeness of system design specifications', 2),
('ICTICT509', 'Gather data to identify business requirements', 2),
('ICTICT511', 'Match ICT needs with the strategic direction of the enterprise', 2),
('ICTICT514', 'Identify and manage the implementation of current industry-specific technologies', 2),
('ICTNWK514', 'Model preferred system solutions', 2),
('ICTPMG501', 'Manage ICT projects', 2),
('ICTPRG418', 'Apply intermediate programming skills in another language', 2),
('ICTPRG501', 'Apply advanced object-oriented language skills', 2),
('ICTPRG502', 'Manage a project using software management tools', 2),
('ICTPRG503', 'Debug and monitor applications', 2),
('ICTPRG504', 'Deploy an application to a production environment', 2),
('ICTPRG505', 'Build advanced user interface', 2),
('ICTPRG506', 'Design application architecture', 2),
('ICTPRG507', 'Implement security for applications', 2),
('ICTPRG508', 'Create mashups', 2),
('ICTPRG509', 'Build using rapid application development', 2),
('ICTPRG510', 'Maintain custom software', 2),
('ICTPRG512', 'Prepare for the build phase of an ICT system', 2),
('ICTPRG513 ', 'Coordinate the build phase of an ICT system', 2),
('ICTPRG514', 'Prepare for software development using rapid application development', 2),
('ICTPRG515', 'Review developed software', 2),
('ICTPRG520', 'Validate an application design against specifications', 2),
('ICTPRG523', 'Apply advanced programming skills in another language', 2),
('ICTPRG527 ', 'Apply intermediate object-oriented language skills', 2),
('ICTPRG529', 'Apply testing techniques for software development', 2),
('ICTPRG601', 'Develop advanced mobile multi-touch applications', 2),
('ICTPRG604', 'Create cloud computing services', 2),
('ICTSAD501', 'Model data objects', 2),
('ICTSAD502', 'Model data processes', 2),
('ICTSAD506', 'Produce a feasibility report', 2),
('ICTSAS502', 'Establish and maintain client user liaison', 2);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `userID` int(11) NOT NULL,
  `fName` varchar(45) NOT NULL,
  `lName` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `loginDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`userID`, `fName`, `lName`, `email`, `password`, `loginDate`) VALUES
(1, 'Bob', 'Ross', 'bob@gmail.com', '1234', '2018-06-10 23:47:44'),
(2, 'Jimmy', 'Neutron', 'jimmy@gmail.com', 'jimmy', '2018-06-10 23:47:44'),
(3, 'Wayne', 'Smithy', 'wayne@gmail.com', 'wayne', '2018-06-10 23:47:44'),
(4, 'Alex', 'Vassiliou', 'alexander.peter.vassiliou@gmail.com', '1234', '2018-06-10 23:47:44');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `administrators`
--
ALTER TABLE `administrators`
  ADD PRIMARY KEY (`adminID`);

--
-- Indexes for table `caseworkers`
--
ALTER TABLE `caseworkers`
  ADD PRIMARY KEY (`caseworkerID`);

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `industries`
--
ALTER TABLE `industries`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `units`
--
ALTER TABLE `units`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`userID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `administrators`
--
ALTER TABLE `administrators`
  MODIFY `adminID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `caseworkers`
--
ALTER TABLE `caseworkers`
  MODIFY `caseworkerID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `courses`
--
ALTER TABLE `courses`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `industries`
--
ALTER TABLE `industries`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `userID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
