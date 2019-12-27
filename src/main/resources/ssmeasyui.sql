/*
Navicat MySQL Data Transfer

Source Server         : 本机
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : ssmeasyui

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2019-12-27 18:00:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) NOT NULL DEFAULT '',
  `password` varchar(255) NOT NULL DEFAULT '',
  `age` int(11) DEFAULT NULL,
  `trueName` varchar(255) NOT NULL DEFAULT '',
  `email` varchar(255) DEFAULT '',
  `phone` varchar(255) DEFAULT '',
  `roleName` varchar(255) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'zhangsan', '123456', '1', '张三', null, null, null);
INSERT INTO `users` VALUES ('2', 'zhangsan1', '1234567', '12', '张三1', '61578492@qq.com', '110', '销售主管');
INSERT INTO `users` VALUES ('3', 'ydz', '123', '18', '原东朝', null, null, null);
INSERT INTO `users` VALUES ('4', 'zhangsan', '123456', '1', 'zhangsan', '', '', '');
