package object.oriented.programming;

class Circle {
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    final double PI = 3.14;

    Circle(int radius) {
        // this refer to current object
        this.radius = radius;
    }

    void printArea() {
        System.out.println("Area of Circle: " + PI*radius*radius);
    }

}
public class ThisKeyword {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.printArea();

    }
}
