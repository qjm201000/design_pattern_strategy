package com.pattern;

public class Main {
    public static void main(String[] args) {
        Context contextMD5 = new Context(new Md5Strategy());//MD5加密
        contextMD5.encrypt();

        Context contextRSA = new Context(new RsaStrategy());//RSA加密
        contextRSA.encrypt();
    }
}
