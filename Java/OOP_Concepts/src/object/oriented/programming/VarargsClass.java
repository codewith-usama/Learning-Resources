package object.oriented.programming;

class Varargs {
    void print(int ...v) {
        for(int a: v)
            System.out.print(a + " ");
        System.out.println();
    }
}

public class VarargsClass {
    public static void main(String[] args) {
        // Varargs class is (multiple length argument), we can pass multiple arguments which will be treated as an array

        Varargs varargs = new Varargs();
        varargs.print(1, 2, 3, 4, 5);
        varargs.print(1);
        varargs.print(1, 2, 3);
    }
}
