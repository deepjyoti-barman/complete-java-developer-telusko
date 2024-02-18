// Demonstrate the use of enhanced for loop

public class EnhancedForLoop {

    public static void main(String[] args) {

        // It only works for array or array type of collections
        int numbers[] = new int[4];
        numbers[0] = 4;
        numbers[1] = 8;
        numbers[2] = 3;
        numbers[3] = 9;

        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
