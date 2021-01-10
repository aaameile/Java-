package OverWriteAndPolymorphic;
/*
圆形
 */
public class Circle extends GeometricObject{
    private double radius;//圆半径


    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //计算圆面积
    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }

}
