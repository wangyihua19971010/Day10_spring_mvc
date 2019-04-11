/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : 1807_test1

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2019-04-11 16:33:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL COMMENT '�û���',
  `password` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `status` bit(1) DEFAULT NULL COMMENT '��ʶλ\r\n            0:��Ч 1:��Ч',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='�û���';

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('2', 'ls', '456', '李四', 'ls1000@qq.com', '');
INSERT INTO `userinfo` VALUES ('3', 'admin', '123', 'wangyihua19971010', 'sadasda@adsad.com', '');
INSERT INTO `userinfo` VALUES ('4', 'zs', '123', '张三', 'zs@qq.com', '');
INSERT INTO `userinfo` VALUES ('5', 'ss', '321', 'sdsa', 'ss@qq.com', '');
INSERT INTO `userinfo` VALUES ('6', 'kkkk', '987', '看看', 'kk@qq.com', '');
INSERT INTO `userinfo` VALUES ('7', 'wu', '098', '王五', 'wu@163.com', '');
INSERT INTO `userinfo` VALUES ('8', '小明', '794', '晓明', 'xiaoming@qq.com', '');
INSERT INTO `userinfo` VALUES ('9', 'xiaohuang', '361', '小皇', 'xiaohuang@qq.com', '');
INSERT INTO `userinfo` VALUES ('10', 'asd', '344', 'assa', 'sadasda@adsad.com', '');
