package Recursion;

/*
递归方法的使用
    一个方法体内调用它自身
    方法递归包含了一种隐式的循环，它会重复执行某段代码但这种重复执行无需循环控制
    递归一定要向一种方向递归否则这种递归就变成了无穷递归类似于死循环
 */
public class Recursion {

    public static void main(String[] args) {
        //计算所有自然数和for 循环
        int sum = 0;
        for (int i =  0;i <= 10;i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
        //递归
        Recursion recursion = new Recursion();
        int sum1 = recursion.Sum(10);
        System.out.println("sum1 = " + sum1);

        //
        int f10 = recursion.f(10);
        System.out.println("f = " + f10);



    }
    //递归1-n的和
    public int Sum(int n){
        if (n == 1){
            return 1;
        }else {
            return n + Sum(n - 1);
        }
    }
    //n！
    public int Product(int n){
        if (n == 1){
            return 1;
        }else {
            return n * Product(n - 1);
        }
    }
    //f(0) = 1   f(1) = 4    f(n + 2) = 2 * f(n + 1) + f(n)其中n是大于0的数 求f（10）的值
    public int f(int n){
        if (n == 0){
            return 1;
        }else if (n == 1){
            return 4;
        }else {
            return 2 * f(n - 1) + f(n - 2);
        }
    }

}
