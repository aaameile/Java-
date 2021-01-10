package Interface.java8;
/*
·jdk8
    除了定义全局常量和抽象方法外 还能定义静态方法 默认方法
·静态方法
    接口中的静态方法只能通过接口来调
·默认方法
    默认方法可以被实现类重写
    ·如果实现类继承的父类和实现的接口中声明了同样的方法
    子类在没有重写的此方法的情况下默认调用的是父类中同名同参的方法
    类优先原则
    ·接口冲突 继承了多个接口 而这个接口中定义了同名同参数的默认方法
    那么在实现类没有重写此方法的情况下 报错
    这就需要重写次方法
    ·想要在实现类中调用接口的默认方法 可以 类·super·method


 */
public interface CompareA {
    //静态方法
    public static void method1(){
        System.out.println(" CompareA : 北京");

    }
    //默认方法
    public default void method2(){
        System.out.println(" CompareB ： 上 ");
    }

}
class SubClass implements CompareA{
    //重写接口默认方法
    public void method2(){
        System.out.println(" CompareB ： 上海 ");
    }
}
class Test{
    public static void main(String[] args) {
        SubClass s = new SubClass();
        //实现类的对象可以调用接口中的默认方法
        s.method2();
        //s.method1();无视接口中的静态方法 实现类拿不到 只能用接口调用
        CompareA.method1();
    }
}
