package Method;

public class Person {
    String name;
    int sex;
    int age;


    public void study(){
        System.out.println("studying");
        //showAge();
    }
    public void showAge(){
        System.out.println("age = " + age);
        //addAge(2);
    }
    public int addAge(int i){
       age += i;
       return age;
    }
}
