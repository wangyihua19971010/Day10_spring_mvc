/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : 1807_test1

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2019-04-11 16:33:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `urid` int(11) NOT NULL AUTO_INCREMENT,
  `roleid` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `status` bit(1) DEFAULT NULL COMMENT '��ʶλ\r\n            0:��Ч 1:��Ч',
  PRIMARY KEY (`urid`),
  KEY `FK_Reference_2` (`userId`),
  KEY `FK_Reference_3` (`roleid`),
  CONSTRAINT `FK_Reference_2` FOREIGN KEY (`userId`) REFERENCES `userinfo` (`userId`),
  CONSTRAINT `FK_Reference_3` FOREIGN KEY (`roleid`) REFERENCES `roleinfo` (`roleid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='�û���ɫ�м��';

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '3', '2', '');
INSERT INTO `user_role` VALUES ('2', '4', '3', '');
INSERT INTO `user_role` VALUES ('3', '5', '4', '');
INSERT INTO `user_role` VALUES ('4', '1', '5', '');
INSERT INTO `user_role` VALUES ('5', '2', '6', '');
