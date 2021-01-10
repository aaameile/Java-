package Exception;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
throws + 异常类型
    写在方法声明处 指明此方法执行时可能会抛出的异常类型
    一旦出现异常仍然会在代码处生成异常类对象
    满足throws后就会抛出

     try-catch-finally才真正把异常处理掉
     throws 只是将异常抛出给方法的调用者并没有真正将异常处理掉

     如果父类中被重写的方法没有throws方式处理异常则子类重写的方法也不能使用throws
     意味着子类重写的方法中有异常必须使用try-catch-finally
     在方法被递进调用时建议使用throws
     在实际开发中建议使用try-catch-finally
throw 与 throws
    throw
        手动生成一个异常对象并抛出 使用在方法内部  自动抛出异常对象
    throws
        处理异常的方法
        使用在方法声明处的末尾       try catch
    上游排污，下游治污


 */
public class Throws {
    public static void main(String[] args) {
        try {
            test2();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void test2() throws IOException {
        test1();
    }
        @Test
    public static void test1() throws FileNotFoundException, IOException {
        File file = new File("sds");
        FileInputStream fis = new FileInputStream(file);
        int data = fis.read();
        while (data != -1){
            System.out.println("(char)data = " + (char)data);
            data = fis.read();
        }

//        fis.close();
//            public static int ecm(int i,int j) throws EcDef {
//                if (i < 0 || j < 0){
//                    throw new EcDef("分子或分母为负数了");
//                }
//                return i / j;
//            }
    }
}

