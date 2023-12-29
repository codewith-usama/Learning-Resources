package object.oriented.programming;


class Number {
    int a;
    int b;

    // Constructor are used to assign value at runtime,
    // Note: 1. Constructor name is same as Class name
    //       2. Constructor does not return any value
    Number(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void print() {
        System.out.println("a: " + a + " b: " + b);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Number a = new Number(1, 2);
        a.print();
    }
}
