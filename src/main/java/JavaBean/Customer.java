package JavaBean;
/*
javabean
    由java语言写成的可重用组件  对应数据库中表  表就是class  表里字段就是 class里属性
    类是公共的
    有一个无参公共构造器
    有属性且有对应的get set方法
 */
public class Customer {
    private String name;
    private int age;

    public Customer() {
    }

    public String getName() {
        return name;
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
