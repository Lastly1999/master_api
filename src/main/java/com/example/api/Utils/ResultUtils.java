package com.example.api.Utils;

import javax.xml.transform.Result;

/**
 * 返回数据状态工具类
 */
public class ResultUtils {
    /**
     * 登录成功类
     * @param object 查询到的数据token
     */
    public static ResultData success(Object object){
        // 实例化响应数据封装类
        ResultData resultData = new ResultData();
        resultData.setCode(ResultEnumUtils.LOGIN_SUCCESS.getCode());
        resultData.setMsg(ResultEnumUtils.LOGIN_SUCCESS.getMsg());
        resultData.setData(object);
        return resultData;
    }
    /**
     * 登录失败类
     * @return object 登录失败状态
     */
    public static ResultData error(){
        // 实例化响应数据封装类
        ResultData resultData = new ResultData();
        resultData.setCode(ResultEnumUtils.LOGIN_ERROR.getCode());
        resultData.setMsg(ResultEnumUtils.LOGIN_ERROR.getMsg());
        return resultData;
    }
    /**
     * 查询成功公用带参数
     * @param object 查询到的数据
     */
    public static ResultData PubDataSuccess(Object object){
        // 实例化响应数据封装类
        ResultData resultData = new ResultData();
        resultData.setCode(ResultEnumUtils.PUBLIC_SUCCESS.getCode());
        resultData.setMsg(ResultEnumUtils.PUBLIC_SUCCESS.getMsg());
        resultData.setData(object);
        return resultData;
    }
    /**
     * 查询返回类 带分页参数
     * @param list 数据列表
     * @param limit 分页参数
     * @return object 查询状态数据
     */
    public static ResultDataPage listSuccess(Object list,Object limit){
        // 实例化响应数据封装类
        ResultDataPage resultDataPage = new ResultDataPage();
        resultDataPage.setCode(ResultEnumUtils.SEARCH_SUCCESS.getCode());
        resultDataPage.setMsg(ResultEnumUtils.SEARCH_SUCCESS.getMsg());
        resultDataPage.setData(list);
        resultDataPage.setLimit(limit);
        return  resultDataPage;
    }

    /**
     * 查询返回类 是否存在
     * @return
     */
   public static ResultData yetExist(){
       // 实例化响应数据封装类
       ResultData resultData = new ResultData();
       resultData.setCode(ResultEnumUtils.YETEXIST_ERROR.getCode());
       resultData.setMsg(ResultEnumUtils.YETEXIST_ERROR.getMsg());
       return resultData;
   }
    /**
     * 查询返回类 操作成功 无参
     * @return
     */
    public static ResultData PubSuccess(){
        ResultData resultData = new ResultData();
        resultData.setCode(ResultEnumUtils.PUBLIC_SUCCESS.getCode());
        resultData.setMsg(ResultEnumUtils.PUBLIC_SUCCESS.getMsg());
        return resultData;
    }

    /**
     * 查询返回类 操作失败 无参
     * @return
     */
   public static ResultData PubError(){
       ResultData resultData = new ResultData();
       resultData.setCode(ResultEnumUtils.PUBLIC_ERROR.getCode());
       resultData.setMsg(ResultEnumUtils.PUBLIC_ERROR.getMsg());
       return resultData;
   }

    /**
     * 上传返回类 成功
     * @return
     */
   public static ResultData UploadSuccess(String path){
       ResultData resultData = new ResultData();
       resultData.setCode(ResultEnumUtils.UPLOAD_SUCCESS.getCode());
       resultData.setMsg(ResultEnumUtils.UPLOAD_SUCCESS.getMsg());
       resultData.setData(path);
       return resultData;
   }

    /**
     * 上传返回类 失败
     * @return
     */
   public static ResultData UploadError(String msg){
       ResultData resultData = new ResultData();
       resultData.setCode(ResultEnumUtils.UPLOAD_ERROR.getCode());
       resultData.setMsg(msg);
       return resultData;
   }
}
