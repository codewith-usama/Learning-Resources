package exception;

public class DivideByZero {
    public static void main(String[] args) {
        try {
            int a = 30, b = 0;
            int c = a/b;
            System.out.println("Result of a/b: " + c);
        } catch (ArithmeticException msg) {
            System.out.println(msg.getMessage());
        }
    }
}
