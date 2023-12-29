package object.oriented.programming;

public class Arrays {
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

        // printing array using for loop as discuss earlier

        // 1-D array
        System.out.println("1-D array");
        for(int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");
        System.out.println();

        // 2-D array
        System.out.println("2-D array");
        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[i].length; j++)
                System.out.print(arr2[i][j] + " ");
            System.out.println();
        }

        // jagged array
        System.out.println("Jagged array");
        for(int i = 0; i < arr3.length; i++) {
            for(int j = 0; j < arr3[i].length; j++)
                System.out.print(arr3[i][j] + " ");
            System.out.println();
        }
    }
}
