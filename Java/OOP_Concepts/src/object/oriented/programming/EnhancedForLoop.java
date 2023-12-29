package object.oriented.programming;

public class EnhancedForLoop {
    public static void main(String[] args) {
        // 1-D array
        int[] arr1 = {1, 2, 3, 4, 5};
        // 2-D array
        // 2-D array has n rows and every row must contain same number of columns
        int[][] arr2 = {
                {1, 2,},
                {3, 4},
                {5, 6},
                {7, 8}
        };

        // jagged array
        // jagged array contains n rows and rows contains different number of columns
        int[][] arr3 = {
                {1, 2, 3},
                {1},
                {1, 2, 3, 4, 5, 6},
                {1, 2}
        };

        // 1-d array
        System.out.println("1-D array");
        for(int a: arr1)
            System.out.print(a + " ");
        System.out.println();

        // 2-D array
        System.out.println("2-D array");
        for(int[] a: arr2) {
            for(int b: a)
                System.out.print(b + " ");
            System.out.println();
        }

        // Jagged array
        System.out.println("Jagged array");
        for(int[] a: arr3) {
            for(int b: a)
                System.out.print(b + " ");
            System.out.println();
        }

    }
}
