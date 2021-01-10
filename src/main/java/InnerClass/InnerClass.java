package InnerClass;

/*
类的成员5 内部类
    ·java中允许将一个类A声明在一个类B中 则A就是内部类B为外部类
分类 成员内部类 局部内部类 （方法内 代码块内 构造器内）
    ·成员内部类
        静态 非静态
        ·一方面作为外部类成员
            调用外部类结构
            拥有和属性

        ·另一方面作为类 具有类的所有功能
            类内可以定义属性 方法 构造器

    ·局部内部类
 */
public class InnerClass {

}
class Animal{
    //静态成员内部类
    static class person {
        String name;
        public void sing(){
            System.out.println(" 唱歌 ");
        }
    }
    public void method(){
        //局部内部类
        class Cat{

        }
        //代码块内部类 局部内部类
        {
            class Dog{

            }
        }
    }
    //构造器内部类 局部内部类
    public Animal(){
        class fish{

        }
    }

}