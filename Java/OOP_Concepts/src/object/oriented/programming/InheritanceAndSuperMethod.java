package object.oriented.programming;

class Vehicle { // parent class
    int price;
    int modelYear;

    Vehicle(int price, int modelYear) {
        this.modelYear = modelYear;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    void printDetails() {
        System.out.print("Price: " + price + " Model Year " + modelYear + " ");
    }
}
class Audi extends Vehicle { // child class
    int numOfDoor;
    String name;

    Audi(int price, int modelYear, int numOfDoor, String name) {
        // every constructor is by default super
        // super method is used to call the constructor of base/parent/super class from derived/child/sub class
        super(price, modelYear);
        this.numOfDoor = numOfDoor;
        this.name = name;
    }

    @Override
    void printDetails() {
        System.out.print("Name: " + name + " ");
        super.printDetails();
        System.out.println("Num of Doors: " + numOfDoor);
    }
}
public class InheritanceAndSuperMethod {
    public static void main(String[] args) {
        // Inheritance (Is a relationship) or Parent Child relationship
        Audi audi = new Audi(1000000, 2020, 2, "Audi R8");
        audi.printDetails();

    }
}
