package com.example.api.Utils;

/**
 * 响应数据封装类
 * 带参数
 */
public class ResultData<T> {
    /**
     * 响应数值成员
     * @param code 状态码
     * @param msg 提示
     * @param data 返回数据
     */
    private Integer code;
    private String msg;
    private T data;

    public ResultData(){
        super();
    }
    // 构造方法 初始化封装类的成员变量
    public ResultData(Integer code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultModelUtils{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
