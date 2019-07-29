package com.lanceyi.webapi.core.exception;

import java.io.Serializable;

/**
 * @author Lance YI
 * @Desc 业务类异常
 * @date 2019/7/25 18:18
 */
public class ServiceException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 1213855733833039552L;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message,cause);
    }


}
