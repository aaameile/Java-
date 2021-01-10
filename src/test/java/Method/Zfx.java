package Method;

public class Zfx {
    public int method(){
        for (int i = 0;i < 10;i++){
            for (int j = 0;j < 8;j++){
                System.out.print("* " + " ");
            }
            System.out.println();
        }
//        int c = 10;
//        int k = 8;
//        int s;
//        s = c * k;
//        System.out.println("s = " + s);
        return 10 * 8;

    }
    public int method2(int m,int n){
        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++){
                System.out.print("* " + " ");
            }
            System.out.println();
        }
        return m * n;
    }
}
