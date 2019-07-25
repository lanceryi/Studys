package com.lanceyi.iess.core.wrap;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Lance YI
 * @date 2019/7/24 14:46
 */
@Data
public class WrapResult<T> {
    @ApiModelProperty("状态码")
    private int code;
    @ApiModelProperty("提示信息")
    private String msg;
    @ApiModelProperty("数据")
    private T data;

    public static <T> WrapResult wrapResult(T t, WrapEnum wrapEnum) {
        WrapResult<T> wrapResult = new WrapResult<>();
        wrapResult.setCode(wrapEnum.getCode());
        wrapResult.setMsg(wrapEnum.getMsg());
        wrapResult.setData(t);
        return wrapResult;
    }

    // 成功
    public static <T> WrapResult wrapSuccessResult(T t) {
        return wrapResult(t, WrapEnum.SUCCESS);
    }

    // 失败
    public static <T> WrapResult wrapFailureResult(T t) {
        return wrapResult(t, WrapEnum.FAILURE);
    }

    // 其他异常
    public static <T> WrapResult wrapResult(WrapEnum wrapEnum) {
        return wrapResult(null, wrapEnum);
    }
}
