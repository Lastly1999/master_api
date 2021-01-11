package com.example.api.Service;


import com.example.api.Dao.CityTableDao;
import com.example.api.Model.CityTable;
import com.example.api.Utils.ResultData;
import com.example.api.Utils.ResultUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    /*
     * Service层介于controller和dao之间作为服务层进行一些逻辑处理，
     */

    // 自动装配Dao层
    @Autowired
    CityTableDao cityTableDao;

    /**
     * 获取全部列表
     * @return List<CityTable>
     */
    public ResultData getAllCityList(int pageSize,int pageCurrent,String keywords){
        // 设置pageHelper插件默认起始页和单页显示总数
        PageHelper.startPage(pageCurrent,pageSize);
        // 调用Dao层查询全部数据方法
        List<CityTable> list = cityTableDao.getAllCityList(keywords);
        // 生成pageInfo类型的list 将查询到的参数放到里面做条数整理
        PageInfo<CityTable> pageInfo = new PageInfo<>(list);
        return ResultUtils.success(pageInfo);
    }

    /**
     * 添加记录
     * @param cityTable
     * @return List<CityTable>
     */
    public ResultData appendCityList(CityTable cityTable) {
        // 查询是否已经有重复数据存在
        List<CityTable> list = cityTableDao.getExist(cityTable);
        if (null == list || list.size() > 0) {
            return ResultUtils.yetExist();
        } else {
            // 是否添加成功
            int changeNum = cityTableDao.appendCityList(cityTable);
            if (changeNum > 0) {
                return ResultUtils.success("");
            }else{
                return ResultUtils.error();
            }
        }
    }

    /**
     * 修改记录
     * @param cityTable
     * @return
     */
    public ResultData editCityList(CityTable cityTable){
        // 查询此记录是否存在
        int changeCount = cityTableDao.editCityList(cityTable);
        if(changeCount > 0){
            return ResultUtils.PubSuccess();
        }else{
            return ResultUtils.PubError();
        }
    }

    /**
     * 删除记录
     * @param Id
     * @return
     */
    public ResultData deleteCityList(int Id){
        int changeCount = cityTableDao.deleteCityList(Id);
        if(changeCount > 0){
            return ResultUtils.PubSuccess();
        }else{
            return ResultUtils.PubError();
        }
    }
}
