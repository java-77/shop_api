package com.fh.common;

/**
 * @author junjie
 * @create 2021-01-05 20:21
 */
public class ResultData {

    private  Integer code;
    private String message;
    private Object data;

    private ResultData(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private ResultData(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /*  提供一个公共的访问方法     返回此成功对象  */
    public static ResultData getResult(ResultEnum resultEnum){
        return new ResultData(resultEnum.getCode(),resultEnum.getMsg());
    }

    public static ResultData getResult(ResultEnum resultEnum,Object object){
        return new ResultData(resultEnum.getCode(),resultEnum.getMsg(),object);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
