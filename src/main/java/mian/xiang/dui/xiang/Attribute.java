package mian.xiang.dui.xiang;
/*
类中属性的使用
    描述类中对象的特点
    属性（成员变量）  vs  （局部变量）
        1.相同点：
            格式 数据类型 变量名 = 变量值
            先声明后使用
            变量都有其对应的作用域

        2.不同点：
            在类中声明的位置不同
                属性直接定义在类的一对{}内
                局部变量 声明在方法内，方法形参，代码块内，构造器形参，构造器内部的变量

            关于权限修饰的不同
                属性可以在声明属性时指明其权限使用权限修饰符
                常用的权限修饰符 private public protected  缺醒（未加修饰词的 默认）
                局部变量 不可以使用修饰符 因为在方法中有了

            默认初始化不同
                属性 类的属性根据其类型都有默认初始化值
                    整型（byte short int long ）0
                    浮点型（float double ）0.0
                    字符型（char ）0 或者 空格
                    布尔型（boolean）false
                    引用数据类型（类 数组 接口） null
                局部变量 没有初始化值
                    意味着调用局部变量前一定要赋值
                    形参在调用时赋值

            在内存中加载的位置不同
                属性：加载到堆空间中
                局部变量：加载到栈空间

 */
public class Attribute {
    public static void main(String[] args) {
        User user = new User();
        System.out.println("user = " + user.age);
        user.talk("中文" );//形参 调用时赋值
        user.eat();

    }


}
class User{
    //成员变量
    private String name;//private 私有修饰符
    public int age;

    public void talk(String language){//形参：language 在小括号内 局部变量
        System.out.println("中国人说" + language);
    }
    public void eat(){
        String food = "包子";//局部变量 调用前赋值
        System.out.println("龙的传人喜欢吃"+ food);

    }















}

