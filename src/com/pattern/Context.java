package com.pattern;

/**
 * 算法的引用，客户端调用它来抉择具体的算法
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void encrypt(){
        this.strategy.encrypt();
    }
}
