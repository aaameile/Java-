package ValueTransfer;

public class SystemExit {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        methond(a,b);
        System.out.println("b = " + b);
        System.out.println("a = " + a);
    }

    private static void methond(int a, int b) {
        a = a * 10;
        b = b * 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.exit(0);
    }
}
