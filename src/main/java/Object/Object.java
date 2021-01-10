package Object;
/*
java.lang.object类
    object类是所有java的根父类
    如果在类的声明中未使用extends关键字指明其父亲则默认父类为java.lang.object
    object只有一个空参构造器


面试题
    final  finally     finalize 区别是什么
    没有任何关系
    final  finally 是关键字
    finalize 是垃圾回收器方法
    通常不要主动去调用交给垃圾回收器自动调用


*/
public class Object {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println("order.getClass() = " + order.getClass());
        System.out.println(" = " +order.getClass().getSuperclass());
    }

}
class Order{
    
}
