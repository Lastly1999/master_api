package com.example.api.Model;

import java.util.List;

public class TreeMenuTable {

    /**
     * {menuId} 菜单id
     * {menuName} 菜单名称
     * {menuPath} 菜单路径
     * {menuParentId} 父菜单id 0为父级
     * {roleId} 区域编码 权限id
     */
    private int MenuId;
    private String MenuName;
    private String MenuPath;
    private String MenuIcon;
    private int MenuParentId;
    private int RoleId;
    private String MenuParentName;
    private List<TreeMenuTable> children;

    public String getMenuParentName() {
        return MenuParentName;
    }

    public void setMenuParentName(String menuParentName) {
        MenuParentName = menuParentName;
    }

    public int getMenuId() {
        return MenuId;
    }

    public void setMenuId(int menuId) {
        MenuId = menuId;
    }

    public String getMenuName() {
        return MenuName;
    }

    public void setMenuName(String menuName) {
        MenuName = menuName;
    }

    public String getMenuPath() {
        return MenuPath;
    }

    public void setMenuPath(String menuPath) {
        MenuPath = menuPath;
    }

    public int getMenuParentId() {
        return MenuParentId;
    }

    public void setMenuParentId(int menuParentId) {
        MenuParentId = menuParentId;
    }

    public int getRoleId() {
        return RoleId;
    }

    public void setRoleId(int roleId) {
        RoleId = roleId;
    }

    public List<TreeMenuTable> getChildren() {
        return children;
    }

    public void setChildren(List<TreeMenuTable> children) {
        this.children = children;
    }

    public String getMenuIcon() {
        return MenuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        MenuIcon = menuIcon;
    }

    @Override
    public String toString() {
        return "TreeMenuTable{" +
                "MenuId=" + MenuId +
                ", MenuName='" + MenuName + '\'' +
                ", MenuPath='" + MenuPath + '\'' +
                ", MenuIcon='" + MenuIcon + '\'' +
                ", MenuParentId=" + MenuParentId +
                ", RoleId=" + RoleId +
                ", children=" + children +
                ", MenuParentName=" + MenuParentName +
                '}';
    }
}
