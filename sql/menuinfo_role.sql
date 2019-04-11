/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : 1807_test1

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2019-04-11 16:33:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for menuinfo_role
-- ----------------------------
DROP TABLE IF EXISTS `menuinfo_role`;
CREATE TABLE `menuinfo_role` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `roleid` int(11) DEFAULT NULL,
  `menuid` int(11) DEFAULT NULL,
  `parentid` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT '1',
  PRIMARY KEY (`mid`),
  KEY `FK_Reference_4` (`roleid`),
  KEY `FK_Reference_5` (`menuid`),
  CONSTRAINT `FK_Reference_4` FOREIGN KEY (`roleid`) REFERENCES `roleinfo` (`roleid`),
  CONSTRAINT `FK_Reference_5` FOREIGN KEY (`menuid`) REFERENCES `menuinfo` (`menuid`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='角色_菜单中间表';

-- ----------------------------
-- Records of menuinfo_role
-- ----------------------------
INSERT INTO `menuinfo_role` VALUES ('1', '2', '1', '0', '1');
INSERT INTO `menuinfo_role` VALUES ('2', '5', '2', '1', '1');
INSERT INTO `menuinfo_role` VALUES ('3', '1', '3', '1', '1');
INSERT INTO `menuinfo_role` VALUES ('4', '2', '4', '1', '1');
INSERT INTO `menuinfo_role` VALUES ('5', '2', '5', '0', '1');
INSERT INTO `menuinfo_role` VALUES ('6', '1', '6', '9', '1');
INSERT INTO `menuinfo_role` VALUES ('7', '4', '7', '1', '1');
INSERT INTO `menuinfo_role` VALUES ('8', '2', '16', '5', '1');
INSERT INTO `menuinfo_role` VALUES ('9', '2', '9', '0', '1');
INSERT INTO `menuinfo_role` VALUES ('10', '3', '10', '5', '1');
INSERT INTO `menuinfo_role` VALUES ('11', '5', '11', '9', '1');
INSERT INTO `menuinfo_role` VALUES ('12', '4', '12', '9', '1');
INSERT INTO `menuinfo_role` VALUES ('13', '2', '15', '9', '1');
INSERT INTO `menuinfo_role` VALUES ('14', '1', '14', '9', '1');
INSERT INTO `menuinfo_role` VALUES ('15', '5', '15', '9', '1');
INSERT INTO `menuinfo_role` VALUES ('16', '3', '16', '9', '1');
INSERT INTO `menuinfo_role` VALUES ('45', '2', '2', '1', '1');
INSERT INTO `menuinfo_role` VALUES ('46', '2', '3', '1', '1');
INSERT INTO `menuinfo_role` VALUES ('47', '2', '6', '5', '1');
INSERT INTO `menuinfo_role` VALUES ('48', '2', '7', '5', '1');
INSERT INTO `menuinfo_role` VALUES ('49', '2', '8', '5', '1');
INSERT INTO `menuinfo_role` VALUES ('50', '2', '10', '9', '1');
INSERT INTO `menuinfo_role` VALUES ('51', '2', '11', '9', '1');
INSERT INTO `menuinfo_role` VALUES ('52', '2', '12', '9', '1');
INSERT INTO `menuinfo_role` VALUES ('53', '2', '13', '9', '1');
INSERT INTO `menuinfo_role` VALUES ('54', '2', '14', '9', '1');
