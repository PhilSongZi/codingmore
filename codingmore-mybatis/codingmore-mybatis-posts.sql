SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for posts
-- ----------------------------
DROP TABLE IF EXISTS `posts`;
CREATE TABLE `posts` (
                         `post_id` int NOT NULL AUTO_INCREMENT,
                         `post_author` long NOT NULL,
                         `post_content` varchar(100) NOT NULL,
                         `post_title` varchar(50) NOT NULL,
                         PRIMARY KEY (`post_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of posts
-- ----------------------------
INSERT INTO `posts` (`post_id`, `post_author`, `post_content`, `post_title`) VALUES (1, '小子松', '小子松大傻逼', '懒死你吧');

SET FOREIGN_KEY_CHECKS = 1;