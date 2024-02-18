// Demonstrate the use of multi-dimensional array

public class MultiDimensionalArray {

    public static void main(String[] args) {

        // Multi-dimensional array is also known as array of arrays
        int numbers[][] = new int[3][4];

        // Assigning the random values to the 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                numbers[i][j] = (int) (Math.random() * 10);
            }
        }

        // Printing the values of the 2D array using for loop
        System.out.println(" --- 2D array using for loop --- ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        // Printing the values of the 2D array using enhanced for loop
        System.out.println(" --- 2D array using enhanced for loop --- ");
        for (int arr[] : numbers) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
