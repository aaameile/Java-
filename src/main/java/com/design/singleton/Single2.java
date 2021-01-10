package com.design.singleton;

/*
懒汉式
    需要的时候才创建
        好处
            延迟对象加载
        坏处
            线程不安全
 */
public class Single2 {
    public static void main(String[] args) {
        Order order = Order.getInstance();
        Order order1 = Order.getInstance();
        System.out.println( order1 == order);
    }
}
class Order {
    private static Order instance = null;
    private Order() {
    }
    public  static Order getInstance() {
        //synchronized (Order.class){效率差
        if (instance == null) {
            synchronized (Order.class) {
                if (instance == null) {
                    instance = new Order();
                }
            }
        }
        return instance;
        //}
    }
}