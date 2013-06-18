INSERT INTO `marque` (`id`, `nomMarque`) VALUES
(1, 'apple'),
(2, 'BlackBerry'),
(3, 'Samsung');

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
(14, 16, '136.6*70.6*8.6', 'b2f2c5ee-480b-47a5-8384-cdb8a04bf005|image/jpeg', 'Galaxy S3', 'Android', '349', 3);