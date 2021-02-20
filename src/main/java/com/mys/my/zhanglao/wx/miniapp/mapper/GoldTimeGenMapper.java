package com.mys.my.zhanglao.wx.miniapp.mapper;

import com.mys.my.zhanglao.wx.miniapp.domain.GoldTimeGen;
import com.mys.my.zhanglao.wx.miniapp.domain.GoldTimeGenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoldTimeGenMapper {
    long countByExample(GoldTimeGenExample example);

    int deleteByExample(GoldTimeGenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoldTimeGen record);

    int insertSelective(GoldTimeGen record);

    List<GoldTimeGen> selectByExample(GoldTimeGenExample example);

    GoldTimeGen selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoldTimeGen record, @Param("example") GoldTimeGenExample example);

    int updateByExample(@Param("record") GoldTimeGen record, @Param("example") GoldTimeGenExample example);

    int updateByPrimaryKeySelective(GoldTimeGen record);

    int updateByPrimaryKey(GoldTimeGen record);
}