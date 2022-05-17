-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 17 May 2022, 11:40:59
-- Sunucu sürümü: 10.4.22-MariaDB
-- PHP Sürümü: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `lojistik`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `admin`
--

CREATE TABLE `admin` (
  `User` varchar(15) COLLATE utf8_turkish_ci NOT NULL,
  `Pass` varchar(15) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `admin`
--

INSERT INTO `admin` (`User`, `Pass`) VALUES
('admin', '12345'),
('', ''),
('Mehmet', 'Atan'),
('Root', 'Pass'),
('1574685', '4343834');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `personeller`
--

CREATE TABLE `personeller` (
  `id` int(11) NOT NULL,
  `ad` varchar(15) COLLATE utf8_turkish_ci NOT NULL,
  `soyad` varchar(15) COLLATE utf8_turkish_ci NOT NULL,
  `mail` varchar(25) COLLATE utf8_turkish_ci NOT NULL,
  `tc` varchar(11) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `personeller`
--

INSERT INTO `personeller` (`id`, `ad`, `soyad`, `mail`, `tc`) VALUES
(2, 'Merve', 'Kar', 'mkar@gmail.com', '51452365874'),
(3, 'Ali', 'Orkun', 'aliotsan@hotmail.com', '26874536522'),
(4, 'Osman', 'Geç', 'oktan45@hotmail.com', '25874563258'),
(5, 'Ayşe', 'Fahen', 'okdak42@gmail.com', '63914742316'),
(6, 'Ferhat', 'İş', 'akcoibgt@gmail.com', '52486512500'),
(7, 'Muhsin', 'Ev', 'mlsakr42@gmail.com', '25418763250'),
(9, 'Mehmet', 'Kara', 'mkara@yahoo.com', '24586214532'),
(11, 'Engin', 'Akkan', 'enkaraak@yahoo.com', '54782145890');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `personeller`
--
ALTER TABLE `personeller`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `personeller`
--
ALTER TABLE `personeller`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
