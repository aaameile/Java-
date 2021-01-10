package ToStrign;

import java.util.Date;

/*
object类中toString
    当我们输出一个对象的引用时实际上就是调用当前对象的toString（）
    object 中 toString的定义 通过哈希code值计算出来的在堆空间的存储位置并且把他转换成16进制
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }

    String data file 包装类都重写了object类中toString方法
    使得再返回对象的toString时 返回实体内容信息

    自定义类也可以重写toString方法 返回实体内容信息


 */
public class ToString {
    public static void main(String[] args) {
        User user = new User("tom",32);

        System.out.println("user = " + user.toString()); //ToStrign.User@4554617c
        System.out.println("user = " + user);//ToStrign.User@4554617c

        String str = new String("ssas");
        System.out.println("str = " + str);

        Date date = new Date(231232132L);
        System.out.println("date = " + date);

    }
}
class User{
    String name;
    int age;
    //重写toString使得返回实体内容信息
//    @Override
//    public String toString() {
//        return "User[name = " + name + ",age = " + age + "]";
//    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}