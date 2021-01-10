package Abstract;

import java.io.File;

/*
abstract 关键字
    修饰 类 方法
类
    此类不能实例化 但仍然提供构造器 便于子类实例化
    开发中一般都会提供抽象类的子类让子类对象实例化 完成相关操作
方法
    包含抽象方法的类一定是抽象类 反之抽象类中可以没有抽象方法
    需要重写父类所有抽象方法 才能实例化对象
    没有重写 意味着子类也是抽象类
注意
    abstract不能修饰属性 构造器
    不能修饰私有方法 静态方法 final方法    因为private修饰的方法子类无法访问    static 修饰的方法重写不叫重写 而是子类独有的方法
    final方法不能被继承
 */
public class Abstract {
    public static void main(String[] args) {
        File file = new File("");
        //Animal a = new Animal();抽象类不能实例化对象


    }
}
abstract class Animal{
    int age;
    String name;
    public Animal(){
    }
    public Animal(int age,String name){

    }


    public void sleep() {

    }

    public static void show(){
        System.out.println(" = " );
    }
    public abstract void eat();//只定义一种功能的标准 具体实现需要子类完成
}
 class Cat extends Animal{
     public static void main(String[] args) {
         Cat c = new Cat();
         c.age = 10;
        show();
     }

    @Override
    public void eat() {

    }
     public void sleep(){

     }

    public static void show(){//static 修饰的方法重写就不叫重写
        System.out.println(" s ");
    }

}