/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : 1807_test1

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2019-04-11 16:33:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for roleinfo
-- ----------------------------
DROP TABLE IF EXISTS `roleinfo`;
CREATE TABLE `roleinfo` (
  `roleid` int(11) NOT NULL AUTO_INCREMENT,
  `rolename` varchar(20) DEFAULT NULL,
  `status` int(20) DEFAULT '1',
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='.��ɫ��';

-- ----------------------------
-- Records of roleinfo
-- ----------------------------
INSERT INTO `roleinfo` VALUES ('1', '运营人员', '1');
INSERT INTO `roleinfo` VALUES ('2', '超级管理员', '1');
INSERT INTO `roleinfo` VALUES ('3', '仓库管理员', '1');
INSERT INTO `roleinfo` VALUES ('4', '营销人员', '1');
INSERT INTO `roleinfo` VALUES ('5', '网路推广人员', '1');
