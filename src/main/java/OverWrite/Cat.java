package OverWrite;

public class Cat extends User {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
    }
    public void eat(){ System.out.println(" 吃鱼和饭 "); }//不叫重写了因为父权限修饰符为private
    protected void speak(){ }
    //protected void walk(){}权限修饰符必须比大于等于父类
    String sleep(){
        return null;
    }
    //int info(){return 2.0;}父类被重写的方法返回值为基本数据类型（double）  子类重写方法返回值类型必须是相同类型的基本数据类型 （double）
}
