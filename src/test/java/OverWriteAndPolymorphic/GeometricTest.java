package OverWriteAndPolymorphic;

public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        test.disPlayGeometricObject(new Circle(2,"s",4));
        boolean
        tof = test.equalsArea(new Circle(2,"w",4),new MyRectangle(3,5,"4",4));
        System.out.println("tof = " + tof);
    }
    //判断面积是否相等
   public boolean equalsArea(GeometricObject g1,GeometricObject g2){
        return g1.findArea() == g2.findArea();

    }

    //求面积
    public void disPlayGeometricObject(GeometricObject g){
       double area = g.findArea();
        System.out.println("area = " + area);
    }
}
