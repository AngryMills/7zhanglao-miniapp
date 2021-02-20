/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3306
 Source Schema         : 7zhanglao_wx_miniapp

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 20/02/2021 17:09:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for gold_time_banner
-- ----------------------------
DROP TABLE IF EXISTS `gold_time_banner`;
CREATE TABLE `gold_time_banner`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `banner_type` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '1 首页 2 内页',
  `banner_name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `banner_img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `banner_desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
  `is_delete` tinyint(0) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gold_time_banner
-- ----------------------------
INSERT INTO `gold_time_banner` VALUES (1, '2', NULL, 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/travel/inside/banner1.jpg', NULL, '2021-02-20 16:06:52', 0);
INSERT INTO `gold_time_banner` VALUES (2, '2', NULL, 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/travel/inside/banner2.jpg', NULL, '2021-02-20 16:06:52', 0);
INSERT INTO `gold_time_banner` VALUES (3, '1', NULL, '/img/index/index1.jpg', NULL, '2021-02-20 16:11:18', 0);
INSERT INTO `gold_time_banner` VALUES (4, '1', NULL, '/img/index/index2.jpg', NULL, '2021-02-20 16:11:18', 0);
INSERT INTO `gold_time_banner` VALUES (5, '1', NULL, '/img/index/index3.jpg', NULL, '2021-02-20 16:11:18', 0);
INSERT INTO `gold_time_banner` VALUES (6, '1', NULL, '/img/index/index3_1.jpg', NULL, '2021-02-20 16:11:18', 0);
INSERT INTO `gold_time_banner` VALUES (7, '1', NULL, '/img/index/index4.jpg', NULL, '2021-02-20 16:11:18', 0);
INSERT INTO `gold_time_banner` VALUES (8, '1', NULL, '/img/index/index5.jpg', NULL, '2021-02-20 16:11:18', 0);
INSERT INTO `gold_time_banner` VALUES (9, '1', NULL, '/img/index/index6.jpg', NULL, '2021-02-20 16:11:18', 0);

-- ----------------------------
-- Table structure for gold_time_family
-- ----------------------------
DROP TABLE IF EXISTS `gold_time_family`;
CREATE TABLE `gold_time_family`  (
  `id` int(0) NOT NULL,
  `family_id` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `family_name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `family_img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
  `is_delete` tinyint(0) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gold_time_family
-- ----------------------------
INSERT INTO `gold_time_family` VALUES (1, 'f51', '走青春', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/banner/youth_b1.jpg', NULL, NULL);
INSERT INTO `gold_time_family` VALUES (2, 'f52', '美食', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/banner/food_b1.jpg', NULL, NULL);
INSERT INTO `gold_time_family` VALUES (3, 'f53', '旅行', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/banner/travel_b1.jpg', NULL, NULL);
INSERT INTO `gold_time_family` VALUES (4, 'f54', '乐在琦中', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/banner/baby_b1.jpg', NULL, NULL);
INSERT INTO `gold_time_family` VALUES (5, 'f55', '囧囧囧', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/banner/oops_b1.jpg', NULL, NULL);

-- ----------------------------
-- Table structure for gold_time_gen
-- ----------------------------
DROP TABLE IF EXISTS `gold_time_gen`;
CREATE TABLE `gold_time_gen`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `family_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `gen_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `gen_name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `gen_img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
  `is_delete` tinyint(0) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gold_time_gen
-- ----------------------------

-- ----------------------------
-- Table structure for gold_time_spec
-- ----------------------------
DROP TABLE IF EXISTS `gold_time_spec`;
CREATE TABLE `gold_time_spec`  (
  `id` int(0) NOT NULL DEFAULT 0 AUTO_INCREMENT,
  `family_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `gen_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `spe_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `family_name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `gen_name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `spe_name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `spe_img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `spe_con` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '介绍',
  `tim` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '时间',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
  `is_delete` tinyint(0) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gold_time_spec
