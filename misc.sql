-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 03, 2020 at 08:00 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `misc`
--

-- --------------------------------------------------------

--
-- Table structure for table `classes_record`
--

CREATE TABLE `classes_record` (
  `Class_name` varchar(225) NOT NULL,
  `Incharge_name` varchar(225) DEFAULT NULL,
  `Total_Subjects` varchar(225) DEFAULT NULL,
  `Total_fees` varchar(225) DEFAULT NULL,
  `School_College` varchar(225) DEFAULT NULL,
  `Subject_1` varchar(225) DEFAULT NULL,
  `Subject_2` varchar(225) DEFAULT NULL,
  `Subject_3` varchar(225) DEFAULT NULL,
  `Subject_4` varchar(225) DEFAULT NULL,
  `Subject_5` varchar(225) DEFAULT NULL,
  `Subject_6` varchar(225) DEFAULT NULL,
  `Subject_7` varchar(225) DEFAULT NULL,
  `Subject_8` varchar(225) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `event_information`
--

CREATE TABLE `event_information` (
  `Event_id` int(255) NOT NULL,
  `Event_title` varchar(255) DEFAULT NULL,
  `Event_start_date` varchar(255) DEFAULT NULL,
  `Event_close_date` varchar(255) DEFAULT NULL,
  `Event_start_time` varchar(255) DEFAULT NULL,
  `Event_close_time` varchar(255) DEFAULT NULL,
  `Event_incharge` varchar(255) DEFAULT NULL,
  `Event_details` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `fees_record`
--

CREATE TABLE `fees_record` (
  `fees_id` int(11) NOT NULL,
  `fees_name` varchar(225) NOT NULL,
  `fees_total` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `library`
--

CREATE TABLE `library` (
  `Book_id` varchar(255) NOT NULL,
  `Book_title` varchar(255) DEFAULT NULL,
  `Book_author` varchar(255) DEFAULT NULL,
  `Book_isbn` varchar(255) DEFAULT NULL,
  `Book_copy_avail` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `login_table`
--

CREATE TABLE `login_table` (
  `First_Name` varchar(225) NOT NULL,
  `Last_Name` varchar(225) NOT NULL,
  `User_name` varchar(225) NOT NULL,
  `Password` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login_table`
--

INSERT INTO `login_table` (`First_Name`, `Last_Name`, `User_name`, `Password`) VALUES
('Syed', ' Shehryar', 'Shehryar', 'shehryar');

-- --------------------------------------------------------

--
-- Table structure for table `salary`
--

CREATE TABLE `salary` (
  `stafftype` varchar(225) NOT NULL,
  `staffid` int(11) NOT NULL,
  `staffname` varchar(225) NOT NULL,
  `totalsalary` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student_admission`
--

CREATE TABLE `student_admission` (
  `form_no` int(11) NOT NULL,
  `session` varchar(225) NOT NULL,
  `roll_no` int(11) NOT NULL,
  `date` varchar(225) DEFAULT NULL,
  `first_name` varchar(225) DEFAULT NULL,
  `last_name` varchar(225) DEFAULT NULL,
  `c_b_form_no` varchar(225) DEFAULT NULL,
  `dob` varchar(225) DEFAULT NULL,
  `fathers_name` varchar(225) DEFAULT NULL,
  `fathers_cnic` varchar(225) DEFAULT NULL,
  `fathers_occupation` varchar(225) DEFAULT NULL,
  `religion` varchar(225) DEFAULT NULL,
  `contact_home` varchar(225) DEFAULT NULL,
  `mobile` varchar(225) DEFAULT NULL,
  `postal_address` longtext DEFAULT NULL,
  `permanent_address` longtext DEFAULT NULL,
  `tehsil` varchar(225) DEFAULT NULL,
  `district` varchar(225) DEFAULT NULL,
  `class` varchar(225) DEFAULT NULL,
  `elective_subject` varchar(500) DEFAULT NULL,
  `pic_address` varchar(225) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tables_info`
--

CREATE TABLE `tables_info` (
  `Attendance_Available_for_Month` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `teacher_admission`
--

CREATE TABLE `teacher_admission` (
  `formno` int(11) NOT NULL,
  `Staff_type` varchar(256) NOT NULL,
  `teacher_id` int(11) NOT NULL,
  `first_name` varchar(256) NOT NULL,
  `last_name` varchar(256) NOT NULL,
  `teacher_cnic` varchar(256) NOT NULL,
  `dob` varchar(256) NOT NULL,
  `fathers_name` varchar(256) NOT NULL,
  `fathers_cnic` varchar(256) NOT NULL,
  `religion` varchar(256) NOT NULL,
  `District` varchar(256) NOT NULL,
  `contact_home` varchar(256) NOT NULL,
  `mobile` varchar(256) NOT NULL,
  `postal_address` varchar(256) NOT NULL,
  `permanent_address` varchar(256) NOT NULL,
  `degree1` varchar(256) NOT NULL,
  `year_passing1` varchar(256) NOT NULL,
  `grade1` varchar(256) NOT NULL,
  `uni1` varchar(256) NOT NULL,
  `degree2` varchar(256) NOT NULL,
  `year_passing2` varchar(256) NOT NULL,
  `grade2` varchar(256) NOT NULL,
  `uni2` varchar(256) NOT NULL,
  `degree3` varchar(256) NOT NULL,
  `year_passing3` varchar(256) NOT NULL,
  `grade3` varchar(256) NOT NULL,
  `uni3` varchar(256) NOT NULL,
  `degree4` varchar(256) NOT NULL,
  `year_passing4` varchar(256) NOT NULL,
  `grade4` varchar(256) NOT NULL,
  `uni4` varchar(256) NOT NULL,
  `degree5` varchar(256) NOT NULL,
  `year_passing5` varchar(256) NOT NULL,
  `grade5` varchar(256) NOT NULL,
  `uni5` varchar(256) NOT NULL,
  `picadress` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `classes_record`
--
ALTER TABLE `classes_record`
  ADD PRIMARY KEY (`Class_name`);

--
-- Indexes for table `fees_record`
--
ALTER TABLE `fees_record`
  ADD PRIMARY KEY (`fees_id`);

--
-- Indexes for table `student_admission`
--
ALTER TABLE `student_admission`
  ADD PRIMARY KEY (`form_no`);

--
-- Indexes for table `teacher_admission`
--
ALTER TABLE `teacher_admission`
  ADD PRIMARY KEY (`formno`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `fees_record`
--
ALTER TABLE `fees_record`
  MODIFY `fees_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `student_admission`
--
ALTER TABLE `student_admission`
  MODIFY `form_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `teacher_admission`
--
ALTER TABLE `teacher_admission`
  MODIFY `formno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
