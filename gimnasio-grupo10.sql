-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-06-2024 a las 23:09:07
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `helgafinal`
--
CREATE DATABASE IF NOT EXISTS `helgafinal` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `helgafinal`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asistencia`
--

CREATE TABLE IF NOT EXISTS `asistencia` (
  `id_asistencia` int(11) NOT NULL AUTO_INCREMENT,
  `id_socio` int(11) NOT NULL,
  `id_clase` int(11) NOT NULL,
  `fecha_asistencia` date NOT NULL,
  PRIMARY KEY (`id_asistencia`),
  KEY `id_socio` (`id_socio`),
  KEY `id_clase` (`id_clase`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clase`
--

CREATE TABLE IF NOT EXISTS `clase` (
  `id_clase` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_clase` varchar(30) NOT NULL,
  `id_entrenador` int(11) NOT NULL,
  `horario_clase` time NOT NULL,
  `capacidad_clase` int(11) NOT NULL,
  `estado_clase` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_clase`),
  KEY `id_entrenador` (`id_entrenador`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `clase`
--

INSERT INTO `clase` (`id_clase`, `nombre_clase`, `id_entrenador`, `horario_clase`, `capacidad_clase`, `estado_clase`) VALUES
(1, 'Tenis Avanzado', 1, '08:00:00', 4, 1),
(2, 'Tenis Principiante', 1, '09:00:00', 12, 1),
(3, 'Fútbol Juvenil', 3, '10:00:00', 20, 1),
(4, 'Fútbol Senior', 4, '11:00:00', 18, 1),
(5, 'Baloncesto Básico', 5, '12:00:00', 15, 1),
(6, 'Baloncesto Avanzado', 6, '13:00:00', 12, 1),
(7, 'Atletismo 100m', 7, '14:00:00', 10, 1),
(8, 'Atletismo Maratón', 8, '15:00:00', 8, 1),
(9, 'Natación Infantil', 2, '16:00:00', 20, 1),
(10, 'Natación Adultos', 2, '19:00:00', 15, 1),
(11, 'spnning', 3, '18:00:00', 0, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrenador`
--

CREATE TABLE IF NOT EXISTS `entrenador` (
  `id_entrenador` int(11) NOT NULL AUTO_INCREMENT,
  `dni_entrenador` varchar(10) NOT NULL,
  `nombre_entrenador` varchar(30) NOT NULL,
  `apellido_entrenador` varchar(30) NOT NULL,
  `especialidad_entrenador` varchar(30) NOT NULL,
  `estado_entrenador` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_entrenador`),
  UNIQUE KEY `dni_entrenador` (`dni_entrenador`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `entrenador`
--

INSERT INTO `entrenador` (`id_entrenador`, `dni_entrenador`, `nombre_entrenador`, `apellido_entrenador`, `especialidad_entrenador`, `estado_entrenador`) VALUES
(1, '11122233', 'Luis', 'Ortiz', 'Tenis', 1),
(2, '22233344', 'Patricia', 'Núñez', 'Natación', 1),
(3, '33344455', 'Alberto', 'Mendoza', 'Fútbol', 1),
(4, '44455566', 'Carmen', 'Santos', 'Fútbol', 1),
(5, '55566677', 'Jorge', 'Romero', 'Baloncesto', 1),
(6, '66677788', 'Verónica', 'Hidalgo', 'Baloncesto', 1),
(7, '77788899', 'Sergio', 'Pérez', 'Atletismo', 1),
(8, '88899900', 'Elena', 'García', 'Atletismo', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `membresia`
--

CREATE TABLE IF NOT EXISTS `membresia` (
  `id_membresia` int(11) NOT NULL AUTO_INCREMENT,
  `id_socio` int(11) NOT NULL,
  `cantidad_pases` int(11) NOT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_fin` date NOT NULL,
  `costo_membresia` double NOT NULL,
  `estado_membresia` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_membresia`,`id_socio`),
  KEY `id_socio` (`id_socio`)
) ENGINE=InnoDB AUTO_INCREMENT=152 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `membresia`
--

INSERT INTO `membresia` (`id_membresia`, `id_socio`, `cantidad_pases`, `fecha_inicio`, `fecha_fin`, `costo_membresia`, `estado_membresia`) VALUES
(142, 1, 12, '2024-01-01', '2024-03-31', 100, 0),
(143, 2, 0, '2024-02-01', '2024-05-31', 0, 0),
(144, 3, 8, '2024-01-15', '2024-08-31', 75, 1),
(145, 4, 10, '2024-01-10', '2024-04-10', 90, 1),
(146, 5, 0, '2024-02-15', '2024-05-15', 0, 0),
(147, 6, 14, '2024-01-20', '2024-04-20', 120, 1),
(148, 7, 9, '2024-01-25', '2024-04-25', 85, 1),
(149, 8, 0, '2024-02-05', '2024-05-05', 0, 0),
(150, 9, 11, '2024-01-30', '2024-04-30', 95, 1),
(151, 10, 7, '2024-02-10', '2024-05-10', 65, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `socio`
--

CREATE TABLE IF NOT EXISTS `socio` (
  `id_socio` int(11) NOT NULL AUTO_INCREMENT,
  `dni_socio` varchar(10) NOT NULL,
  `nombre_socio` varchar(30) NOT NULL,
  `apellido_socio` varchar(30) NOT NULL,
  `edad_socio` int(11) NOT NULL,
  `correo_socio` varchar(50) NOT NULL,
  `telefono_socio` varchar(20) NOT NULL,
  `estado_socio` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_socio`),
  UNIQUE KEY `dni_socio` (`dni_socio`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `socio`
--

INSERT INTO `socio` (`id_socio`, `dni_socio`, `nombre_socio`, `apellido_socio`, `edad_socio`, `correo_socio`, `telefono_socio`, `estado_socio`) VALUES
(1, '10000000', 'Carlos', 'Pérez', 29, 'carlos.perez@example.com', '555-1234', 1),
(2, '11000000', 'Ana', 'López', 34, 'ana.lopez@example.com', '555-2345', 0),
(3, '123', 'Juan', 'García', 22, 'juan.garcia@example.com', '555-3456', 1),
(4, '11110000', 'María', 'Martínez', 27, 'maria.martinez@example.com', '555-4567', 1),
(5, '11111000', 'Pedro', 'Gómez', 41, 'pedro.gomez@example.com', '555-5678', 0),
(6, '11111100', 'Lucía', 'Rodríguez', 24, 'lucia.rodriguez@example.com', '555-6789', 1),
(7, '11111110', 'José', 'Fernández', 36, 'jose.fernandez@example.com', '555-7890', 1),
(8, '11111111', 'Marta', 'Sánchez', 32, 'marta.sanchez@example.com', '555-8901', 0),
(9, '20000000', 'Miguel', 'Díaz', 45, 'miguel.diaz@example.com', '555-9012', 1),
(10, '22000000', 'Elena', 'Ruiz', 39, 'elena.ruiz@example.com', '555-0123', 1);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asistencia`
--
ALTER TABLE `asistencia`
  ADD CONSTRAINT `asistencia_ibfk_1` FOREIGN KEY (`id_socio`) REFERENCES `socio` (`id_socio`),
  ADD CONSTRAINT `asistencia_ibfk_2` FOREIGN KEY (`id_clase`) REFERENCES `clase` (`id_clase`);

--
-- Filtros para la tabla `clase`
--
ALTER TABLE `clase`
  ADD CONSTRAINT `clase_ibfk_1` FOREIGN KEY (`id_entrenador`) REFERENCES `entrenador` (`id_entrenador`);

--
-- Filtros para la tabla `membresia`
--
ALTER TABLE `membresia`
  ADD CONSTRAINT `membresia_ibfk_1` FOREIGN KEY (`id_socio`) REFERENCES `socio` (`id_socio`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
