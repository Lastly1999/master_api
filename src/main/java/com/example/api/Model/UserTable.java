package com.example.api.Model;

public class UserTable {
    /**
     * {userId} 用户id 自增主键
     * {userName} 用户名
     * {passWord} 密码
     * {userNike} 昵称
     * {userAvatar} 头像
     * {roleId} 权限id
     */
    private int userId;
    private String userName;
    private String passWord;
    private String userNike;
    private String userAvatar;
    private int roleId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserNike() {
        return userNike;
    }

    public void setUserNike(String userNike) {
        this.userNike = userNike;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "UserTable{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", userNike='" + userNike + '\'' +
                ", userAvatar='" + userAvatar + '\'' +
                ", roleId=" + roleId +
                '}';
    }

}
