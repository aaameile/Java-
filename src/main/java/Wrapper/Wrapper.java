package Wrapper;

import org.junit.Test;

/*
包装类
    java提供了8种基本数据类型的包装类使得基本数据类型的变量具有类的特性；
    byte    short    int       long     float    double    boolean    char 基本数据类型
    Byte    Short    Integer   Long     Float    Double    Boolean    Character 包装类

基本数据类 String 包装类的转换 装箱 拆箱

        
 */
public class Wrapper {
    //基本数据类型 ----包装类  调用包装类的构造器
    @Test
    public void test1(){
        int num1 = 21;
        //System.out.println("num1.toString() = " + num1.toString());
        Integer int1 = new Integer(num1);
        System.out.println(int1);
        
        System.out.println(Integer.toString(num1));
        
        float f = new Float("12.3F");
        System.out.println(f);
        System.out.println(Float.parseFloat("12.3F"));

        Boolean b = new Boolean("true213");
        boolean v = Boolean.parseBoolean("3123");
        boolean c = Boolean.parseBoolean(String.valueOf("er"));
        Boolean a = new Boolean(true);
        System.out.println(a);
        System.out.println(b);
        System.out.println(v);
        System.out.println(c);

        Order order = new Order();
        System.out.println(order.isMale);
        System.out.println(order.isFemale);//注意



    }
    //包装类 ---- 基本数据类型 调用包装类XXX.xxxValue
    @Test
    public void test2(){
       Integer int1 = new Integer(2);
        System.out.println("int1 = " + int1.toString());
        int i1 = int1.intValue();
        System.out.println("i1 = " + (i1 + 1));
        Float f = 13.0f;
        int f1 = f.intValue();
        System.out.println("f1 = " + f1);
        
    }
    @Test
    public void test3(){
        //jdk8加入新特性自动装箱拆箱
        int num = 10;
        Integer i = num;
        int i2 = i;//自动拆箱

        boolean b = true;
        Boolean B1 = b;//自动装箱
        method(num);


    }
    public void method(java.lang.Object o){
        System.out.println("num = " + o);
    }

    //基本数据类型.包装类-----String类型  调用String重载的valueOf（xxx ，xx）
    @Test
    public void test4(){
        int i = 10;
        String str = i + "";
        System.out.println("str = " + str);

        //方法2
        float f = 13.0f;
        String str1 = String.valueOf(f);
        System.out.println("str1 = " + str1);

    }

    //String类型-----包装类型.基本类型  调用包装类xxx.parseXxx(xxx)
    @Test
    public void test5(){
        String str = "123";//java.lang.NumberFormatException: For input string: "123a"
        //Integer i = (Integer) str; 需要是子父类关系才可以强转
        int i = Integer.parseInt(str);
        String str1 = "true12";
        String str2 = "TrUe";
        boolean b = Boolean.parseBoolean(str1);
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println("b = " + b);
        System.out.println("b1 = " + b1);

    }
}
class Order{
    boolean isMale;
    Boolean isFemale;

}