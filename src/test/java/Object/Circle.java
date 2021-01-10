package Object;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(){
        super();
        radius = 1.0;
        //weight = 1.0;
        //color = "white";
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //面积
    public double findArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;
    }



    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }



}
