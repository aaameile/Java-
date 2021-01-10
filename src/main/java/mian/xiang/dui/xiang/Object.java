package mian.xiang.dui.xiang;
/*
1.java类以及类的成员 ： 属性，方法，构造物，代码块，内部类
2.面向对象三大特性 ： 封装 继承 多态 （抽象）
3.其他关键字 ： this super static final abstract interface packaeg import 等

面向对象
    类 ： 对一类事物的描述 抽象的
    对象 ： 实际存在的事物 实例 instance
 重点是类的设计 就是设计类的成员
    属性 = 成员变量 = field = 字段,域
    方法 = 成员方法 = 函数 = method


 */

public class Object {
    public static void main(String[] args) {
        //实例化创建对象
        person person = new person();
        //调用属性 赋值
        person.name = "tom";
        person.age = 12;
        person.man = true;
        //调用方法
        person.eat();
        person.sleep();
    }


}
class person {
    //属性
    String name;
    int age;
    boolean man;

    //方法
    public void eat(){
        System.out.println(" chi " );
    }
    public  void sleep(){
        System.out.println(" 睡 ");
    }











}
