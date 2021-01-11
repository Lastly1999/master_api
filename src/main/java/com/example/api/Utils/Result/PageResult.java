package com.example.api.Utils.Result;

import java.util.List;

public class PageResult<T> {

    /**
     * 分页参数封装类
     * {PageCurrent} 当前页
     * {PageSize} 每页数量
     * {PageTotal} 总页数
     * {total} 数据总记录数
     * {list} 数据组
     */
    private String keywords;
    private int PageCurrent;
    private int PageSize;
    private int PageTotal;
    private int total;
    private List<T> list;
     
    public int getPageCurrent() {
        return PageCurrent;
    }

    public void setPageCurrent(int pageCurrent) {
        PageCurrent = pageCurrent;
    }

    public int getPageSize() {
        return PageSize;
    }

    public void setPageSize(int pageSize) {
        PageSize = pageSize;
    }

    public int getPageTotal() {
        return PageTotal;
    }

    public void setPageTotal(int pageTotal) { PageTotal = pageTotal; }

    public int getTotal() { return total;}

    public void setTotal(int total) {
        this.total = total;
    }

    public String getKeywords() { return keywords;}

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "keywords='" + keywords + '\'' +
                ", PageCurrent=" + PageCurrent +
                ", PageSize=" + PageSize +
                ", PageTotal=" + PageTotal +
                ", total=" + total +
                ", list=" + list +
                '}';
    }

}