-- ----------------------------
INSERT INTO `gold_time_spec` VALUES (1, 'f51', 'f51g01', 'f51g01s01', '锦州', '世博园', '世博园游玩', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/youth/20131004_102820_0.1.jpg', '锦州世博园游玩,还有当时还有晟闻和他对象来着。', '2013-10-04 10:28', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (2, 'f51', 'f51g01', 'f51g01s02', '北京', '景山公园', '景山公园游玩', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/youth/P41115-113447_0.1.jpg', '14 年张琦生日', '2014-11-15 11:34', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (3, 'f51', 'f51g01', 'f51g01s03', '北京', '地坛公园', '七寻八找·鱼有余菜馆', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/youth/P60925-141055_0.1.jpg', '当时就觉得这店的名字特逗就来吃了,也是个网红店。', '2016-09-25 14:10', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (4, 'f51', 'f51g01', 'f51g01s04', '北京', '玉渊潭公园', '玉渊潭游玩', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/youth/P61004-110310_0.1.jpg', '二舅帮忙拍的。', '2016-10-04 11:03', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (5, 'f51', 'f51g01', 'f51g01s05', '青岛', '栈桥', '栈桥游玩', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/youth/P70107-151804_0.1.jpg', '饼哥结婚前几天来青岛看他来着。', '2017-01-07 15:18', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (6, 'f51', 'f51g01', 'f51g01s06', '北京', '鸟巢附近', '国家会议中心看游乐展', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/youth/P70318-125412_0.1.jpg', '骑车等红绿灯。', '2017-03-18 12:54', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (7, 'f51', 'f51g01', 'f51g01s07', '北京', '什刹海公园', '什刹海公园游玩', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/youth/P70319-114019_0.1.jpg', '什刹海不是海。', '2017-03-19 11:40', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (8, 'f51', 'f51g01', 'f51g01s08', '北京', '鲜花港', '鲜花港徒步', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/youth/P70422-102030_0.1.jpg', '花挺好看的,还赚了俩包', '2017-04-22 10:20', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (9, 'f51', 'f51g01', 'f51g01s09', '北京', '大屯附近的照相馆', '拍领证需要的照片', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/youth/P70625-104404_0.1.jpg', '怕民政局拍的不好,100块钱拍的', '2017-06-25 10:44', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (10, 'f51', 'f51g01', 'f51g01s10', '大连', '甘井子民政局', '领证', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/youth/P70707-093505_0.1.jpg', '领证领证领证啦', '2017-07-07 09:35', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (11, 'f51', 'f51g01', 'f51g01s11', '北京', '慧忠里家中', '家中自拍', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/youth/P70723-130236_0.1.jpg', '张琦当时好像在准备考证,我蹭了张自拍', '2017-07-23 13:02', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (12, 'f51', 'f51g01', 'f51g01s12', '北京', '朝阳区', '第一次听脱口秀', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/youth/P70805-190439_0.1.jpg', '第一次听脱口秀挺有意思,线下啥段子都能讲', '2017-08-05 19:04', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (13, 'f51', 'f51g01', 'f51g01s13', '北京', '地点不记得了', '雪中自拍', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/youth/P71216-084009_0.1.jpg', '忘记了为什么在大雪天出门', '2017-12-16 08:40', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (14, 'f51', 'f51g01', 'f51g01s14', '北京', '工体附近', '大董门口', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/youth/P80113-172406_0.1.jpg', '第一次吃大董。记得第一次去吃全聚德的时候,给自己起了名字,烤鸭的世界我们不懂。直到吃了大董,不仅烤鸭不懂了,对吃的都不懂了。根本没吃饱。', '2018-01-13 17:24', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (15, 'f51', 'f51g01', 'f51g01s15', '北京', '国家图书馆', '国家图书馆', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/youth/IMG_20190303_122123_0.1.jpg', '去国图找昆明池的资料,也没找到啥。', '2019-03-03 12:21', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (16, 'f51', 'f51g01', 'f51g01s16', '台湾', '垦丁', '垦丁拍婚纱照', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/youth/mmexport1526782659489_0.1.jpg', '在垦丁一个旧牧场附近,还不错噢。', '2018-03-18 上午', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (17, 'f51', 'f51g01', 'f51g01s17', '大连', '格林豪泰酒店', '婚礼当天接亲', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/youth/810A0402_0.1.jpg', '一大早接亲时拍的,中间过程也比较曲折。', '2018-07-21 07:41', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (18, 'f51', 'f51g01', 'f51g01s18', '北京', '朝阳区', '怀孕7月时拍的孕妇照', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/youth/AR4A2948_0.1.jpg', '一直想拍,后来拖到了7个月,肚子也不是特别大,赶上国庆阅兵封路,差点没回来。', '2019-09-21 15:25', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (19, 'f51', 'f51g01', 'f51g01s19', '台湾', '垦丁', '婚纱照', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/youth/mmexport1526782690212_0.1.jpg', '这套衣服感觉挺好看的,蓝色和海水、游艇也很有感觉。', '2018-03-18 上午', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (20, 'f51', 'f51g01', 'f51g01s20', '北京-慧忠里家中', '', '剪头发', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/youth/P70422-162949_0.1.jpg', '第一次剪头发,也没啥工具,拿个普通剪子就硬剪了一个小时,效果还不错。', '2017-04-22 16:29', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (21, 'f52', 'f52g01', 'f52g01s01', '炒豆角丝', '炸鸡柳', '2019-03-24 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/IMG_20190324_132407_1_0.1.jpg', '两菜一汤', '2019-03-24 13:24', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (22, 'f52', 'f52g01', 'f52g01s02', '胡萝卜咖喱牛肉 炒蛋蒜苔', '菠菜丸子汤', '2019-04-06 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/IMG_20190406_114155_0.1.jpg', '我弟来了,稍微丰盛点', '2019-04-06 11:41', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (23, 'f52', 'f52g01', 'f52g01s03', '炖带鱼', '香菇油菜', '2019-04-07 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/IMG_20190407_134513_0.1.jpg', '这俩菜做的都不错,味道刚刚好', '2019-03-24 13:24', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (24, 'f52', 'f52g01', 'f52g01s04', '豆角炖排骨', '白菜粉丝汤', '2019-04-08 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/IMG_20190408_131857_0.1.jpg', '两菜一汤', '2019-04-08 13:18', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (25, 'f52', 'f52g01', 'f52g01s05', '炒土豆丝 排骨汤', '西葫芦鸡蛋', '2019-06-15 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003081958_0.1.jpg', '两菜一汤', '2019-06-15 11:55', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (26, 'f52', 'f52g01', 'f52g01s06', '番茄鱼 炒土豆片', '土豆丝 空心菜', '2019-06-22 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082054_0.1.jpg', '从那之后很少吃空心菜了，涨价的不行', '2019-06-22 12:02', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (27, 'f52', 'f52g01', 'f52g01s07', '杏鲍菇炒肉 黄瓜鸡蛋木耳', '菠菜丸子汤', '2019-06-30 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082058_0.1.jpg', '两菜一汤', '2019-06-30 12:18', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (28, 'f52', 'f52g01', 'f52g01s08', '炒面', '黄瓜鸡蛋汤', '2019-07-06 早餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082101_0.1.jpg', '炒面是开发的不错的一个早餐,正好楼下有卖饼丝的', '2019-07-06 07:53', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (29, 'f52', 'f52g01', 'f52g01s09', '杏鲍菇炒肉 蒜苔鸡蛋', '干豆腐啥汤', '2019-07-06 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082105_0.1.jpg', '', '2019-07-06 12:07', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (30, 'f52', 'f52g01', 'f52g01s10', '煎带鱼 土豆芸豆排骨', '红烧排骨', '2019-07-27 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082107_0.1.jpg', '每次红烧都不咋的', '2019-07-27 12:44', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (31, 'f52', 'f52g01', 'f52g01s11', '土豆丝 豆芽菜', '卷饼', '2019-08-03 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082110_0.1.jpg', '卷饼，张琦家的卷饼太让人怀念了，每次都得吃好几张', '2019-08-03 12:38', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (32, 'f52', 'f52g01', 'f52g01s12', '韭菜干豆腐 西红柿茄子', '炒包菜 干豆腐拌黄瓜', '2019-08-04 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082113_0.1.jpg', '西红柿茄子 这个菜就比较写意了', '2019-08-04 12:59', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (33, 'f52', 'f52g01', 'f52g01s13', '西红柿鸡蛋 花菜木耳', '凉拌土豆丝 菠菜丸子汤', '2019-08-11 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082129_0.1.jpg', '三菜一汤', '2019-08-11 12:43', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (34, 'f52', 'f52g01', 'f52g01s14', '大盘鸡 蒜苔鸡蛋', '', '2019-08-24 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082133_0.1.jpg', '第一次尝试做大盘鸡，我觉得味道还不错，张琦觉得还差点', '2019-08-24 11:10', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (35, 'f52', 'f52g01', 'f52g01s15', '饺子', '', '2019-08-28 早餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082137_0.1.jpg', '一般很少吃饺子，包得有点漏了', '2019-08-28 07:25', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (36, 'f52', 'f52g01', 'f52g01s16', '煮年糕', '', '2019-09-06 早餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082153_0.1.jpg', '两大碗年糕,还有鸡蛋丸子,满足了', '2019-09-06 06:39', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (37, 'f52', 'f52g01', 'f52g01s17', '土豆咖喱牛肉 花菜', '炸鸡块', '2019-09-15 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082156_0.1.jpg', '第一次尝试做大盘鸡，我觉得味道还不错，张琦觉得还差点', '2019-09-15 11:44', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (38, 'f52', 'f52g01', 'f52g01s18', '水煎饺', '', '2019-09-22 早餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082205_0.1.jpg', '忘记是西葫芦鸡蛋还是西红柿鸡蛋陷的了,总之成功', '2019-09-22 06:39', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (39, 'f52', 'f52g01', 'f52g01s19', '西葫芦鸡蛋 炸鸡块', '丸子汤', '2019-10-01 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082214_0.1.jpg', '快生了不方便,十一没回家,在家待着', '2019-10-01 12:18', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (40, 'f52', 'f52g01', 'f52g01s20', '春饼 土豆丝 豆芽菜', '鸡蛋酱', '2019-10-03 早餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082217_0.1.jpg', '薄薄的春饼,鸡蛋酱,绝配', '2019-10-03 07:00', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (41, 'f52', 'f52g01', 'f52g01s21', '炒大头菜 蒜苔鸡蛋', '', '2019-07-21 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082401_0.1.jpg', '两个菜没有汤', '2019-07-21 12:50', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (42, 'f52', 'f52g01', 'f52g01s22', '西红柿鸡蛋 芹菜土豆', '熟食', '2019-07-20 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082406_0.1.jpg', '张琦公司买的熟食,味道还可以', '2019-07-20 12:56', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (43, 'f52', 'f52g01', 'f52g01s23', '土豆炖芸豆 木耳鸡蛋', '奥尔良鸡腿 煎鱼', '2019-07-14 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082409_0.1.jpg', '鸡腿和鱼都是公司买的,芸豆炖的不错,把芸豆整短点就更好了', '2019-07-14 12:13', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (44, 'f52', 'f52g01', 'f52g01s24', '白菜木耳 煎带鱼', '黄瓜干豆腐丝汤', '两周年纪念 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082417_0.1.jpg', '两周年纪念,特地买了两块蛋糕,是不是很可爱', '2019-07-07 12:11', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (45, 'f52', 'f52g01', 'f52g01s25', '豆角粒炒肉 西红柿鸡蛋', '', '2019-06-29 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082420_0.1.jpg', '', '2019-06-29 12:50', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (46, 'f52', 'f52g01', 'f52g01s26', '西葫芦鸡蛋木耳 炸鸡柳', '干豆腐丝丸子汤', '2019-06-16 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082424_0.1.jpg', '两周年纪念,特地买了两块蛋糕,是不是很可爱', '2019-06-16 12:29', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (47, 'f52', 'f52g01', 'f52g01s27', '鸡蛋羹 糖火烧 馅饼', '鸡蛋汤 豆浆', '2019-06-14 早餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082447_0.1.jpg', '在张琦公司,早餐这下是吃饱了', '2019-06-14 08:02', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (48, 'f52', 'f52g01', 'f52g01s28', '炒土豆丝 黄瓜拌豆腐', '萝卜丝丸子汤', '2019-06-09 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082451_0.1.jpg', '清淡又营养,颜色也好看', '2019-06-09 12:17', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (49, 'f52', 'f52g01', 'f52g01s29', '乱炖 芸豆丝炒肉', '菠菜鸡蛋', '2019-06-08 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/微信图片_20191003082454_0.1.jpg', '芸豆丝炒肉卖相不太好,不过很好吃', '2019-06-08 12:14', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (50, 'f52', 'f52g01', 'f52g01s30', '花菜丸子 菠菜蘸酱', '白菜丸子冻豆腐', '2019-08-18 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/IMG_20190818_123529_0.1.jpg', '还有个7fresh买的大面包,贼难吃', '2019-08-18 12:35', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (51, 'f52', 'f52g01', 'f52g01s31', '水煮肉 酱牛肉', '芹菜腰果 黄瓜拌干豆腐 蒜苔鸡蛋', '2020-01-24 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/IMG_20200124_125137_0.1.jpg', '四个人吃的是不是有点多,张琦家午餐就是这么丰富', '2020-01-24 12:51', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (52, 'f52', 'f52g01', 'f52g01s32', '爱心便当', '蒜苗干豆腐 白菜木耳炒肉', '2020-04-13 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/IMG_20200413_120952_0.1.jpg', '爱心便当吃撑了', '2020-04-13 12:09', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (53, 'f52', 'f52g01', 'f52g01s33', '爱心便当', '土豆炖鸡肉 干豆腐拌肠 西葫芦鸡蛋', '2020-04-13 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/IMG_20200414_113852_0.1.jpg', '一早起来炒3个菜,不容易,亲爱的,辛苦了', '2020-04-14 11:38', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (54, 'f52', 'f52g01', 'f52g01s34', '爱心便当', '干豆腐菜卷 虾仁鸡蛋 土豆丝', '2020-04-16 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/IMG_20200416_115100_0.1.jpg', '芸豆丝炒肉卖相不太好,不过很好吃', '2020-04-16 11:51', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (55, 'f52', 'f52g01', 'f52g01s35', '爱心便当', '白菜jianyong 炸鸡柳 西红柿鸡蛋', '2020-04-17 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/IMG_20200417_114939_0.1.jpg', 'jianyong这两字没有啊,满满的蛋白,吃的爽了', '2020-04-17 11:49', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (56, 'f52', 'f52g01', 'f52g01s36', '爱心便当', '鱼香肉丝 青椒土豆片', '2020-04-21 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/IMG_20200421_114957_0.1.jpg', '鱼香肉丝味道绝了,感觉比饭店的好吃', '2020-04-21 11:49', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (57, 'f52', 'f52g01', 'f52g01s37', '爱心便当', '圆葱牛肉 家常豆腐 鸡蛋饼', '2020-04-23 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/IMG_20200423_114820_0.1.jpg', '都是费事的菜,饼有点干', '2020-04-23 11:48', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (58, 'f52', 'f52g01', 'f52g01s38', '爱心便当', '花菜虾仁 白菜粉丝肉', '2020-04-24 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/IMG_20200424_120632_0.1.jpg', '有鱼有虾', '2020-04-24 12:06', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (59, 'f52', 'f52g01', 'f52g01s39', '爱心便当', '宫爆鸡丁 橄榄菜豆角', '2020-04-26 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/IMG_20200426_115131_0.1.jpg', '第一次做宫爆鸡丁,味道巴适得很', '2020-04-26 11:51', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (60, 'f52', 'f52g01', 'f52g01s40', '爱心便当', '土豆蘑菇鸡块', '2020-04-29 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/IMG_20200429_115654_0.1.jpg', '一道菜胜过两道！', '2020-04-29 11:56', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (61, 'f52', 'f52g01', 'f52g01s41', '土豆咖喱鸡块 煎带鱼 蒜苔鸡蛋', '花菜虾仁 黄瓜拌干豆腐 西红柿巴沙鱼汤', '2020-05-10 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/IMG_20200510_125105_0.1.jpg', '二舅和二舅妈第一次来新搬的地方,张大厨辛苦做了一大桌子菜,唯一有点遗憾没喝点', '2020-05-10 12:51', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (62, 'f52', 'f52g01', 'f52g01s42', '乱炖排骨 蒜蓉粉丝扇贝 炒空心菜', '白菜木耳炒肉 黄瓜拌干豆腐 牛肉萝卜汤', '2020-08-23 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/2b0b359b24c53b948c49a61cb441769_0.1.jpg', '雨明和对象第一次过来,还给乐琦买了俩玩偶', '2020-08-23 12:27', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (63, 'f52', 'f52g01', 'f52g01s43', '爱心便当', '炸鱼排 尖椒豆腐 西葫芦西红柿鸡蛋', '2020-09-23 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/IMG_20200923_123835_0.1.jpg', '炸鱼排好吃,刺有点多,吃的有点累', '2020-09-23 12:38', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (64, 'f52', 'f52g01', 'f52g01s44', '爱心便当', '土豆咖喱鸡块 蒜苔鸡蛋 蘑菇油菜', '2020-09-24 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/IMG_20200924_121002_0.1.jpg', '咖喱鸡肉太硬了,我是说这道菜太硬了', '2020-09-24 12:10', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (65, 'f52', 'f52g01', 'f52g01s45', '清蒸鱼 软炸里脊 酸菜排骨', '圆葱木耳胡萝卜蒜苔鸡蛋', '2020-10-01 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/IMG_20201001_132747_0.1.jpg', '这大鱼大肉和各种荟在一起的素菜,别说真香,就是吃不太动了', '2020-10-01 13:27', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (66, 'f52', 'f52g01', 'f52g01s46', '长寿面', '', '2020-10-05 午餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/IMG_20201005_072303_0.1.jpg', '30岁生日张琦特意准备的惊喜,感动', '2020-10-05 07:23', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (67, 'f52', 'f52g01', 'f52g01s50', '排骨炖酸菜', '其他菜不详', '2018-10-03 早餐', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/food/IMG_20181003_085636.jpg', '张琦家的早餐丰盛地让人以为是午餐', '2018-10-03 08:56', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (68, 'f53', 'f53g01', 'f53g01s01', '台湾潜水', '出水', '台湾-垦丁', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/travel/inside/1727710127_0.1x.jpg', '第一次潜水体验很不错哦', '2018-03-14 17:30', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (69, 'f53', 'f53g01', 'f53g01s02', '山东', '烟台', '烟台-长岛—望夫崖', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/travel/inside/shandong.jpg', '太青涩了吧,大三的时候去山东旅游,也是第一次两人出远门。', '2012-08-01 14:10', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (70, 'f53', 'f53g01', 'f53g01s03', '大连', '旅顺', '大连-樱花园', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/travel/inside/dl2.jpg', '第一次一起回大连,当时潘阳帮着拍的照', '2011-05-02 上午', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (71, 'f53', 'f53g01', 'f53g01s04', '辽宁 鞍山', '千山', '鞍山-千山一日游', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/travel/inside/qianshan.jpg', '一起征服的为数不多的山之一', '2012-09-09 上午', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (72, 'f53', 'f53g01', 'f53g01s05', '《海角七号》', '拍摄地', '恒春-阿嘉的家', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/travel/inside/haijiaoqihao_0.1.jpg', '还记得看《海角七号》的时候,很喜欢,后来把海报贴到家里的墙上', '2018-03-14 17:37', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (73, 'f53', 'f53g01', 'f53g01s06', '云南香格里拉', '属都湖', '香格里拉-属都湖', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/travel/inside/yunnan_shuduhu.jpg', '前几年看新闻香格里拉古镇被烧没了,有点可惜。怀念那道满是油的牦牛粒和感觉不咋熟的米饭', '2013年5月', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (74, 'f53', 'f53g01', 'f53g01s07', '山东 青岛', '饭店吃大虾', '青岛-无名饭店', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/travel/inside/qingdaowuming_0.1.jpg', '在火车站附近的无名饭店,当时青岛大虾特别出名,还怕被宰。不过还好,还喝了点,嘿', '2018-03-14 17:30', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (75, 'f53', 'f53g01', 'f53g01s08', '云南 大理', '古镇', '大理-古镇', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/travel/inside/yunnan3.jpg', '大理是我最喜欢的古镇,比丽江原生态很多。还记得在洱海边给老朴打电话,-\'你猜我在哪\'-\'哪啊\',-\'大理\',-\'靠，大连啊,回来不说声\',-\'傻逼,是大理\'', '2013年5月', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (76, 'f53', 'f53g01', 'f53g01s09', '辽宁 大连', '', '大连-圣亚海洋世界', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/travel/inside/dalianshengya_0.1.jpg', '那年搞活动,本命年免费,虽然没啥动物,但也不亏。翻看照片意外发现竟然还是情人节...', '2014-02-14 11:51', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (77, 'f53', 'f53g01', 'f53g01s10', '台湾 嘉义', '', '台湾-阿里山', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/travel/inside/taiwanalishan_0.1.jpg', '可以说是来台湾的第一站,一早就开始爬山,本以为热的不行。没考虑到海拔对气温的影响,后来冻完了...晚上还打车回去的。另外说一句,嘉义兆品酒店不错。', '2018-03-11 11:43', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (78, 'f53', 'f53g01', 'f53g01s11', '辽宁 锦州', '', '锦州-世博园', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/travel/inside/jinzhoushibo.jpg', '一大早起来精神不咋好,加上刚烫的头,风吹的...', '2013-10-04 10:28', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (79, 'f53', 'f53g01', 'f53g01s12', '尼泊尔-博卡拉', '', '博卡拉-费瓦湖', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/travel/outside/niboer-feiwahu_0.1.jpg', '在博卡拉买酸奶,交了智商税...费瓦湖上第一次划船,没找船夫,被当地人赞技术好,也挺有意思的', '2015年3月', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (80, 'f53', 'f53g01', 'f53g01s13', '尼泊尔-奇特旺', '', '奇特旺-骑大象', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/travel/outside/103.jpg', '第一次骑大象被喷了一身水,回去换衣服来着,晚上还要去看表演。特喜欢奇特旺的感觉,躺在门口的长椅上,对面就是喜马拉雅山脉,惬意', '2015年3月', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (81, 'f54', 'f54g01', 'f54g01s01', '阜新', '二院', '产后第二天', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/baby/IMG_20191207_162802_0.1.jpg', '小家伙眼睛还睁不开呢', '2019-12-07 16:28', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (82, 'f54', 'f54g01', 'f54g01s02', '阜新', '二院', '产后第四天', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/baby/IMG_20191209_080015_0.1.jpg', '小家伙会吃奶啦', '2019-12-09 08:00', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (83, 'f54', 'f54g01', 'f54g01s03', '北京海淀', '', '东升八家郊野公园', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/baby/IMG_20200801_171426_0.1.jpg', '和爸妈一起带她去逛公园,之前因为疫情也没怎么出来,感觉是又热又困啊', '2020-08-01 17:14', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (84, 'f54', 'f54g01', 'f54g01s04', '北京海淀公园的路上', '', '出租车上', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/baby/06140efc9f01f490241241c4533417d_0.1.jpg', '坐车超过5公里就有点赖急了,得选近的公园了', '2020-10-18 16:00', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (85, 'f54', 'f54g01', 'f54g01s05', '海淀公园', '秋游', '北京海淀公园', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/baby/7ccc007a753825fcf76cff827bf6941_0.1.jpg', '海淀公园有一个大草场,很多人搭帐篷、放风筝,是个适合郊游的地方', '2020-10-18 15:16', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (86, 'f54', 'f54g01', 'f54g01s06', '北京海淀', '', '家中自拍', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/baby/baby_banner5.jpg', '笑的都开心,后来还用这张照片做了手机壳和抱枕', '2020年10月', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (87, 'f54', 'f54g01', 'f54g01s07', '北京海淀', '', '家中自拍', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/baby/IMG_20201019_074750_0.1.jpg', '这美颜全开了', '2020-10-18 07:47', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (88, 'f55', 'f55g01', 'f55g01s01', '尼泊尔-加德满都', '', '一个广场', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/oops/109_0.1.jpg', '记得当时想抓拍鸽子来着,没整好', '2015年3月', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (89, 'f55', 'f55g01', 'f55g01s02', '山东-青岛', '', '无名饭店喝清酒', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/oops/3.jpg', '表面醉了,内心清醒的很', '2017年1月', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (90, 'f55', 'f55g01', 'f55g01s03', '大连-家中', '', '家中菜园', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/oops/5.jpg', '原图找不到了,从电脑上拍的保留下来了。忘了干啥了,反正当时说的是哪疼来着', '未知', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (91, 'f55', 'f55g01', 'f55g01s04', '尼泊尔-奇特旺', '', '可能在骑大象', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/oops/6.jpg', '这小表情也是没谁了', '2015年3月', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (92, 'f55', 'f55g01', 'f55g01s05', '尼泊尔-奇特旺', '', '这确实是在骑大象', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/oops/102.jpg', '象鼻子是真的能装水', '2015年3月', NULL, NULL);
INSERT INTO `gold_time_spec` VALUES (93, 'f55', 'f55g01', 'f55g01s06', '北京', '', '睡姿瞩目', 'https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/oops/4.jpg', '这睡姿跟我闺女一样一样的', '未知', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
