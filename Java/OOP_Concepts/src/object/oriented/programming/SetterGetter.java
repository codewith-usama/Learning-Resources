package object.oriented.programming;

class Student {
    private int age;
    private String name;


    // if you want to keep your data private, so it's a good practice to make setter and getter functions to access
    // private data members from outside the class with the help of object

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void showDetails() {
        System.out.println("Name: " + name + " Age: " + age);
    }

}


public class SetterGetter {
    public static void main(String[] args) {
        Student student = new Student(12, "Ali");
        student.showDetails();

        // suppose later we want to change the age of Student, we can use setter for this operation
        student.setAge(13);
        System.out.println("Age updated");
        student.showDetails();
    }
}
