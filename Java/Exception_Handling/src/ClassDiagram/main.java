package ClassDiagram;

public class main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.2);
        System.out.println((String.format("%.3f", circle.getArea())));

        Cylinder cylinder = new Cylinder(3.2, 1.2);
        System.out.println(String.format("%.3f", cylinder.getArea()));
    }
}
