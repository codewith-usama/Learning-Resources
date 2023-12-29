package object.oriented.programming;

abstract class Abstract {
    abstract void show();
}
// abstract can be used with both class and methods to make them abstract
// We can not create any object of abstract class and there is no definition of any abstract method inside the abstract
// class the child/sub class is responsible for the definition of abstract method as follow

class SubClass {

    final double PI = 3.14F;
    // final is used for constants like PI, gravity...
    void show() {
        System.out.println("Values of PI: " + PI);
        System.out.println("In Sub Class");
    }
}

public class FinalandAbstractKeyword {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.show();

    }
}
