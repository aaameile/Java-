package com.design.singleton;
/*
创建型模式
    工厂方法模式 抽象工厂方法模式 单例模式 创建者模式 原型模式

结构型模式
    适配器模式 装饰器模式 代理模式 外观模式 桥接模式 组合模式 享元模式

行为型模式
    策略模式 模板方法模式 观察者模式 迭代子模式 责任链模式 命令模式 备忘录模式 状态模式 访问者模式 中介者模式 解释器模式

单例模式
    是一种常用的软件设计模式。
    在它的核心结构中只包含一个被称为单例的特殊类。
    通过单例模式可以保证系统中，应用该模式的类一个类只有一个实例。
    即一个类只有一个对象实例
应用场景
    网站计数器
    应用程序日志
    数据库连接池
    项目中读取配置文件的类
    回收站
    任务管理器
    app

 */
//饿汉式单例 一开始就造好对象 导致加载时间过长 生命周期长 线程安全

public class Single {
//    private static Single single = new Single();
//    private Single (){
//
//    }
//
//    public static Single getInstance(){
//        return single;
//    }
//    }
    private Single(){

    }

    public static final Single SINGLE = new Single();


}
