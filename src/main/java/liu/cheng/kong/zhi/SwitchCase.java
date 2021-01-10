package liu.cheng.kong.zhi;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String args[]){
        int a = 2;
        switch (a){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("tree");
                break;
                default:
                    System.out.println("other");
        }
        //break可以不用
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入2019的月份 ");
        int month = scan.nextInt();
        System.out.println("请输入2019年的日期 " );
        int day = scan.nextInt();
        int allDay = 0;
        switch (month){
            case 12:
                allDay += 30;
            case 11:
                allDay += 31;
            case 10:
                allDay += 30;
            case 9:
                allDay += 31;
            case 8:
                allDay += 31;
            case 7:
                allDay += 30;
            case 6:
                allDay += 31;
            case 5:
                allDay += 30;
            case 4:
                allDay += 31;
            case 3:
                allDay += 28;
            case 2:
                allDay += 31;
            case 1:
                allDay += day;
        }
        System.out.println("2019年" + month + "月" + day + "日是当年的第" + allDay + "天");
    }
}
