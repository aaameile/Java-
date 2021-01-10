package ValueTransfer;
/*
对象值传递
 */
public class PassObject {
    public static void main(String[] args) {
        Circle circle = new Circle();
        PassObject po = new PassObject();
        po.printAreas(circle,5);
    }
    public void printAreas(Circle c,int time){
        System.out.println("radius\t\t area");
        for (int i = 1;i <= time;i++){
            c.radius = i;
            System.out.println(c.radius+ "\t\t"+ c.Area());
        }
    }
}
