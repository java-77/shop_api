package com.fh.common;

/**
 * @author junjie
 * @create 2021-01-12 17:27
 */
public enum ResultEnum {

    SUCCESS(200,"成功"),
    ERROR(300,"失败"),
    ERROR_PARAM(301,"参数异常"),
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
