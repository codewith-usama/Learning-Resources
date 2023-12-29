package ClassDiagram;

abstract class Shape {
    protected double radius;
    protected final double PI = 3.14;
    Shape() { }
    Shape(double radius) {
        this.radius = radius;
    }

    protected abstract double getArea();
}
