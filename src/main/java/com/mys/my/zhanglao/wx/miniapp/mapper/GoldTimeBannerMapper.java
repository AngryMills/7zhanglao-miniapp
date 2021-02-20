package com.mys.my.zhanglao.wx.miniapp.mapper;

import com.mys.my.zhanglao.wx.miniapp.domain.GoldTimeBanner;
import com.mys.my.zhanglao.wx.miniapp.domain.GoldTimeBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoldTimeBannerMapper {
    long countByExample(GoldTimeBannerExample example);

    int deleteByExample(GoldTimeBannerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoldTimeBanner record);

    int insertSelective(GoldTimeBanner record);

    List<GoldTimeBanner> selectByExample(GoldTimeBannerExample example);

    GoldTimeBanner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoldTimeBanner record, @Param("example") GoldTimeBannerExample example);

    int updateByExample(@Param("record") GoldTimeBanner record, @Param("example") GoldTimeBannerExample example);

    int updateByPrimaryKeySelective(GoldTimeBanner record);

    int updateByPrimaryKey(GoldTimeBanner record);
}