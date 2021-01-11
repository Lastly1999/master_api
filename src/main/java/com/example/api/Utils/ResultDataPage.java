package com.example.api.Utils;

public class ResultDataPage<T,V> {

    /**
     * 带参数data和limit响应封装类
     * {code} 状态码
     * {msg} 提示信息
     * {data} 查询到的数据
     * {limit} 分页参数
     */
    private Integer code;
    private String msg;
    private T data;
    private V limit;

    public ResultDataPage(){
        super();
    }

    // 构造方法 初始化封装类的成员变量
    public ResultDataPage(Integer code, String msg, T data,V limit){
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.limit = limit;
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

    public V getLimit() {
        return limit;
    }

    public void setLimit(V limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "ResultDataPage{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", limit=" + limit +
                '}';
    }

}
