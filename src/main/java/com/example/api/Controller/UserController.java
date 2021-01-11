package com.example.api.Controller;

import com.example.api.Model.UserTable;

import com.example.api.Service.UserService;
import com.example.api.Utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;

@RestController
public class UserController {

    // 自动装配Service层
    @Autowired
    UserService userService;

    /**
     * 用户登录
     * @Method Post
     * @param userTable
     * @return result 响应状态
     */

    @PostMapping("/loginAction")
    public ResultData loginAction(@RequestBody UserTable userTable){
        // 获取前端参数 用户名
        String userName = userTable.getUserName();
        // 密码
        String passWord = userTable.getPassWord();
        System.out.println(userTable.toString());
        // 调用Service层 逻辑判断
        ResultData resultData = userService.loginAction(userName,passWord);
        System.out.println("/loginAction -- " +resultData.toString());
        return resultData;
    }

    /**
     * 全部用户列表查询
     * @param userTable
     * @return
     */
    @PostMapping("/getUserList")
    public ResultData getUserList(@RequestBody UserTable userTable){
        // 调用Service层
        ResultData resultData = userService.getUserList();
        return resultData;
    }

    /**
     * 用户注册
     * @param userTable
     * @return
     */
    @PostMapping("/registerUser")
    public ResultData registerUser(@RequestBody UserTable userTable){
        // 调用Service层
        ResultData resultData = userService.registerUser(userTable);
        return resultData;
    }
}
