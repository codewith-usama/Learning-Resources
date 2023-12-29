package object.oriented.programming;

class Car {
    int speed;
    String name;
    int modeYear;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModeYear() {
        return modeYear;
    }

    public void setModeYear(int modeYear) {
        this.modeYear = modeYear;
    }

    Car(int modeYear, String name, int speed) {
        this.modeYear = modeYear;
        this.name = name;
        this.speed = speed;
    }

    Car(int modeYear, int speed) {
        this.speed = speed;
        this.modeYear = modeYear;
    }
    Car(String name, int modeYear) {
        this.modeYear = modeYear;
        this.name = name;
    }
    void showDetails() {
        System.out.println("Name: " + name + " ModelYear: " + modeYear + " Speed: " + speed);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        // constructor overloading is the concept of multiple constrcutor in the same class with different signatures
        Car car1 = new Car(2020, "Audi", 190);
        car1.showDetails();

        Car car2 = new Car("BMW", 2021);
        car2.setSpeed(170);
        car2.showDetails();
    }
}
