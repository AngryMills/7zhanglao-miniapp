package com.mys.my.zhanglao.wx.miniapp.mapper;

import com.mys.my.zhanglao.wx.miniapp.domain.GoldTimeFamily;
import com.mys.my.zhanglao.wx.miniapp.domain.GoldTimeFamilyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoldTimeFamilyMapper {
    long countByExample(GoldTimeFamilyExample example);

    int deleteByExample(GoldTimeFamilyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoldTimeFamily record);

    int insertSelective(GoldTimeFamily record);

    List<GoldTimeFamily> selectByExample(GoldTimeFamilyExample example);

    GoldTimeFamily selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoldTimeFamily record, @Param("example") GoldTimeFamilyExample example);

    int updateByExample(@Param("record") GoldTimeFamily record, @Param("example") GoldTimeFamilyExample example);

    int updateByPrimaryKeySelective(GoldTimeFamily record);

    int updateByPrimaryKey(GoldTimeFamily record);
}