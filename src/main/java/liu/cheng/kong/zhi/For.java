package liu.cheng.kong.zhi;

import org.junit.Test;

import java.util.Scanner;

public class For {
    public static void main(String args[]){
        for (int i = 1; i <= 5; i++){
            System.out.println("hello world! ");
        }
        //for循环过程演示
        int num = 1;
        for (System.out.println("a");num <= 2; System.out.println("b") ,num++){
            System.out.println("c");
        }
        //遍历1~100以内偶数.输出所有偶数和.输出偶数个数
        int count = 0;
        int all = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println("i = " + i);
                all += i;
                count++;
            }
        }
        System.out.println("all = " + all);
        System.out.println("count = " + count);
        //一到150循环 每行打印一个值 另外3的倍数打印foo 5...打印biz 7....打印baz
        for (int i = 1;i <= 150;i++){
            System.out.print(i+" ");
            if (i % 3 == 0){
                System.out.print("foo");
                return;
            }
            if(i % 5 == 0){
                System.out.print("biz");
                return;
            }
            if (i % 7 == 0){
                System.out.print("baz");
                return;
            }
            System.out.println( );
        }
        //最大公约数最小公约数
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int n = scan.nextInt();
        System.out.println("再输入一个正整数");
        int m = scan.nextInt();
        int min = (m < n )? m : n;
        for (int i = min;min >= 1; i--){
            if (m % i == 0 && n % i == 0) {
                System.out.println("最大公约数为" + i);
                break;
            }
        }
        int max = (m > n)? m : n;
        for (int i = max;i <= m * n;i++){
            if (i % m == 0 && i % n == 0) {
                System.out.println("最小公倍数为" + i);
                break;
            }
        }
        //水仙花数
        for(int i = 100;i < 1000 ;i++){
            int a = i / 100;
            int b =i /10 % 10;
            int c= i % 102;
            if (a * a * a + b * b * b + c * c * c == i){
                System.out.println("水仙花数是 " + i);
            }
        }

    }
    @Test
    public void test(){
        String[] str = new String[]{"a","b","c"};
        for (String s :str){
            s = "s";
            System.out.println(s);
        }


    }
}
