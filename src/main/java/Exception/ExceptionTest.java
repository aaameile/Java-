package Exception;

import org.junit.Test;

import java.util.Date;
import java.util.Scanner;

/*
异常
    系统自动生成的异常
    手动生成的异常
 */
public class ExceptionTest {
    //nullpointerexception空指针异常
    @Test
    public void test1(){
        String str = "sd";
        str = null;
        System.out.println("str.charAt(0) = " + str.charAt(0));

    }

    //ArrayIndexOutOfBoundException角标越界StringIndexOutOfBoundException角标越界
    @Test
    public void test2(){
        int[] arr = new int[3];
        System.out.println("arr[3] = " + arr[3]);
        String str = "sd";
        System.out.println("str.charAt(0) = " + str.charAt(2));
    }

    //ClassCastExceptionException转换异常
    @Test
    public void test3(){
        Object o = new Date();
        String str = (String) o;
    }

    //NumberFormatException 转换异常
    @Test
    public void test4(){
        String str = "123";
        str = "abc";
        int num = Integer.parseInt(str);
    }

    //InputMismatchException 输入不匹配异常
    @Test
    public void test5(){
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();
        System.out.println("score = " + score);
        s.close();
    }

    //ArithmeticException 算数异常
    @Test
    public void test6(){
        int a = 10;
        int b = 0;
        System.out.println(a/b);
    }

    //编译异常
//    @Test
//    public void test7() throws{
//        File file = new File("sds");
//        FileInputStream fis = new FileInputStream(file);
//        int data = fis.read();
//        while (data != -1){
//            System.out.println("(char)data = " + (char)data);
//            data = fis.read();
//        }
//        fis.close();
//
//    }
    //手动生成异常
    private  int id;

    public void  regist(int id) throws Exception {
        if (id > 0){
            this.id = id;

        }else {
           // System.out.println(" 输入数据非法 ");
            throw new  Exception("输入数据非法");
        }

    }

    public static void main(String[] args) {
            try {
                ExceptionTest e = new ExceptionTest();
                e.regist(-1001);
                //System.out.println("e = " + e);
            }catch (Exception e){
                System.out.println("e.getMessage() = " + e.getMessage());
            }
        }

    
}
