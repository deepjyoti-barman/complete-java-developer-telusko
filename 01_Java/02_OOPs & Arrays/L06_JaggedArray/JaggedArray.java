// Demonstrate the use of jagged array

public class JaggedArray {

    public static void main(String[] args) {

        // Jagged array
        // Declaring no of rows
        int numbers[][] = new int[3][];

        // Declaring each columns each row is going to hold
        numbers[0] = new int[3];
        numbers[1] = new int[4];
        numbers[2] = new int[2];

        // Assigning the random values to the jagged array
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = (int) (Math.random() * 10);
            }
        }

        // Printing the values of the jagged array using enhanced for loop
        for (int arr[] : numbers) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
