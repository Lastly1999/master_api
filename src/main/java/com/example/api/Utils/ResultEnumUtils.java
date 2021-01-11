package com.example.api.Utils;

/**
 * 响应操作枚举类
 * 存放了一些固定的返回类型
 */
public enum ResultEnumUtils {
    LOGIN_SUCCESS(200,"登录成功"),
    LOGIN_ERROR(-200,"登录失败"),
    SEARCH_SUCCESS(200,"查询成功"),
    SEARCH_ERROR(-200,"查询失败"),
    YETEXIST_ERROR(-200,"请求失败,原因记录已经存在"),
    PUBLIC_SUCCESS(200,"操作成功"),
    PUBLIC_ERROR(-200,"操作失败"),
    UPLOAD_SUCCESS(200,"上传成功"),
    UPLOAD_ERROR(-200,"上传失败")
    ;

    private Integer code;
    private String msg;

    /**
     * 构造方法
     * @param code 响应状态码
     * @param msg  响应状态信息
     */
    ResultEnumUtils(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }



}
