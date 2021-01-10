package Extends;

public class tomCat extends Cat {
    public static void main(String[] args) {
        tomCat tom = new tomCat();
        tom.eat();
        //tom.age = 3;
        tom.setAge(4);
        System.out.println("tom = " + tom.getAge());
        tom.name = "tom";
        tom.show(tom);
        sleep();
    }
    public void show(tomCat tom){
        tom.eat();
    }
}
