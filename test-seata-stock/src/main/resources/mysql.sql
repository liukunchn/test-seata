CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `price` double DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `last_update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

INSERT INTO `seata_stock`.`product`(`id`, `price`, `stock`, `last_update_time`) VALUES (1, 1, 9, '2023-07-27 17:28:38');
