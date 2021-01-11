package com.example.api.Service;

import com.example.api.Dao.UserDao;
import com.example.api.Model.UserTable;
import com.example.api.Utils.ResultData;
import com.example.api.Utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.transform.Result;
import java.util.List;


@Service
public class UserService {

    /*
     * Service层介于controller和dao之间作为服务层进行一些逻辑处理，
     */
    @Autowired
    UserDao userDao;

    /**
     * 用户登录
     * @param userName 用户名
     * @param passWord 密码
     * @return 状态结果集
     */
    public ResultData loginAction(String userName, String passWord) {
        // 调用Dao的方法
        List<UserTable> list = userDao.loginAction(userName,passWord);
        // 不存在数据返回error
        if(null == list || list.size() == 0 ){
            return ResultUtils.error();
        }else{
            return ResultUtils.success(list);
        }
    }

    /**
     * 获取全部用户列表
     * @return
     */
    public ResultData getUserList(){
        List<UserTable> list  = userDao.getUserList();
        if(null == list || list.size() == 0){
            return ResultUtils.PubError();
        }else{
            return ResultUtils.PubDataSuccess(list);
        }
    }

    /**
     * 用户注册
     * @param userTable
     * @return
     */
    public ResultData registerUser(UserTable userTable){
        int total = userDao.registerUser(userTable);
        if(total > 0){
            return ResultUtils.PubSuccess();
        }else{
            return ResultUtils.PubError();
        }
    }
}
