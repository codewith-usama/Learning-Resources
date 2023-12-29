package exception;

public class NestedTry {
    public static void main(String[] args) {
        try {
            try {
                int a = 3, b = 0;
                int c = a/b;
                System.out.println("Result of a/b: " + c);
            }catch (ArithmeticException msg) {
                System.out.println(msg.getMessage());
            }

            try {
                int a = Integer.parseInt("NumberFormatException");
                System.out.println(a);
            } catch (java.lang.NumberFormatException msg) {
                System.out.println(msg.getMessage());
            }
        } catch (Exception msg) {
            System.out.println(msg.getMessage());
        }
    }
}
