package mian.xiang.dui.xiang;
/*
封装
    当创建完对象后 对对象属性赋值 赋值操作受到属性的数据类型和存储范围的制约
    但是除此之外在实际问题中我们需要给属性赋值加额外的限制条件
    这个条件不能在属性声明时体现 我们只能通过方法进行限制条件的添加比如（setAge()）
    同时避免用户在使用对象.属性的方式赋值则需要将属性声明为私有的
    此时针对于属性就是封装起来的
体现
    将类的属性私有化 同时提供 get set方法对它进行操作
    不对外暴露的私有方法
    需要权限修饰符
权限修饰符
    private
    default（默认缺省就是什么也不写）
    protected
    public
        修饰类以及类的内部结构
        都可修饰类的内部结构 方法 属性 构造器 内部类
        类只可以用public 缺省


 */
public class Encapsulation {

    public static void main(String[] args) {
        Animal animal = new Animal();
        //animal.age = 2;
        //animal.age = -1;封装后不能直接调用 'age' has private access in 'mian.xiang.dui.xiang.Animal'
        animal.name = "狗";
        animal.eat();
        animal.Show();
        animal.setAge(4);
        animal.Show();

    }

}
class Animal {
    String name;
    private int age;//属性封装
    //对属性的设置
    public void setAge(int a){
        if (a > 0){
            age = a;
        }else {
            age = 0;
        }
    }
    //对属性的获取
    public int getAge(){
        return age;
    }
    public void eat(){
        System.out.println(" 吃 ");

    }
    public void Show(){
        System.out.println("name  " + name + "age  " + age );
    }

}
