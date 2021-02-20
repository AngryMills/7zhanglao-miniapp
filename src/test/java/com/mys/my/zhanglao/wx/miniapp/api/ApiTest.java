package com.mys.my.zhanglao.wx.miniapp.api;

import com.mys.my.zhanglao.wx.miniapp.BaseSpringBootTest;
import com.mys.my.zhanglao.wx.miniapp.domain.GoldTimeFamily;
import com.mys.my.zhanglao.wx.miniapp.domain.GoldTimeSpec;
import com.mys.my.zhanglao.wx.miniapp.mapper.GoldTimeFamilyMapper;
import com.mys.my.zhanglao.wx.miniapp.mapper.GoldTimeSpecMapper;
import com.mys.my.zhanglao.wx.miniapp.utils.JsonUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ApiTest extends BaseSpringBootTest {
    @Autowired
    GoldTimeFamilyMapper goldTimeFamilyMapper;
    @Autowired
    GoldTimeSpecMapper goldTimeSpecMapper;

    @Test
    public void testInsertData() throws JSONException {
        String array = "[{\"familyId\":\"f51\",\"familyName\":\"走青春\",\"familyImg\":\"https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/banner/youth_b1.jpg\"},{\"familyId\":\"f52\",\"familyName\":\"美食\",\"familyImg\":\"https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/banner/food_b1.jpg\"},{\"familyId\":\"f53\",\"familyName\":\"旅行\",\"familyImg\":\"https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/banner/travel_b1.jpg\"},{\"familyId\":\"f54\",\"familyName\":\"乐在琦中\",\"familyImg\":\"https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/banner/baby_b1.jpg\"},{\"familyId\":\"f55\",\"familyName\":\"囧囧囧\",\"familyImg\":\"https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/banner/oops_b1.jpg\"}]";
        JSONArray jsonArray = new JSONArray(array);
//        JSONArray jsonArray = (JSONArray) JsonUtils.toObject(array, JSONArray.class);
        for (int i = 0; i < jsonArray.length(); i++) {
            String string = jsonArray.getJSONObject(i).toString();
            System.out.println(string);
            GoldTimeFamily goldTimeFamily = (GoldTimeFamily) JsonUtils.toObject(string, GoldTimeFamily.class);
            System.out.println(goldTimeFamily);
            goldTimeFamilyMapper.insert(goldTimeFamily);
        }
    }

    @Test
    public void testInsertSpecData() throws JSONException {
        String array = "[{\"familyId\":\"f55\",\"genId\":\"f55g01\",\"speId\":\"f55g01s01\",\"familyName\":\"尼泊尔-加德满都\",\"genName\":\"\",\"speName\":\"一个广场\",\"speImg\":\"https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/oops/109_0.1.jpg\",\"speCon\":\"记得当时想抓拍鸽子来着,没整好\",\"tim\":\"2015年3月\",\"water\":1},{\"familyId\":\"f55\",\"genId\":\"f55g01\",\"speId\":\"f55g01s02\",\"familyName\":\"山东-青岛\",\"genName\":\"\",\"speName\":\"无名饭店喝清酒\",\"speImg\":\"https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/oops/3.jpg\",\"speCon\":\"表面醉了,内心清醒的很\",\"tim\":\"2017年1月\",\"water\":1},{\"familyId\":\"f55\",\"genId\":\"f55g01\",\"speId\":\"f55g01s03\",\"familyName\":\"大连-家中\",\"genName\":\"\",\"speName\":\"家中菜园\",\"speImg\":\"https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/oops/5.jpg\",\"speCon\":\"原图找不到了,从电脑上拍的保留下来了。忘了干啥了,反正当时说的是哪疼来着\",\"tim\":\"未知\",\"water\":1},{\"familyId\":\"f55\",\"genId\":\"f55g01\",\"speId\":\"f55g01s04\",\"familyName\":\"尼泊尔-奇特旺\",\"genName\":\"\",\"speName\":\"可能在骑大象\",\"speImg\":\"https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/oops/6.jpg\",\"speCon\":\"这小表情也是没谁了\",\"tim\":\"2015年3月\",\"water\":1},{\"familyId\":\"f55\",\"genId\":\"f55g01\",\"speId\":\"f55g01s05\",\"familyName\":\"尼泊尔-奇特旺\",\"genName\":\"\",\"speName\":\"这确实是在骑大象\",\"speImg\":\"https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/oops/102.jpg\",\"speCon\":\"象鼻子是真的能装水\",\"tim\":\"2015年3月\",\"water\":1},{\"familyId\":\"f55\",\"genId\":\"f55g01\",\"speId\":\"f55g01s06\",\"familyName\":\"北京\",\"genName\":\"\",\"speName\":\"睡姿瞩目\",\"speImg\":\"https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/oops/4.jpg\",\"speCon\":\"这睡姿跟我闺女一样一样的\",\"tim\":\"未知\",\"water\":1}]";
        JSONArray jsonArray = new JSONArray(array);
        for (int i = 0; i < jsonArray.length(); i++) {
            String string = jsonArray.getJSONObject(i).toString();
            System.out.println(string);
            GoldTimeSpec goldTimeSpec = (GoldTimeSpec) JsonUtils.toObject(string, GoldTimeSpec.class);
            System.out.println(goldTimeSpec);
            goldTimeSpecMapper.insert(goldTimeSpec);
        }
    }

    @Test
    public void testQueryData() {
        GoldTimeFamily goldTimeFamily = goldTimeFamilyMapper.selectByPrimaryKey(1);
        System.out.println(goldTimeFamily);
    }

    @Test
    public void testJson() {
        String s = "{\"familyId\":\"f51\",\"familyName\":\"走青春\",\"familyImg\":\"https://7zhanglao-miniapp.oss-cn-beijing.aliyuncs.com/banner/youth_b1.jpg\"}";
        GoldTimeFamily object = (GoldTimeFamily) JsonUtils.toObject(s, GoldTimeFamily.class);
        System.out.println(object);

    }

}
