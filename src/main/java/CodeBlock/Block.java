package CodeBlock;
/*
类的属性之代码块  （初始化块）
    作用
        初始化类 对象
        可以在创建对象时对对象进行初始化

如果有修饰的话只能用static
如果有多个代码块会按照代码顺序先后执行 静态先执行

分类
    静态代码块
        内部有输出语句
        静态代码块随着类的加载执行、且只执行一次
        可以调用静态结构
    非静态代码块
        内部有输出语句
        非静态代码块随着对象的创建执行、每创建一个对象就执行一次
        可调用静态 非静态结构

 */
public class Block {
    public static void main(String[] args) {
        String desc = User.desc;//静态代码块随着类的加载执行
        User.show();//且只执行一次
        User u = new User();//非静态代码块随着对象的创建执行
        User u1 = new User();//每创建一个对象就执行一次
        System.out.println("u.age = " + u.age);
        System.out.println("u1.age = " + u1.age);

    }
}
class User{
    String name;
    int age;
    static String desc;

    User(){
    }

    User(String name,int age){
        this.name = name;
        this.age = age;
    }

    //代码块
    {
        age = 1;
        System.out.println(" hello ");
    }
    //静态代码块
    static {
        desc = "爱学习的人";
        System.out.println(" hello static ");
    }

    public void eat(){
        System.out.println(" 吃饭 ");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static void show(){
        System.out.println("desc = " + desc);

    }
}
