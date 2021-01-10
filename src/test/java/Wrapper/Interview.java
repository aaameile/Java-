package Wrapper;

import org.junit.Test;

/*
关于包装类的面试题
    Integer 内部定义了静态内部类IntegerCache 将属性都加载到内存中了
    IntegerCache 中定义了Integer[]
    保存了从-128~127范围的整数
    如果我们使用自动装箱的方式给Integer赋值的范围在这里面
    可以直接使用数组中的元素，不会再去new 已经提前造好了  目的 提高效率
    超过就会重新new一个构造器赋值

 */
public class Interview {
    @Test
    public void test1(){
        //三元运算符要求返回值类型都是同一类型 类型不同就会自动提升  编译要求类型必须一致
        Object o = true ? new Integer(1) : new Double(2.0);
        System.out.println("o = ");
        System.out.println(o.getClass());
    }
    @Test
    public void test2(){
        Object o;
        if (true)
            o = new Integer(1);
        else
            o = new Double(2.0);
        System.out.println("o = " + o);
    }

    //除了char型数组直接输出内容 其他数组输出都是地址
    @Test
    public void  test3(){
        char [] arr = new char[]{'a','b','c'};
        System.out.println(arr);
        System.out.println(arr[1]);
        int[] arr1 = new int[]{12,3};
        System.out.println(arr1[0]);

        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(j == i);//false

        //integer数组中的数 所以比较得是数组的地址
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//true

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//false
    }
}
