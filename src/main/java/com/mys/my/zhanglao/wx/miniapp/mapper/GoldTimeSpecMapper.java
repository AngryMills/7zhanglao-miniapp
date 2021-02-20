package com.mys.my.zhanglao.wx.miniapp.mapper;

import com.mys.my.zhanglao.wx.miniapp.domain.GoldTimeSpec;
import com.mys.my.zhanglao.wx.miniapp.domain.GoldTimeSpecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoldTimeSpecMapper {
    long countByExample(GoldTimeSpecExample example);

    int deleteByExample(GoldTimeSpecExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoldTimeSpec record);

    int insertSelective(GoldTimeSpec record);

    List<GoldTimeSpec> selectByExample(GoldTimeSpecExample example);

    GoldTimeSpec selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoldTimeSpec record, @Param("example") GoldTimeSpecExample example);

    int updateByExample(@Param("record") GoldTimeSpec record, @Param("example") GoldTimeSpecExample example);

    int updateByPrimaryKeySelective(GoldTimeSpec record);

    int updateByPrimaryKey(GoldTimeSpec record);
}