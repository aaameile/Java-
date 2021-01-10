package Instanceof;
/*
instanceof关键字的使用
    判断a对象是否是A类的实例 如果是返回true 否则返回false
    为了避免向下转型出现ClassCastException的异常
    我们在向下转型之前先进行instanceof判断 一旦返回true就向下转型否则不转型
    对于同一个
    对象只能转一次
 */
public class Person {
    protected String name = "person";
    protected  int age = 50;
    public String getInfo(){
        return "name " + name + "\nage " + age ;
    }

}
class Student extends Person{
    protected String school = "pku";

    @Override
    public String getInfo() {
        return "name " + name +  "\nage " + age + "\nschool " + school;
    }
}

class Graduate extends Student{
    public String major = "IT";
    @Override
    public String getInfo() {
        return "name " + name + "\nage " + age + "\nschool " + school + "\nmajor " + major;
    }

}
class Instance{
    public static void main(String[] args) {
        Instance i = new Instance();
        i.method(new Person());
        i.method(new Graduate());
        i.method(new Student());
    }
    public void method(Person e){
        //虚拟方法调用
       String info =  e.getInfo();
       if (e instanceof Graduate){
           System.out.println(info);
       }else if (e instanceof Student){
           System.out.println(info);
       }else {
           System.out.println(info);
       }
    }
}