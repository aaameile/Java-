package This;
/*
this关键字的使用
    修饰属性 方法 构造器

this修饰属性和方法（构造器）
    THIS 理解为当前对象
    this.调用属性 方法 通常省略
    如果方法形参和属性重名必须显示使用this.变量的方式 表明此变量是属性 而不是形参 因为重名会讲究就近原则 java标识符命名需要见名知意
this调用构造器
    在类的构造器中可以显式的使用  this.（形参）  方式调用本类中指定的其他构造器
    构造器中不能通过this调用自己 也不能互相调用 也不能调 2 个
    必须放在首行

 */

public class User {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(1);
        System.out.println("p.getAge() = " + p.getAge());
        Person p2 = new Person("tom",23);
        System.out.println(p2.getAge() + p2.getName());
    }
}
class Person{
    private String name;
    private int age;

    public Person() {
    }
    public Person(String name){
        this.name = name;
    }
    //this调用构造器 当初始化person时需要考虑种种因素为避免代码yongyu
    public Person(String name, int age) {
        this(name);//调用带参构造器person(String name)
        //this.name = name; == 使用this（name）
        this.age = age;
        String info = "this调用构造器 当初始化person时需要考虑种种因素为避免代码yongyu";
        System.out.println("info = " + info);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
