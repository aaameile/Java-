package yun.suan.fu;
/*
三目运算
条件表达式的结果为boolean类型
凡是可以用三元运算符的都可以改为if else 反之不行
如果既可以三元又可以if 用三元
 */
public class sanYuan {
    public static void main(String args[]){
        int m=1;
        int n=2;
        int max=(m>n) ? m : n;
        System.out.println("max = " + max);
        double max1=(m>n) ? 2.0 : 1.0;
        System.out.println("max1 = " + max1);
        //返回类型和要和表达式一致 而且还可以嵌套
        n=1;
        String maxStr = ( m > n) ? "m大" : ((m == n) ? "相等" : "n大");
        System.out.println("maxStr = " + maxStr);
        //获取三个数最大值
        int a=3;
        int b=2;
        int c=1;
        int large1 = (a > b) ? a : b;
        int large2 = (large1 > c)? large1 : c;
        System.out.println("large2 = " + large2);
        //可读性太差 效率也不是很好
        int large3 = (((a > b) ? a : b) > c)? ((a > b) ? a : b) : c;
        System.out.println("large3 = " + large3);
        //        if else
        if (m>n){
            System.out.println("m = " + m);
        }else {
            System.out.println("n = " + n);
        }


    }
}
