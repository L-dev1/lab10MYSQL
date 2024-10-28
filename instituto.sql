-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-10-2024 a las 06:10:58
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `instituto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `Codigo` int(11) NOT NULL,
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido` varchar(50) DEFAULT NULL,
  `DNI` int(8) DEFAULT NULL,
  `Direccion` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`Codigo`, `Nombre`, `Apellido`, `DNI`, `Direccion`) VALUES
(1, 'Huber', 'Lope', 77051416, 'Jr.Los Pinos'),
(2, 'Anabel', 'Ruiz', 78451236, 'Av.SanJuanDeDios'),
(3, 'Frodo', 'Zarate', 78451263, 'av.brasil'),
(4, 'Andres', 'Pizarro', 78451298, 'jr.incas');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`Codigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
