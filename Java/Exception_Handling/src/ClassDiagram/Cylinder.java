package ClassDiagram;

public class Cylinder extends Shape{
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private final double  PI = 4.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Cylinder() { }
    public Cylinder(double radius, double height) {
        super(radius);

        this.height = height;
    }


    public double getArea() {
        return (radius*PI*PI*height);
    }
}
