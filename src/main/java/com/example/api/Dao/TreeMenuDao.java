package com.example.api.Dao;

import com.example.api.Model.TreeMenuCol;
import com.example.api.Model.TreeMenuTable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TreeMenuDao {

    /**
     * 获取树形导航菜单
     * @return
     */
    List<TreeMenuTable> getTreeMenuList(String keywords);

    /**
     * 修改导航菜单
     * @param treeMenuTable
     * @return
     */
    int editTreeMenuList(TreeMenuTable treeMenuTable);

    /**
     * 添加导航菜单
     * @param treeMenuTable
     * @return
     */
    int addTreeMenuList(TreeMenuTable treeMenuTable);

    /**
     * 删除导航菜单
     * @param menuId
     * @return
     */
    int delTreeMenuList(int menuId);

    /**
     * 查询导航菜单注释列表
     * @return List<TreeMenuCol>
     */
    List<TreeMenuCol> getTreeMenuCol();
}
