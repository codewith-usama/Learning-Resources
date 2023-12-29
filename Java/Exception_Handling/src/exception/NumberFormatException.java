package exception;


public class NumberFormatException extends Throwable {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt("NumberFormatException");
            System.out.println(a);
        } catch (java.lang.NumberFormatException msg) {
            System.out.println(msg.getMessage());
        }
    }
}
