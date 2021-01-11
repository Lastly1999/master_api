package com.example.api.Controller;


import com.example.api.Model.TreeMenuTable;
import com.example.api.Service.TreeMenuService;
import com.example.api.Utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;
import java.util.Map;

@RestController
public class TreeMenuController {

    // 自动装配Service层
    @Autowired
    TreeMenuService treeMenuService;


    /**
     * 获取导航菜单
     * @return
     */
    @PostMapping("/getTreeMenuList")
    public ResultData getTreeMenuList(@RequestBody Map params){
        String keywords = (String) params.get("keywords");
//        String key = (String)params.get("key");
        System.out.println("/getTreeMenuList -- "+ "keywords:"+keywords+",");
        ResultData resultData = treeMenuService.getTreeMenuList(keywords);
        return resultData;
    }

    /**
     * 修改导航菜单
     * @return
     */
    @PostMapping("/editTreeMenuList")
    public ResultData editTreeMenuList(@RequestBody TreeMenuTable treeMenuTable){
        System.out.println("/editTreeMenuList -- "+treeMenuTable.toString());
        ResultData resultData = treeMenuService.editTreeMenuList(treeMenuTable);
        return resultData;
    }

    /**
     * 添加导航菜单
     * @return
     */
    @PostMapping("/addTreeMenuList")
    public ResultData addTreeMenuList(@RequestBody TreeMenuTable treeMenuTable){
        System.out.println("/addTreeMenuList -- "+treeMenuTable.toString());
        ResultData resultData = treeMenuService.addTreeMenuList(treeMenuTable);
        System.out.println(resultData.toString());
        return resultData;
    }

    /**
     * 删除导航菜单
     * @param treeMenuTable
     * @return
     */
    @PostMapping("/delTreeMenuList")
    public ResultData delTreeMenuList(@RequestBody TreeMenuTable treeMenuTable){
        System.out.println("/delTreeMenuList -- "+treeMenuTable.toString());
        ResultData resultData = treeMenuService.delTreeMenuList(treeMenuTable.getMenuId());
        return resultData;
    }

    /**
     * 查询导航菜单下拉搜素
     * @return
     */
    @PostMapping("/getTreeMenuCol")
    public ResultData getTreeMenuCol(){
        System.out.println("/getTreeMenuCol --");
        ResultData resultData = treeMenuService.getTreeMenuCol();
        return resultData;
    }
}
