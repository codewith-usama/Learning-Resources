package object.oriented.programming;

public class AutoBoxing {
    public static void main(String[] args) {
        // usually frame works don't allow to use primitive data types like int, float, double
        // for counter that we have a concept of wrapper class, rather than using int we use Integer class
        Integer i = new Integer(5); // wrapper class
        System.out.println(i);
        int a = 5;
        i = new Integer(a); // when passing any primitive value in wrapper class it's called Boxing or Wrapping
        System.out.println(i);

        int b = i.intValue(); // unwrapping or unboxing
        System.out.println(b);

        Integer c = b; // AutoBoxing or AutoWrapping
        System.out.println(c);
        int d = c; // AutoUnBoxing or AutoUnWrapping
        System.out.println(d);

        String str = "123"; // for fetching interger from we use parseint method
        int e = Integer.parseInt(str);
        System.out.println(e);
    }
}
