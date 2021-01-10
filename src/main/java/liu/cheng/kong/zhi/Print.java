package liu.cheng.kong.zhi;

public class Print {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if (i % 5 == 0 && i % 3 == 0){
                System.out.println(" Fizz Buzz ");
            }
            if (i % 5 == 0){
                System.out.println(" Buzz ");
            }
            if (i % 3 == 0 ){
                System.out.println(" Fizz ");
            }else {
                System.out.println("i = " + i);
            }
    }
}

}