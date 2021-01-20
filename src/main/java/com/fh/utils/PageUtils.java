package com.fh.utils;

import org.springframework.data.relational.core.sql.In;

/**
 * @author junjie
 * @create 2021-01-18 16:06
 */
public class PageUtils {

    private Integer page;//当前页
    private Integer size;//每页条数
    private Integer startIndex;//起始下标
    private Long count;//总条数
    private Object data;//返回数据

    //计算起始下标
    public void calStartIndex(){
        this.startIndex=(this.page-1)*this.size;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
