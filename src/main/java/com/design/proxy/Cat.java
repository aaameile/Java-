package com.design.proxy;
/*
不喜欢猫 喜欢狗 但是作为动物 可以骗
 */
public class Cat implements Animal{
    private Animal animal;
    //静态代理
    public Cat(){
        this.animal = new Dog();
    }
    //动态代理
    public Cat(Animal animal){
        this.animal = animal;
    }
    @Override
    public void hsq() {
        this.animal.hsq();
    }

    @Override
    public void dm() {
        this.animal.dm();
    }
}
