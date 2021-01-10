package Value.Transfer;
/*
关于变量的赋值

 */
public class ValueTransfer {
    public static void main(String[] args) {
        //基本数据类型
        int m = 10;
        int n = m;
        System.out.println("n = " + n + "m =" + m );
        n = 20;
        System.out.println("n = " + n + "m =" + m );
        User user = new User();
        user.userId = 20;// 基本数据类型赋值赋的是 变量所保存的 属性值
        User user1 = user;//赋值后指向堆空间中同一个对象  对象赋值赋的是地址值
        System.out.println("user = " + user.userId + "user1 = " + user1.userId );

        user1.userId = 10;
        System.out.println("user1 = " + user1.userId + "user = " + user.userId);

    }


}
class User{
    int userId = 0;
}