package Main;

/*
main方法的说明
    main（）作为程序的入口
    public static void main(String[] args) {}
    main也是普通的静态方法
    main也可以作为我们与控制台交互的方式 （之前用scanner）

 */
public class Main {
    public static void main(String[] args) {
        for (String s : args){
            System.out.println(" = " + s);
        }
        //main.main(new String[100]);
    }
}
class main{
    public static void main(String[] args) {
        for (int i = 0 ;i < args.length;i++){
            args[i] = "args_" + i;
            System.out.println("args = " + args[i]);
        }
    }
}
