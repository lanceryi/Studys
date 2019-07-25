package com.lanceyi.iess.core.expection;

import com.lanceyi.iess.core.wrap.WrapEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BizException extends Exception {

    private Logger log = LoggerFactory.getLogger(BizException.class);
    private Integer key;
    private String msg;
    private Object data;

    public BizException() {
    }

    public BizException(WrapEnum baseEnum) {
        this.key = baseEnum.getCode();
        this.msg = baseEnum.getMsg();
    }

    public BizException(WrapEnum baseEnum, String logStr, Object... logData) {
        this.key = baseEnum.getCode();
        this.msg = baseEnum.getMsg();
        this.log.error(logStr, logData);
    }

    public BizException(WrapEnum baseEnum, Object data) {
        this.key = baseEnum.getCode();
        this.msg = baseEnum.getMsg();
        this.data = data;
    }

    public BizException(Integer key, String msg) {
        this.key = key;
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getKey() {
        return this.key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}