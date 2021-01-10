package Extends;
/*
继承
    减少代码yonyu提高代码复用性
    便于功能扩展
    为多态提供了前提
格式
    class a extends b{}
    a 子 类 派生类 subclass
    b 父类 超类 基类 superclass
    a 继承 父类 b 后 a 就获取了父类 b 中声明的所有结构 属性 方法
    特别的父类中声明为private的属性或方法子类继承父类仍然认为获取了父类中私有的结构
    只因为封装性的影响 使得子类不能直接调用父类的结构而已

    子类继承父类后还可以声明自己的方法实现功能的扩展
规定
   一个类可以被多个子类继承
   一个类只能有一个父类 单继承性
   子父类是相对的概念
   子类直接继承的父类称为直接父类 间接继承的父类称为间接父类
   子类继承父类后就获取了直接父类以及所有间接父类中声明的属性和方法  多重继承

object
    java.lang.object除外所有类都直接或间接继承与java.lang.object类 即具有java.lang.object类声明的功能
 */
public class Cat extends blackCat{
     String name;
     private int age;
     Cat cat;
     public void eat(){
         System.out.println(" 吃鱼 ");
     }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.r(cat));
    }

}
