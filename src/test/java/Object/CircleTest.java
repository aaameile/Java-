package Object;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle("white",3,3);
        Circle circle1 = new Circle("white",3,4);
        System.out.println(circle1.getColor().equals(circle.getColor()));
        System.out.println(circle.equals(circle1));
        System.out.println(circle);
    }
}
