package Junit;
/*
单元测试
    此类是public 此类提供公共无参构造器

    声明单元测试 @Test
        此时的单元测试方法 方法权限是public 没有返回值 没有形参


 */
import org.junit.Test;

public class Junit {
    int nub = 10;
@Test
public void eat(){
    System.out.println("nub = " + nub);
}
@Test
public void show(){
    nub = 200;
    eat();
}

}
