package com.example.api.Dao;

import com.example.api.Model.CityTable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CityTableDao {
    /**
     * 查询表格记录
     * return List<cityTable>
     */
    List<CityTable> getAllCityList(String keywords);

    /**
     * 添加记录
     */
    int appendCityList(CityTable cityTable);

    /**
     * 查询是否存在
     */
    List<CityTable> getExist(CityTable cityTable);

    /**
     * 修改记录
     */
    int editCityList(CityTable cityTable);

    /**
     * 删除记录
     */
    int deleteCityList(int Id);
}
