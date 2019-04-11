/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : 1807_test1

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2019-04-11 16:33:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for menuinfo
-- ----------------------------
DROP TABLE IF EXISTS `menuinfo`;
CREATE TABLE `menuinfo` (
  `menuid` int(11) NOT NULL AUTO_INCREMENT,
  `menuname` varchar(20) DEFAULT NULL,
  `menupath` varchar(100) DEFAULT NULL,
  `menuicon` varchar(100) DEFAULT NULL,
  `parentid` int(11) DEFAULT NULL,
  PRIMARY KEY (`menuid`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='菜单表';

-- ----------------------------
-- Records of menuinfo
-- ----------------------------
INSERT INTO `menuinfo` VALUES ('1', '权限管理', null, null, '0');
INSERT INTO `menuinfo` VALUES ('2', '用户维护', null, null, '1');
INSERT INTO `menuinfo` VALUES ('3', '角色维护', null, null, '1');
INSERT INTO `menuinfo` VALUES ('4', '菜单管理', null, null, '1');
INSERT INTO `menuinfo` VALUES ('5', '业务审核', null, null, '0');
INSERT INTO `menuinfo` VALUES ('6', '实名认证审核', null, null, '5');
INSERT INTO `menuinfo` VALUES ('7', '广告审核', null, null, '5');
INSERT INTO `menuinfo` VALUES ('8', '项目审核', null, null, '5');
INSERT INTO `menuinfo` VALUES ('9', '业务管理', null, null, '0');
INSERT INTO `menuinfo` VALUES ('10', '资质维护', null, null, '9');
INSERT INTO `menuinfo` VALUES ('11', '分类管理', null, null, '9');
INSERT INTO `menuinfo` VALUES ('12', '流程管理', null, null, '9');
INSERT INTO `menuinfo` VALUES ('13', '广告管理', null, null, '9');
INSERT INTO `menuinfo` VALUES ('14', '消息模板', null, null, '9');
INSERT INTO `menuinfo` VALUES ('15', '项目分类', null, null, '9');
INSERT INTO `menuinfo` VALUES ('16', '项目标签', null, null, '9');
