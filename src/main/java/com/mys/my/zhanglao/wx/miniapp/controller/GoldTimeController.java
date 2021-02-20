package com.mys.my.zhanglao.wx.miniapp.controller;

import com.mys.my.zhanglao.wx.miniapp.domain.result.ApiResult;
import com.mys.my.zhanglao.wx.miniapp.service.GoldTimeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 小程序业务接口
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
@RestController
@RequestMapping("/goldtime")
public class GoldTimeController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    GoldTimeService goldTimeService;

    /**
     * banner 列表接口
     */
    @GetMapping("/banner/list")
    public ApiResult list(Integer type) {
        return goldTimeService.bannerList(type);
    }
    /**
     * family 列表接口
     */
    @GetMapping("/family/list")
    public ApiResult list() {
        return goldTimeService.familyList();
    }
    /**
     * spec 列表接口
     */
    @GetMapping("/spec/list")
    public ApiResult specList(String familyId) {
        return goldTimeService.specList(familyId);
    }
}
