package Polymorphic;

public class tomCat extends Animal{
    int id = 2;
    @Override
    public void eat() {
        System.out.println(" tom eat jerry ");
    }
    public void speak(){
        System.out.println(" 喵喵喵 ");
    }
}
