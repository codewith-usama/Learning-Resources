package exception;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            int a = 30, b = 0;
            int c = a/b;
        }catch (ArithmeticException msg) {
            System.out.println(msg.getMessage());
        } catch (java.lang.NumberFormatException msg) {
            System.out.println(msg.getMessage());
        } finally {
            System.out.println("Exception caught and handled");
        }
    }
}
