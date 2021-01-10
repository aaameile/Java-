package mian.xiang.dui.xiang;
/*
构造方法--构造器
作用
    创建对象
    初始化对象属性
说明
    如果没有显式的定义类的构造器的话则系统默认提供一个空参的构造器
    定义构造器的格式： 权限修饰符 类名 (形参列表){}
    一旦显式定义了类的构造器后系统就不在提供默认的构造器了
    一个类中至少有一个构造器
 */
public class Constructor {
    public static void main(String[] args) {
        //创建类的对象
//        Car c = new Car();//Car（）就是构造器
//        Car c1 = new Car("tom");
//        System.out.println("c1.name = " + c1.name);
        BIGCar big = new BIGCar("aaa");
        Car car = new BIGCar("2");


    }
}
class Car {
    //属性
    String name;
    int age;
    //构造器与类同名
    public Car(){
        age = 18;
        System.out.println(" Car（） ");

    }

    public Car(String n){
        name = n;
    }
    public Car(String n,int a){
        name = n;
        age = a;
    }

    //方法
    public void Run(){
        System.out.println(" 跑 ");
    }

}
class BIGCar extends Car{
   BIGCar(){
       System.out.println(" da ");
   }
   BIGCar(String name){
       this.name = name;
       System.out.println(" da da  ");
   }
        }