package Polymorphic;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        tomCat tom = new tomCat();
        tom.eat();
        mouseJerry jerry = new mouseJerry();
        jerry.eat();

        //多态 父类引用指向子类对象
        Animal a1 = new tomCat();
        a1.eat();
        System.out.println("a1.id = " + a1.id);//不适用于属性
        //((tomCat) a1).speak();//调用子类特有方法的情况
        if (a1 instanceof Animal){
            //tomCat tom1 = (tomCat) a1;//强制类型转换
            ((tomCat) a1).speak();//调用子类特有方法的情况
        }
       AnimalTest animalTest = new AnimalTest();
       animalTest.fun(new tomCat());//具体应用
        animalTest.fun(new mouseJerry());



    }
    public void fun(Animal animal){
        animal.eat();
    }
}
