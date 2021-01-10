package Interface;
/*
接口
    ·接口使用interface定义
    ·在java中接口和类是并列的两个结构
    ·接口不能定义构造器 因为接口是特殊的抽象类 意味着接口不能实例化

    ·在java开发中接口都通过类去实现（implements）来使用
        如果实现类覆盖了接口中的所有抽象方法 则此实现类就可以实例化
        如果实现类没有覆盖了接口中的所有抽象方法 则此实现类仍然要为抽象类

    ·java类可以实现多个接口--- 弥补了java单继承的局限性
        class a extends b implements c，d，e，f

    ·接口与接口可以继承 而且可以多继承
    ·接口具体使用 体现多态性
    ·接口实际上看做一种规范

如何定义接口--定义接口中的成员
    ·jdk7及以前
        只能定义全局常量和抽象方法
        全局常量 public static final 修饰的 常量通常大写  修饰符可以省略不写
        抽象方法 public abstract 的
    ·jdk8
        除了定义全局常量和抽象方法外 还能定义静态方法 默认方法


 */
public class Interface {
    //接口中的静态方法
    public static void main(String[] args) {
        System.out.println(Flay.MAX_SPEED);
        Plan p = new Plan();
        p.flay();
    }
}
interface Flay{
    public static final int MAX_SPEED = 7900;//第一宇宙速度
    int MIN_SPEED = 1;//最慢速度
    public abstract void flay();
    void stop();//省略public abstract 意思一样
    //public Flay();接口不能定义构造器 意味着接口不能实例化
}

interface Attack{
    void attack();
}
//飞机实现飞接口
class Plan implements Flay{

    @Override
    public void flay() {
        System.out.println(" 飞机通过引擎起飞 ");
    }

    @Override
    public void stop() {
        System.out.println(" 驾驶员减速 ");
    }
}
//子弹实现flay attack接口
class Bullet extends Object implements Flay,Attack{

    @Override
    public void flay() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }
}
//接口继承接口
interface A{}
interface B{}
interface C extends B,A{}
