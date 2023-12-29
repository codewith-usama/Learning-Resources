package exception;

public class IndexOutOfBound {
    public static void main(String[] args) {
        try {
            int []a = new int[5];
            a[111] = 1;
        }
        catch (ArrayIndexOutOfBoundsException msg) {
            System.out.println("Array Index Out Of Bound");
        }
    }
}
