package com.miaosha.redis;
/*
* key前缀设定
* */
public interface KeyPrefix {

    public int expireSeconds();

    public String getPrefix();
}
