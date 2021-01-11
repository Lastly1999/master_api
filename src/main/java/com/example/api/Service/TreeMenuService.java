package com.example.api.Service;

import com.example.api.Dao.TreeMenuDao;
import com.example.api.Model.TreeMenuCol;
import com.example.api.Model.TreeMenuTable;
import com.example.api.Utils.ResultData;
import com.example.api.Utils.ResultUtils;
import com.example.api.Utils.TreeTools.TreeTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.transform.Result;
import java.util.List;

@Service
public class TreeMenuService {

    // 自动装配Dao层
    @Autowired
    TreeMenuDao treeMenuDao;

    /**
     * 查询所有数据
     * @return
     */
    public ResultData getTreeMenuList(String keywords){
        List<TreeMenuTable> list = treeMenuDao.getTreeMenuList(keywords);
        System.out.println(list);
        if(list.size() > 0){
            List<TreeMenuTable> aa = TreeTools.getTreeList(list);
            return ResultUtils.PubDataSuccess(aa);
        }else{
            return ResultUtils.PubError();
        }
    }

    /**
     * 修改菜单数据
     * @param treeMenuTable
     * @return
     */
    public ResultData editTreeMenuList(TreeMenuTable treeMenuTable){
        int count = treeMenuDao.editTreeMenuList(treeMenuTable);
        if(count > 0){
            return ResultUtils.PubSuccess();
        }else{
            return ResultUtils.PubError();
        }
    }

    /**
     * 新增菜单项
     * @param treeMenuTable
     * @return
     */
    public ResultData addTreeMenuList(TreeMenuTable treeMenuTable){
        int count = treeMenuDao.addTreeMenuList(treeMenuTable);
        if(count > 0){
            return ResultUtils.PubSuccess();
        }else{
            return ResultUtils.PubError();
        }
    }

    /**
     * 删除菜单项
     * @param menuId
     * @return
     */
    public ResultData delTreeMenuList(int menuId){
        int count = treeMenuDao.delTreeMenuList(menuId);
        if(count > 0){
            return  ResultUtils.PubSuccess();
        }else{
            return ResultUtils.PubError();
        }
    }

    /**
     * 查询导航菜单表字段注释列表
     * @return
     */
    public ResultData getTreeMenuCol(){
        List<TreeMenuCol> list = treeMenuDao.getTreeMenuCol();
        if(list.size() > 0){
            return  ResultUtils.PubDataSuccess(list);
        }else{
            return ResultUtils.PubError();
        }
    }
}
