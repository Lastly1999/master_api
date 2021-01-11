package com.example.api.Utils.TreeTools;

import com.example.api.Model.TreeMenuTable;

import java.util.ArrayList;
import java.util.List;

/**
 * 导航菜单工具类
 */
public class TreeTools {
    /**
     * 递归生成方法
     * @param {menuParentId}
     * @param {menus}
     * @return
     */
    public static List<TreeMenuTable> getTreeList(List<TreeMenuTable> children) {
        List<TreeMenuTable> resultList = new ArrayList<>();
        //获取顶层元素集合
        int parentCode;
        for (TreeMenuTable entity : children) {
            parentCode = entity.getMenuParentId();
            //顶层元素的parentCode==null或者为0
            if (parentCode == 0) {  
                resultList.add(entity);
            }
        }
        //获取每个顶层元素的子数据集合
        for (TreeMenuTable entity : resultList) {
            entity.setChildren(getSubList(entity.getMenuId(), children));
        }
        return resultList;
    }
    /**
     * 获取子数据集合
     *
     * @param id
     * @param entityList
     * @return
     * @author Lastly
     * @date 2020年12月29日
     */
    private static List<TreeMenuTable> getSubList(int id, List<TreeMenuTable> entityList) {
        List<TreeMenuTable> children = new ArrayList<>();
        int parentId;
        //子集的直接子对象
        for (TreeMenuTable entity : entityList) {
            parentId = entity.getMenuParentId();
            if (id == parentId) {
                children.add(entity);
            }
        }
        //子集的间接子对象
        for (TreeMenuTable entity : children) {
            entity.setChildren(getSubList(entity.getMenuId(), entityList));
        }
        //递归退出条件
        if (children.size() == 0) {
            return null;
        }
        return children;
    }
}
