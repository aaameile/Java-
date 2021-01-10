package Value.Transfer;
/*
方法形参传递 值传递
    形参 方法定义是声明的小括号内的参数
    实参 方法调用是实际传递给形参的值叫做实参
值传递机制
    如果参数是基本数据类型 实参赋值给形参的是实参真实存储的数据值
    如果参数是引用数据类型 实参赋值给形参的是实参存储数据的地址值（前提是含变量的数据类型）
    person pes = new person（）
    user us = pes    xxx编译错误

        
    
 */
public class XinCan {
    public static void main(String[] args) {
        int m = 11;
        int n = 12;
        System.out.println("n" + n +" m ="+ m);
//        int temp = m;
//        m = n;
//        n = temp;
        XinCan xin = new XinCan();
        xin.Swap(m , n);//swap方法运行完自动销毁 所以m n在swap方法中交换过   输出的m n依旧是main 方法中的m n所以m 值没交换过
        System.out.println("n" + n +" m ="+ m);
    }
    public void Swap(int m,int n){
        int temp = m;
        m = n;
        n = temp;
    }
}
