package Exception;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
异常处理 抓抛模型
    抛
        程序正常执行的过程中，一旦出现异常就会在代码处生成一个对应异常的对象
        并将此对象抛出
        一旦抛出后其后代码就不在执行
    抓 异常处理方法 try-catch-finally throws

        try-catch-finally
            try{
                可能出现异常的代码
            }catch（异常类型 变量名）{
                处理方法1
            }catch（异常类型 变量名）{
                处理方法2
            }catch（异常类型 变量名）{
                处理方法3
            }
            使用try将可能出现的异常代码包装起来，在执行过程中一旦出现异常就会生成一个对应异常类的对象
            根据此对象的类型去catch中进行匹配
            一但try中的异常对象匹配到某一个catch时就进入catch中进行异常处理
            一旦处理完成就跳出当前try-catch结构（在没有写finally的情况）
            继续执行后面代码
            catch中的异常类型如果没有子父类关系 则谁声明在上谁声明在下没有关系
            catch中的异常类型如果包含子父类关系 则子类一定声明在父类的上面 否则报错

            finally{
                一定会运行的代码
            }

常用异常处理方法 String e.getMessage()   e.printStackTrace();
在try中声明的变量出了try就不能用 需要在外面声明并赋值

使用try-catch-finally处理编译异常时 编译时就不报错 但是运行还是会报错
相当于延后到运行时

            finally{
                一定会执行的代码
            }
        throws


 */
public class TryCatch {
    @Test
    public void test1(){
        String str = "sd";
        str = null;
        try {
            System.out.println("str.charAt(0) = " + str.charAt(0));
            System.out.println(" 11111111111 ");
        }catch (NullPointerException e){
            System.out.println("e.getMessage() = " + e.getMessage());
            e.printStackTrace();
            System.out.println(" 出现空指针异常 ");
        }catch (ArrayStoreException e){
            System.out.println(" 出现数组异常 ");
        }
        System.out.println(" 2222222222 ");


    }
        @Test
    public void test2() {
        try {
            File file = new File("sds");
            FileInputStream fis = new FileInputStream(file);
            int data = fis.read();
            while (data != -1) {
                System.out.println("(char)data = " + (char) data);
                data = fis.read();
            }
            fis.close();
        }catch (IOException e){
            e.getStackTrace();
        }
//        }catch (FileNotFoundException e){
//            e.getStackTrace();
//        }catch (IOException e){
//            e.getStackTrace();
//        }


    }

}
