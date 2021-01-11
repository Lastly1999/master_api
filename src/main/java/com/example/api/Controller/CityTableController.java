package com.example.api.Controller;


import com.example.api.Model.CityTable;
import com.example.api.Service.CityService;
import com.example.api.Utils.Result.PageResult;
import com.example.api.Utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;
import java.util.List;

@RestController
public class CityTableController {

    // Service层自动注入
    @Autowired
    CityService cityService;

    /**
     * 查询全部城市全部列表
     * @param pageResult
     * @param {keywords} 模糊搜索
     * @param {pageCurrent} 第几页
     * @param {pageSize} 设置页数量
     * @return
     */
    @PostMapping("/getAllCityList")
    public ResultData getALLCityList(@RequestBody PageResult pageResult){
        int pageSize = pageResult.getPageSize();
        int pageCurrent = pageResult.getPageCurrent();
        String keywords = pageResult.getKeywords();
        System.out.println(pageResult.toString());
        ResultData resultData = cityService.getAllCityList(pageSize,pageCurrent,keywords);
        System.out.println("/getAllCityList -- "+resultData.toString());
        return resultData;
    }

    /**
     * 添加记录
     * @param cityTable
     * @return
     */
   @PostMapping("/appendCityList")
    public ResultData appendCityList(@RequestBody CityTable cityTable){
        System.out.println(cityTable.toString());
        ResultData resultData = cityService.appendCityList(cityTable);
        System.out.println("/appendCityList -- "+resultData.toString());
        return resultData;
   }

    /**
     * 修改记录
     * @param cityTable
     * @return
     */
    @PostMapping("/editCityList")
    public ResultData editCityList(@RequestBody CityTable cityTable){
        System.out.println(cityTable.toString());
        ResultData resultData = cityService.editCityList(cityTable);
        System.out.println("/editCityList -- "+resultData.toString());
        return resultData;
    }

    /**
     * 删除记录
     * @param cityTable
     * @return
     */
    @PostMapping("/deleteCityList")
    public ResultData deleteCityList(@RequestBody CityTable cityTable){
        System.out.println(cityTable.getId());
        ResultData resultData = cityService.deleteCityList(cityTable.getId());
        System.out.println(resultData);
        return resultData;
    }
}
