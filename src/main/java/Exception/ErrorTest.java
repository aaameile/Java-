package Exception;
/*
Error
    jvm内部出现无法解决的问题 内部资源耗尽
    一般不编写代码处理
 */
public class ErrorTest {
    public static void main(String[] args) {
        //main(args);//java.lang.StackOverflowError 栈溢出
        Integer[] arr = new Integer[1024 * 1024 * 1024];//java.lang.OutOfMemoryError 堆溢出
    }
}
