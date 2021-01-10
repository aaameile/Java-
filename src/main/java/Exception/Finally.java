package Exception;

import org.junit.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 try-catch-finally
  finally{
                一定要运行的代码
            }
            的使用
finally可选
finally声明的是一定会执行的代码 即使catch中又出现异常  try中有return语句  catch中有return语句

那些必须写入finally的代码
    数据库链接 输入输出流 网络编程Socket等资源
    jvm不能自动回收的需要我们手动进行资源释放
    此时的释放就需要声明在finally中

总结 由于运行时异常比较少见 所以我们就不针对运行异常进行try-catch-finally处理
只针对编译异常
 */
public class Finally {
        @Test
    public void test7() {
            FileInputStream fis = null;
            try {
                File file = new File("Hello.txt");
                fis = new FileInputStream(file);
                int data = fis.read();
                while (data != -1){
                    System.out.println("(char)data = " + (char)data);
                    data = fis.read();
                }
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }finally {
                try {
                    if (fis != null)
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


    }
    @Test
    public void Print(){
        int num = method();
        System.out.println("num = " + num);
    }
    public int method(){
        try {
            int[] arr = new int[12];
            System.out.println("arr[12] = " + arr[12]);
            return 1;

        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return 2;
        }finally {
            System.out.println(" 必定执行 ");
            return 3;
        }

    }

    @Test
    public void test6(){
        try {
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        }catch (ArithmeticException e) {
            //e.printStackTrace();
            int[] arr = new int[10];
            System.out.println("arr[10] = " + arr[10]);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(" hello world ");
        }
    }
}
