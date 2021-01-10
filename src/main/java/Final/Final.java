package Final;

/*
final关键字 最终的
    修饰 类  方法  变量
类
    class person extends Animal{ }  修饰类的时候该不能被其他类继承
    例如 String System StringBuffer 其中该有的功能都有了 不需要继承再扩展了
方法 最终的方法
    修饰方法表面方法不能被重写
    比如 Object 中 getClass（）
变量
    被final修饰的变量为常量不能再赋值操作
    可以赋值的位置
        显示初始化
        代码块初始化构造器中初始化
        构造器
static final修饰
    属性 -- 全局常量

 */
public class Final {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal a1 = new Animal("23",12);
        //a.age = 3;被final修饰的变量不可改变值
        System.out.println("a.SEX = " + a.SEX);
        System.out.println("a1.SEX = " + a1.SEX);
    }
}
final class Animal{
    final int AGE;
    final String SEX;
    final int ID;
    {
        AGE = 2;
    }
    Animal (){
        //AGE = 3;除初始化赋值 赋值只能操作一次
        SEX = "男";
        ID = 2;
    }
    Animal(String sex, int id){

        SEX = sex;
        ID = id;
    }


        }
//class person extends Animal{ }    不能被其他类继承
class person{
    public final void speak(){

    }
}
class cat extends person{
    //public void speak(){ }
        }


