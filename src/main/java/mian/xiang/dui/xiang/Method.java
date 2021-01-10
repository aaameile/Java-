package mian.xiang.dui.xiang;

/*
类中方法的声明和使用
    使用
        可以调用当前类的属性或方法
        方法a中又调用方法a就叫做递归

    方法 描述类具有的功能
        public void eat(){}
        public void sleep(int hour){}
        public String getName(){}
        public String getNation(String nation ){}

    方法的声明 权限修饰符 返回值类型 方法名（形参）{方法体}
        static final abstract 关键字
        权限修饰符
            private public protected 缺醒
        返回值类型
            有
                如果有返回值必须在方法声明时指定返回值类型同时需要return关键字来返回指定类型变量或常量
            没有
                方法声明用void来表示 通常没有返回值不需要return 否则就是结束方法的意思

    形参列表 方法可以声明多个形参
        格式 数据类型 形参1 ，数据类型 形参2 ，...
        定义方法时要不要形参
            具体问题具体分析

 */
public class Method {
    public static void main(String[] args) {
        C c = new C();
        c.name = "as";
        c.eat();
        c.getName();
        c.getNation("中国");
        c.sleep(3);
    }

}
class C{
    //属性
    String name;
    int age;
    boolean isMale;

    //无参方法
    public void eat(){
        sleep(3);//方法中调用方法
        System.out.println("吃饭");
    }
    //带参方法
    public void sleep(int hour){
        System.out.println("睡了" + hour + "个小时");
    }
    public String getName(){
        return name;
    }
    public String getNation(String nation ){
        String info = "我的国籍是" + nation;
        return info;
    }


}
