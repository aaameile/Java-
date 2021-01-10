package liu.cheng.kong.zhi;

import java.util.Scanner;

//获取一个随机数
public class test {
    public static void main(String args[]){

        int value = (int)(Math.random()*99);//[0.0~~1.0]
        System.out.println(value);
        Scanner scanner = new Scanner(System.in);
        int i3 = scanner.nextInt();

        while (true){

            if (i3 == value){
                System.out.printf( "猜对了");
                break;
            }else if (i3 < value){
                System.out.println(" 猜小了请重新输入 ");
                continue;
            }else {
                System.out.println(" 猜大了请重新输入 ");
                continue;
            }
        }

        //公式[a,b] : (int)(Math.random() * (b - a + 1) + a) 获取a~b范围的随机数
        System.out.println("value = " + value);
        //乘法口诀
        for (int i = 0; i <= 9;i++){
            for (int j = 0; j <= i;j++){
                System.out.print(j + "*" + i + "=" + (j * i)+" ");
            }
            System.out.println( );
        }
        //质数
        int count = 0;
        long star = System.currentTimeMillis();
        lable:for (int i = 2;i <= 100000;i++){
            for (int j= 2;j <= Math.sqrt(i);j++ ){
                if (i % j == 0){
                    continue lable;
                }
            }
            count++;
        }
        long end = System.currentTimeMillis();
        System.out.println("质数个数为" + count);
        System.out.println("所花费时间 " + (end - star));
        //完数
        //int factor = 0;
        for (int i = 1;i <= 1000;i++){
            int factor = 0;
            for (int j = 1;j <= i/2;j++){
                if (i % j == 0){
                    factor +=j;
                }
            }
            if (i == factor){
                System.out.println("完数= " + i);
            }
                //factor = 0;
        }
    }
}
