INSERT INTO `marque` (`id`, `nomMarque`) VALUES
(1, 'apple'),
(2, 'BlackBerry'),
(3, 'Samsung');

INSERT INTO `produit` (`id`, `capaciteProd`, `dimensionProd`, `image_prod`, `modelProd`, `osProd`, `prixProd`, `marque_id`) VALUES
(2, 1, '109.0*60.0*12.7', '191432d2-934b-46dd-891d-2edeebb667e4|image/jpeg', '9320', 'BlackBerry', '140', 2),
(3, 1, '109.0*60.0*11.0', '3013e9bb-7cc7-4378-b341-dbb098630bf1|image/jpeg', '9360', 'BlackBerry', '290', 2),
(4, 8, '110.0*60.0*11.4', 'fd15d95c-299b-4f3c-a059-9cc466e8491e|image/jpeg', '9790', 'BlackBerry', '350', 2),
(5, 8, '115.0*66.0*10.5', '5ce62e8a-6887-42c0-bdf6-f25401ef8327|image/jpeg', '9900', 'BlackBerry', '479.99', 2),
(6, 16, '130.0*65.6*9.0', '799fcfcb-cbae-4a4a-bb9f-864d5cf41bfe|image/jpeg', 'Z10', 'BlackBerry', '489.95', 2),
(7, 8, '115.2*58.6*9.3', '2bf149be-5288-4117-ad7c-bdde4078a51a|image/jpeg', 'Iphone 4', 'IOS', '389', 1),
(8, 16, '115.2*58.6*9.3', '3cbbb0ba-7591-4c1d-abd0-042d272a9003|image/jpeg', 'Iphone 4S', 'IOS', '549', 1),
(9, 16, '123.8*58.5*7.6', '8ef3b518-f8b5-4118-b18e-b3f606011929|image/jpeg', 'Iphone 5', 'IOS', '599', 1),
(10, 16, '146.9*83.0*9.7', '0f327e60-c752-4c95-83a1-b5b9de6d7c96|image/jpeg', 'Galaxy Note', 'Android', '435', 3),
(11, 16, '151.1*80.5*9.4', 'cd417a8b-a79d-4df2-8045-9242443e678a|image/jpeg', 'Galaxy Note II', 'Android', '429', 3),
(12, 1, '112.4*59.9*11.5', '20a6b67c-2d93-4bb9-a92f-381bf4e9ff3a|image/jpeg', 'Galaxy Ace', 'Android', '99', 3),
(13, 16, '125.3*66.1*8.5', 'af8c5cb0-b4a1-4178-84aa-7ddfb3dd5993|image/jpeg', 'Galaxy S2', 'Android', '336', 3),
(14, 16, '136.6*70.6*8.6', 'da207bcf-1818-4f1e-95b1-f447987b6ab6|image/jpeg', 'Galaxy S3', 'Android', '349', 3);