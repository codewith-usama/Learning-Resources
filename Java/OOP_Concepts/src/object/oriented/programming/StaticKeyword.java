package object.oriented.programming;

class Employee {
    static String ceo;
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void showDetails() {
        System.out.println("Name: " + name + " CEO: " + ceo + " salary" + salary);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        // As the ceo is same for the employees working in the same company then why assign for every
        // employee, instead make it static so it will be same for all employees and later ceo gets
        // change it will automatically change for every employees. In simple static is of class type not object;
        // static attribute can be access with class name
        Employee.ceo = "Ahmed";
        Employee employee1 = new Employee("Ali", 80000);
        employee1.showDetails();
        Employee employee2 = new Employee("Taha", 75000);
        employee2.showDetails();
    }
}
