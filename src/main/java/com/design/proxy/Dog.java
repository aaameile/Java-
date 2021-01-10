package com.design.proxy;

public class Dog implements Animal{
    @Override
    public void hsq() {
        System.out.println("阿拉斯加雪橇犬");
    }

    @Override
    public void dm() {
        System.out.println("德牧");
    }
}
