package Method;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "tom";
        p.age = 12;
        p.sex = 1;
        p.study();
        p.showAge();
        int newAge = p.addAge(2);
        System.out.println("newAge = " + newAge);

        Person p1 = new Person();
        p1.study();
        p1.showAge();
        p1.addAge(12);
        p1.showAge();
    }


}
