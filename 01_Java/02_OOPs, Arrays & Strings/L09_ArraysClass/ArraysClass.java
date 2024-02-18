// Demonstrate the use of Arrays class in Java

import java.util.Arrays;

public class ArraysClass {

    public static void main(String[] args) {

        int[] arr1 = new int[4];
        arr1[0] = 20;
        arr1[1] = 10;
        arr1[2] = 50;
        arr1[3] = 80;

        // 'new int[4]' creates the following object of the class
        // Methods of this class can't be invoked directly its only for internal usage
        System.out.println("Array class name: " + arr1.getClass().getName());

        // Sort the array
        Arrays.sort(arr1);

        // Print the array
        System.out.println(Arrays.toString(arr1));

        // Verify the equality of two arrays
        int[] arr2 = { 10, 20, 50, 80 };
        System.out.println(Arrays.equals(arr1, arr2));
    }
}