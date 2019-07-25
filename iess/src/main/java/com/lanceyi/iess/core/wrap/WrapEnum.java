package com.lanceyi.iess.core.wrap;

/**
 * @author Lance YI
 * @date 2019/7/24 9:50
 */
public enum WrapEnum {
    //成功
    SUCCESS(0, "操作成功"),
    USER_EXIST(100, "用户存在"),
    USER_NOTEXIST(101, "用户不存在"),

    // 失败
    FAILURE(-1,"操作失败"),
    ;
    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    WrapEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
