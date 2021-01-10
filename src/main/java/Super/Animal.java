package Super;
/*
Super关键字
    理解为 父类的
    可以用来调用 属性 方法 构造器
使用
    和this关键字的使用差不多
    可以在子类的方法或者构造器中使用 super.属性、方法  显式的调用父类中声明的属性或方法
    通常情况下省略super

    特殊调用属性
        当子类和父类中定义了同名的属性时
        我们想在子类中调用父类中声明的属性时
        必须是显式的使用super.属性 的方式表明调用的是父类中声明的属性

    调用方法
        当子类重写了父类的方法后
        我们想在子类中调用父类中被重写的方法时
        必须是显式的使用super.方法 的方式表明调用的是父类中被重写的方法

    调用构造器
        可以在子类构造器中显式的使用super（形参） 的方式调用父类中指定形参的构造器
        super（形参）必须声明在子类构造器的首行
        在构造器首行 如果没有显式声明this（形参列表）或super（形参列表）
        则默认调用的是父类中空参构造器super（）
        在类的多个构造器中至少有一个类的构造器中使用了super（形参列表） 调用父类中的构造器
 */
public class Animal {
    String name = "tom";
    int age;


    public Animal(int age,String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public Animal() {
        super();//一般省略
        System.out.println("super();//一般省略");
    }

    public void eat(){
        System.out.println(" 吃饲料 ");
    }
}
