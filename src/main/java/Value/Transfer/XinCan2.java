package Value.Transfer;
/*
方法形参传递 值传递
    形参 方法定义是声明的小括号内的参数
    实参 方法调用是实际传递给形参的值叫做实参
值传递机制
        
    
 */
public class XinCan2 {
    public static void main(String[] args) {
        User2 u2 = new User2();
        //u2.m = 12;
        //u2.n = 11;
        System.out.println(u2.m + " " + u2.n);
        u2.Swap(u2);
        System.out.println(u2.m + " " + u2.n);
    }

}
class User2{
    int m = 12;
    int n = 11;
    public void Swap(User2 user2){
        int temp = user2.m;
        user2.m = user2.n;
        user2.n = temp;

    }
}