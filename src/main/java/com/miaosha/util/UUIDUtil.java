package com.miaosha.util;

import java.util.UUID;
/*
* uuid工具类
* */
public class UUIDUtil {
    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
