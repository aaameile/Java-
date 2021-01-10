package Super;

public class Cat extends Animal{
    public static void main(String[] args) {
        //原始初始化
       // Cat c = new Cat();
//        c.name = "jerry";
//        c.show();
//        c.eat();
        //构造器初始化
        Cat c1 = new Cat(2,"tomCat");
        c1.name = "blackCat";
        c1.show();
        //Cat c2 = new Cat();

    }
    String name;

//    public Cat(){
//        //super();默认调用父类构造器 一般省略
//    }
    public Cat(int age,String name) {
        super(age,name);//调用父类构造器必须写在方法中首行
    }


    @Override
    public void eat() {
        System.out.println(" 吃鱼 ");
        super.eat();

    }

    public void show() {
        System.out.println(super.name);//调用父类name属性
        System.out.println(this.name);
        System.out.println(super.age);

    }
}
