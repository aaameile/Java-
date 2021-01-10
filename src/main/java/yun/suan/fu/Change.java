package yun.suan.fu;
/*
交换变量的3种方法
 */
public class Change {
    public static void main(String args[]){
        String are1="昆明";
        String are2="曲靖";
        System.out.println("are1 = " + are1+"are2 = " + are2);
        String temp=are1;
        are1=are2;
        are2=temp;
        System.out.println("are1 = " + are1+"are2 = " + are2);
        //不用定义临时变量 但是只限于数字
        int a=1;
        int b=2;
        System.out.println("a = " +a +"b = " + b);
        int c=a+b;
        a=c-a;
        b=c-b;
        System.out.println("a = " +a +"b = " + b);
        //位运算符
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a = " +a +"b = " + b);


    }
}
