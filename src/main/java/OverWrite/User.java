package OverWrite;
/*
方法的重写（overwrite 、override）
    子类继承父类后 可以对父类中同名同参数的方法进行覆盖操作
应用
    重写以后当创建子类对象时
    通过子类对象调用父类同名同参数方法时
    实际执行的是子类重写父类的方法
规定
    子类中叫重写的方法
    父类中叫被重写的方法
    二者方法名形参列表都必须一致
    子类重写的方法权限修饰符不能小于父类中的方法权限修饰符
    特殊的 子类不能重写父类中声明为private权限的方法
    子类父类同名同参数的方法要么声明为static（可以考虑重写） 要么都不是（不是重写）


    返回值类型
        父类被重写的方法返回值为void  子类重写方法返回值也为void
        父类被重写的方法返回值为object类型  子类重写方法返回值为object类型或object类型的子类类型
        父类被重写的方法返回值为基本数据类型（double）  子类重写方法返回值类型必须是相同类型的基本数据类型 （double）
异常
    子类重写的方法抛出的异常类型不大于被重写的方法抛出的异常类型
 */
public class User {
    private void eat(){
        System.out.println(" 吃饭 ");
    }
    public void walk(){

    }
     void speak(){

    }
    Object sleep(){
        return null;
    }
    double info(){
        return 2.0;
    }
}
