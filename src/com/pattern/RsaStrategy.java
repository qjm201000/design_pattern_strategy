package com.pattern;

/**
 * RSA加密
 */
public class RsaStrategy implements Strategy{
    @Override
    public void encrypt() {
        System.out.println("进行RSA加密");
    }
}
