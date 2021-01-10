package com.design.strategy;
/*

 */
public class Context {
    private IStrategy strategy;
    //定义一个构造函数 调用哪个策略
    public Context(IStrategy strategy){
        this.strategy = strategy;
    }
    //使用策略
    public void operate(){
        strategy.operate();
    }
}







