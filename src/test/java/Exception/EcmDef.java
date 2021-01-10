package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EcmDef {
    public static void main(String[] args) {
        int result = 0;
        try {
            Scanner s = new Scanner(System.in);
            Scanner s2 = new Scanner(System.in);
            int n1 = s.nextInt();
            int n2 = s2.nextInt();
             result = ecm(n1,n2);
        }catch (InputMismatchException e){
            System.out.println(" 数据类型不一致 ");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" 缺少参数");
        }catch (ArithmeticException e){
            System.out.println(" 除0 ");
        }catch (EcDef e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("result = " + result);
        }


    }
    public static int ecm(int i,int j) throws EcDef {
        if (i < 0 || j < 0){
            throw new EcDef("分子或分母为负数了");
        }
        return i / j;
    }
}
//自定义异常类
class EcDef extends Exception{
    static final long serialVersionUID = -3387516993124229948L;
    public EcDef(){}
    public EcDef(String msg){
        super(msg);
    }
}
