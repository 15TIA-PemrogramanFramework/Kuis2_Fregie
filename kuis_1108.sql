-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 13 Des 2017 pada 16.23
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis_1108`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `identitas_1108`
--

CREATE TABLE `identitas_1108` (
  `id` bigint(20) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `nama` varchar(100) NOT NULL,
  `prodi` varchar(255) DEFAULT NULL,
  `ipk_1108_id_ipk` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `identitas_1108`
--

INSERT INTO `identitas_1108` (`id`, `alamat`, `nama`, `prodi`, `ipk_1108_id_ipk`) VALUES
(4, 'Jl Durian', 'Fregie', 'SI', 5),
(5, 'Jl Rajawali', 'Julsen', 'AKT', NULL);

-- --------------------------------------------------------

--
-- Struktur dari tabel `ipk_1108`
--

CREATE TABLE `ipk_1108` (
  `id_ipk` bigint(20) NOT NULL,
  `batas_akhir` int(11) DEFAULT NULL,
  `batas_awal` int(11) DEFAULT NULL,
  `nilai` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `ipk_1108`
--

INSERT INTO `ipk_1108` (`id_ipk`, `batas_akhir`, `batas_awal`, `nilai`) VALUES
(2, 60, 65, 'BC'),
(3, 66, 75, 'B'),
(4, 76, 80, 'AB'),
(5, 81, 100, 'A'),
(6, 200, 101, 'A++');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pilot`
--

CREATE TABLE `pilot` (
  `id` bigint(20) NOT NULL,
  `alamat_pilot` varchar(255) DEFAULT NULL,
  `nama_pilot` varchar(100) NOT NULL,
  `no_hp_pilot` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `identitas_1108`
--
ALTER TABLE `identitas_1108`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_mabpfldm9ofpmv36747p963jx` (`nama`),
  ADD KEY `FK1pot2rq0uko5ufnnhryvy4f30` (`ipk_1108_id_ipk`);

--
-- Indexes for table `ipk_1108`
--
ALTER TABLE `ipk_1108`
  ADD PRIMARY KEY (`id_ipk`),
  ADD UNIQUE KEY `UK_arewv6g2hodh46aseh9u6iqy5` (`nilai`);

--
-- Indexes for table `pilot`
--
ALTER TABLE `pilot`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_93s0n9490inm65f3x9hdnu60m` (`nama_pilot`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `identitas_1108`
--
ALTER TABLE `identitas_1108`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `ipk_1108`
--
ALTER TABLE `ipk_1108`
  MODIFY `id_ipk` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `pilot`
--
ALTER TABLE `pilot`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `identitas_1108`
--
ALTER TABLE `identitas_1108`
  ADD CONSTRAINT `FK1pot2rq0uko5ufnnhryvy4f30` FOREIGN KEY (`ipk_1108_id_ipk`) REFERENCES `ipk_1108` (`id_ipk`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
