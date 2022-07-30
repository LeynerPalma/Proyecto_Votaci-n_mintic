-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-07-2022 a las 17:30:41
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_votaciones_tic`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_registro_candidato`
--

CREATE TABLE `tbl_registro_candidato` (
  `numeroCedula` varchar(10) NOT NULL,
  `nombre` varchar(250) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `partido` varchar(50) NOT NULL,
  `ciudad` varchar(200) NOT NULL,
  `biografia` varchar(400) NOT NULL,
  `smsCampana` varchar(100) NOT NULL,
  `propuesta` varchar(400) NOT NULL,
  `voto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tbl_registro_candidato`
--

INSERT INTO `tbl_registro_candidato` (`numeroCedula`, `nombre`, `telefono`, `partido`, `ciudad`, `biografia`, `smsCampana`, `propuesta`, `voto`) VALUES
('1054655255', 'Petro', '3015370636', 'Centro Democrático', 'Acacías	-	Meta', 'CEED', 'EFEF', 'EFEF', 2),
('1102541258', 'carlos perito', '1234567897', 'Movimiento 19 de Abril', 'Acevedo	-	Huila', 'soy biografico', 'mas pan para los panes', 'bajsr el iva ', 0),
('1231221', 'Uribe', '12341', 'das', 'Bogota', 'Soy una persona honesta', 'Subir salario bajar impuesto', 'Un jovencito pagandome impuesto, que delicia.', 0),
('12345671', 'leyner jose', '3214567894', 'Centro Democrático', 'Abriaquí	-	Antioquia', 'esto es solo una prueba', 'esta tambien es un sms de prueba ', 'seguiremos haciendo ´propuestas', 1),
('4575757555', 'yerlin', '1425364528', 'Centro Democrático', 'Acacías	-	Meta', 'aja\n', 'yes', 'push', 0),
('5412365897', 'pers peres', '7873553535', 'Centro Democrático', 'Acacías	-	Meta', 'esto es una biografia', 'smsm de campaña lol', 'mas pan mas arroz', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_registro_votante`
--

CREATE TABLE `tbl_registro_votante` (
  `ncedula` varchar(10) NOT NULL,
  `nombre` varchar(250) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `ciudad` varchar(100) NOT NULL,
  `contrasena` varchar(100) NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tbl_registro_votante`
--

INSERT INTO `tbl_registro_votante` (`ncedula`, `nombre`, `telefono`, `correo`, `ciudad`, `contrasena`, `estado`) VALUES
('1', 'daniell', '5455555555', 'dasdasd@dasdas.com', 'Abejorral	-	Antioquia', '1', 0),
('1024585258', 'tutu nadien como tut', '7873553535', 'tutu@tut.com', 'Abrego	-	Norte de Santander', '369.', 0),
('1042995346', 'leyner daniel', '7873663636', 'leuner@gmail.com', 'Abrego	-	Norte de Santander', '2564', 0),
('12', 'sdsdsd', 'sdsdsd', 'sdsdsd', 'sdsdsd', '32', 1),
('1555', 'pedro navajas', '1452365412', 'pedronavajas@pedro.com', 'Abejorral	-	Antioquia', '123', 1),
('2', 'valeritt', '1234567896', 'mqmqm@gol.com', 'Abriaquí	-	Antioquia', '2', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_user_admin`
--

CREATE TABLE `tbl_user_admin` (
  `cedula` varchar(11) NOT NULL,
  `contrasena` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tbl_user_admin`
--

INSERT INTO `tbl_user_admin` (`cedula`, `contrasena`) VALUES
('123', '321'),
('444', '444');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbl_registro_candidato`
--
ALTER TABLE `tbl_registro_candidato`
  ADD PRIMARY KEY (`numeroCedula`);

--
-- Indices de la tabla `tbl_registro_votante`
--
ALTER TABLE `tbl_registro_votante`
  ADD PRIMARY KEY (`ncedula`);

--
-- Indices de la tabla `tbl_user_admin`
--
ALTER TABLE `tbl_user_admin`
  ADD PRIMARY KEY (`cedula`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
