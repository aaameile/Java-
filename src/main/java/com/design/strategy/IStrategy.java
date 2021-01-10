package com.design.strategy;
/*
策略模式
    体现了高内聚 低耦合
    缺点必须要跟调用者定义好策略关系 策略调用名称
    ocp原则
 */
public interface IStrategy {
    public void operate();
}
