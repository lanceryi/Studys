package com.lanceyi.webapi.core.constant;

/**
 * @author Lance YI
 * @date 2019/7/25 14:19
 */
public class Path {
    /**
     * web api prefix
     */
    public static final String PREFIX = "/api";

    /**
     * test
     */
    public static class Test {
        public static final String BASE = PREFIX + "/test";
        public static final String LIST = "/list";
        public static final String ADMIN = "/admin";
        public static final String ADMIN_LIST = "/list";
    }
}
