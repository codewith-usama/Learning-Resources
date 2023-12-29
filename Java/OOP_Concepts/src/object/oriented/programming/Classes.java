package object.oriented.programming;

class A {
    void show() {
        System.out.println("In A");
    }
}

class B {
    void show() {
        System.out.println("In B");
    }
}

public class Classes {
    public static void main(String[] args) {
        // creating object of both classes to access the methods
        A a = new A();
        a.show();
        B b = new B();
        b.show();
    }
}
