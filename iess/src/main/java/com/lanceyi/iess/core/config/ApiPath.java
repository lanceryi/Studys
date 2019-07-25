package com.lanceyi.iess.core.config;

/**
 * @author Lance YI
 * @date 2019/7/24 9:55
 */
public class ApiPath {

    public static final String PREFIX = "/api";

    /**
     * 用户相关api
     */
    public static class User {
        public static final String BASE = PREFIX + "/user";
        public static final String TEST = "/test";
        public static final String LOGIN = "/login";
    }
}
