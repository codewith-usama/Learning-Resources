package object.oriented.programming;
class OverLoading {
    String name;
    int age;
    String location;

    void setDetails(String name, int age) {
        this.age = age;
        this.name = name;
    }

    void setDetails(String name, String location) {
        this.location = location;
        this.name = name;
    }

    void setDetails(int age, String location) {
        this.age = age;
        this.location = location;
    }

    void showDetails() {
        System.out.println("Name: " + name + " Age: " + age + " Location: " + location);
    }
    OverLoading(String location, int age, String name) {
        this.name = name;
        this.age = age;
        this.location = location;
    }
}
public class MethodOverLoading {
    public static void main(String[] args) {
        // Method overloading is the concept of using the same method within the same class of same name,
        // but it's parameters should be changed or signature/order of parameter should be changed
        // It is Compile time polymorphism cause at Compile time Compiler decides which method should be executed

        OverLoading overLoading = new OverLoading("Karachi", 19, "Ali");
        overLoading.showDetails();

        overLoading.setDetails("Ahmed", 17);
        overLoading.showDetails();

        overLoading.setDetails(18, "Islamabad");
        overLoading.showDetails();

        overLoading.setDetails("Taha", "Lahore");
        overLoading.showDetails();
    }
}
