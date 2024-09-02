package com.itheima.pojo.model;
/**
 * MessageModel类用于封装服务器返回给客户端的消息。
 * 包含状态码、提示信息和回显对象。
 */
public class MessageModel {
    //状态码：1.成功  0.失败
    private Integer code = 1;
    //提示信息
    private String msg = "成功";
    //回显对象
    private Object Object;

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

    public java.lang.Object getObject() {
        return Object;
    }

    public void setObject(java.lang.Object object) {
        Object = object;
    }
}
