package com.pattern;

/**
 * MD5加密
 */
public class Md5Strategy implements Strategy{
    @Override
    public void encrypt() {
        System.out.println("进行MD5加密");
    }
}
