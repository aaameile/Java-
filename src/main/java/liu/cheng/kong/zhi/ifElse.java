package liu.cheng.kong.zhi;

import java.util.Scanner;

/*
分支结构if else

 */
public class ifElse {
    public static void main(String args[]) {
        int heartBeats = 78;
        if (heartBeats < 60 || heartBeats > 100) {
            System.out.println("需要检查身体 = " + heartBeats);
        }
        System.out.println("检查结束" + heartBeats);

        int age = 22;
        if (age < 18) {
            System.out.println("不可以谈恋爱 " + age);
        }else {
            System.out.println("可以谈恋爱了" + age);
        }

        if(age < 0){
            System.out.println("baby " + age);
        }else if(age < 18){
            System.out.println("青少年" + age);
        }else if(age < 35 ){
            System.out.println("成年人" + age);
        }else if(age < 100){
            System.out.println("老年人 " + age);
        }else {
            System.out.println("神仙" + age);
        }


        Scanner sca= new Scanner(System.in);
        int score = sca.nextInt();
        System.out.println("请输入你的成绩：" + score);
        if (score == 100){
            System.out.println("奖励" + score);
        }
        //输入三个数并从小到大输出  如果if else内只有一行就可以省略括号
        System.out.println("输入第一个数" );
        int a = sca.nextInt();
        System.out.println("输入第er个数" );
        int b = sca.nextInt();
        System.out.println("输入第三个数" );
        int c = sca.nextInt();
        if (a > b) {
            if (c > a) {
                System.out.println(b +","+ a +"," + c);
            } else if (c < b) {
                System.out.println(c +","+ b +"," + a);
            }
            else {
                System.out.println(b +","+ c +"," + a);
            }
        }else {
            if(c > b)
                System.out.println(a +","+ b +"," + c);
                 else if (c < a)
                    System.out.println(c + "," + a + "," + b);
                 else
                     System.out.println(a + "," + c + "," + b);
            }

        }


}
