package ClassDiagram;

public class Circle extends Shape{

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private final double  PI = 4.14;

    public Circle() { }
    public Circle(double radius) {
        super(radius);
    }

    public double getArea() {
        return (radius*PI*PI);
    }
}
