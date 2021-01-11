package com.example.api.Dao;

import com.example.api.Model.UserTable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    /**
     * 登陆查询
     * return List<UserTable>
     */
    List<UserTable> loginAction(String userName, String passWord);

    /**
     * 全部用户查询
     * @return
     */
    List<UserTable>getUserList();

    /**
     * 用户注册
     * @param userTable
     * @return
     */
    int registerUser(UserTable userTable);
}
