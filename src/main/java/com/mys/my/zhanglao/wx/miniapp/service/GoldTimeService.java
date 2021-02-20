package com.mys.my.zhanglao.wx.miniapp.service;

import com.mys.my.zhanglao.wx.miniapp.domain.*;
import com.mys.my.zhanglao.wx.miniapp.domain.result.ApiResult;
import com.mys.my.zhanglao.wx.miniapp.mapper.GoldTimeBannerMapper;
import com.mys.my.zhanglao.wx.miniapp.mapper.GoldTimeFamilyMapper;
import com.mys.my.zhanglao.wx.miniapp.mapper.GoldTimeSpecMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: weixin-java-miniapp-demo
 * @description:
 * @author: gmwang
 * @email: wangguangmin@yiche.com
 * @create: 2021/02/20 15:17
 */
@Service
public class GoldTimeService {
    @Autowired
    GoldTimeFamilyMapper goldTimeFamilyMapper;

    @Autowired
    GoldTimeBannerMapper goldTimeBannerMapper;

    @Autowired
    GoldTimeSpecMapper goldTimeSpecMapper;

    /**
     * @param
     * @return com.mys.my.zhanglao.wx.miniapp.domain.result.ApiResult
     * @Author gmwang
     * @Description 种类列表
     * @Date 2021/2/20 16:15
     **/
    public ApiResult familyList() {
        ApiResult result = ApiResult.success();
        List<GoldTimeFamily> list = goldTimeFamilyMapper.selectByExample(new GoldTimeFamilyExample());
        result.setData(list);
        return result;
    }

    /**
     * @param
     * @return com.mys.my.zhanglao.wx.miniapp.domain.result.ApiResult
     * @Author gmwang
     * @Description banner列表
     * @Date 2021/2/20 16:15
     **/
    public ApiResult bannerList(Integer type) {
        ApiResult result = ApiResult.success();
        GoldTimeBannerExample example = new GoldTimeBannerExample();
        example.createCriteria().andBannerTypeEqualTo(type + "");
        List<GoldTimeBanner> list = goldTimeBannerMapper.selectByExample(example);
        result.setData(list);
        return result;
    }

    /**
     * @param
     * @return com.mys.my.zhanglao.wx.miniapp.domain.result.ApiResult
     * @Author gmwang
     * @Description 具体数据列表
     * @Date 2021/2/20 16:15
     **/
    public ApiResult specList(String familyId) {
        ApiResult result = ApiResult.success();
        GoldTimeSpecExample example = new GoldTimeSpecExample();
        example.createCriteria().andFamilyIdEqualTo(familyId);
        List<GoldTimeSpec> list = goldTimeSpecMapper.selectByExample(example);
        result.setData(list);
        return result;
    }
}
