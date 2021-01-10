package Static;

/*
当我们编写一个类时 其实就是在描述其对象的属性和行为，而没有产生实质上的对象，只有通过new关键字才会产生对象
这时系统才会分配内存空间给对象其方法才可以供外部调用
我们有时希望无论是否产生了对象或无论产生了多少对象的情况下某些特定的数据在内存空间只有一份
例如所有中国人都有一个国家名称，每一个中国人都共享这个国家名 不必在每一个中国人的实例对象中都单独分配一个拥有代表国家名称的变量；

Static 静态的 修饰符    System.out

修饰 属性 方法 代码块 内部类
    修饰属性 静态变量
        属性 按是否使用static修饰 又分为 静态属性 非静态属性  （实例变量）类变量
            实例变量
                我们创建了类的多个对象 每个对象都独立拥有一套类的非静态属性
                修改属性时不会导致其他对象中同样的属性值的修改
            静态变量
                我们创建了类的多个对象 多个对象共享一个静态变量
                当通过某个对象修改静态变量时
                会导致其他对象调用此静态变量是修改后的静态变量 （类似于微信群的名字任何成员都可以修改）
        其他说明
            静态变量随着类的加载而加载
            静态变量的加载要早于对象的创建
            由于类只会加载一次 则静态变量在内存中也只会寻找一份 存在方法区的静态域中

    修饰方法 静态方法
        随着类的加载而加载 可以通过类.静态方法的方式调用
        在Static生命周期里 静态方法中只能调用静态方法或属性 反之非静态方法里都能调用

    注意点
        在静态方法内不能用this super 关键字
        关于静态属性和静态方法 与他的生命周期有关

    在开发中如何确定一个属性或方法是否要声明为静态的
        属性
            属性是可以被多个对象所共享的 不会随着对象改变而改变
        方法
            操作静态属性的方法通常设置为静态
            工具类中的方法习惯上声明为Static
 */
public class Static {
    public static void main(String[] args) {
        Chinese.nation = "中国";//静态属性操作
        Chinese c = new Chinese();
        System.out.println(Chinese.nation);
        c.nation = "CHIN";
        System.out.println("c.nation = " + c.nation);
        Chinese.eat();//静态方法调用
        int [] Student = new int[]{2,42,3,4,32,5,44,23,54,23,66,64,26,23,675,23,6};
        Chinese.bubbleSort(Student);

        
        
    }
}
class Chinese{
    int age;
    String name;
    static String nation;
    public static void eat(){
        System.out.println("nation = " + nation);
    }

    //遍历
    public static void Print(int[] stu){
        for (int i: stu){
            System.out.println("stu = " + i);
            //System.out.println(i.info());
        }
        System.out.println();
    }
    //查找
    public static void Query(int[] stu,int state){
        for (int s : stu) {
            if (stu[state] == state) {
                System.out.println("s = " + s);
                //System.out.println(s.info());
            }
        }
        System.out.println();
    }
    //冒泡排序
    public static void bubbleSort(int[] stu){
        for (int i = 0;i < stu.length - 1;i++){
            for (int j = 0;j < stu.length - 1 -i;j++){
                if (stu[j] > stu[j + 1]){
                    //对象数组交换的是对象
                    int temp = stu[j];
                    stu[j] = stu[j + 1];
                    stu[j + 1] = temp;
                }
            }
        }
        for (int s : stu){
            System.out.println(s);
        }
    }
}
