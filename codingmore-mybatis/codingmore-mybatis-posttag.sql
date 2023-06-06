SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for posttag
-- ----------------------------
DROP TABLE IF EXISTS `post_tag`;
CREATE TABLE `post_tag` (
                         `post_tag_id` int NOT NULL AUTO_INCREMENT,
                         `post_tag_description` varchar(50) NOT NULL,
                         PRIMARY KEY (`post_tag_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of posttag
-- ----------------------------
INSERT INTO `post_tag` (`post_tag_id`, `post_tag_description`) VALUES (1, 'mybatis-plus');

SET FOREIGN_KEY_CHECKS = 1;