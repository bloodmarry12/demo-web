CREATE TABLE `demo` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT ''自增ID'',
  `name` varchar(50) NOT NULL COMMENT ''名称'',
  `nick_name` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT ''昵称'',
  `birthday` date NOT NULL COMMENT ''生日'',
  `is_delete` bit(1) NOT NULL DEFAULT b''0'' COMMENT ''是否删除{0:否; 1:是}'',
  `gmt_created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT=''demo'';

