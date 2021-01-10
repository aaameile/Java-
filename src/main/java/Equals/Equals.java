package Equals;

import java.util.Objects;

/*
== 和 equals（） 的区别
    ==的使用
        运算符 基本数据类型变量   引用数据类型变量
        基本数据类型 比较两个变量保存的数据是否相等（不一定类型要相同）
        引用数据类型 比较两个变量的地址值是否相同 即两个引用是否指向同一个对象实体

    equals()方法的使用
        是一个方法而非运算符
        只能适用于引用数据类型
        object中比较两个变量的地址值是否相同 即两个引用是否指向同一个对象实体
    
    通常自定义类如果使用equals（）也通常是比较两个对象的 “实体内容” 是否相等 就需要对object类中equals（）进行重写
        String   Data  file  包装类 等都重写了object中的equals（）方法
        就不比较引用地址了
        而是比较两个对象 “实体内容” 是否相同 即比较属性是否相同
        




 */
public class Equals {
    public static void main(String[] args) {
        //基本数据类型比较
        int i = 10;
        int j = 10;
        double k = 10.0;
        System.out.println(i == j);//t
        System.out.println(i == k);//true 向上转型提升为10.0

        boolean a = true;
        //System.out.println(a == i);boolean不可进行数值比较

        char b = 10;
        char B = 65;
        char c = 'A';
        System.out.println(b == i);//t
        System.out.println(c == B);//t

        //引用数据类型比较
        Customer cus = new Customer("Tom",22);
        Customer cus1 = new Customer("Tom",22);
        System.out.println(cus1 == cus);//false 不是同一个对象
        String str = "a";
        String str1 = new String("a");
        String str2 = new String("a");
        System.out.println(str == str1);//f
        System.out.println(str1 == str2);//f

        //equals（）方法比较
        System.out.println(str2.equals(str));//t
        System.out.println(str2.equals(str1));//t

        //f重写equals（）后为t 比较的是 cus 和 cus1 对象的属性值
        System.out.println(cus.equals(cus1));
        //System.out.println("str2.getClass() = " + str2.getClass());





    }
}
class Customer{
    private String name;
    private int age;

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

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Customer() {
    }

    //重写规则 比较两个对象的实体内容是否相等 即2个对象中 name的值 和 age的值 是否相同
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age &&
                Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}