package object.oriented.programming;

class Parent {
    int a;
    Parent(int a) {
        this.a = a;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    void showData() {
        System.out.print(a + " ");
    }
}

class Child extends Parent {
    int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    Child(int a, int b) {
        super(a);
        this.b = b;
    }
    @Override
    void showData() {
        super.showData();
        System.out.println(b);
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
        Child child = new Child(1, 2);
        // method overriding is runtime polymorphism. It is a concept of using the same method with same
        // name, same number of arguments and same return type.
        child.showData();

        Parent parent = new Parent(3);
        parent.showData();
    }
}
