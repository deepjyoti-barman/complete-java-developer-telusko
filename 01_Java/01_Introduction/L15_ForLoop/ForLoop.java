// Demonstrates the use of for loop

public class ForLoop {

    public static void main(String[] args) {

        // In a for loop we can place 3 different statements in one line: initialization, condition and increment/decrement
        // In the for loop: initialization and condition check will be performed first, then it will execute all the statements which is there in the body of the loop and finally will execute the increment/decrement operation
        // Condition check is the mandatory part of the for loop, while initialization and increment/decrement operations are optional e.g. `for (; i < 5; ) { }`
        for (int i = 1; i <= 5; i++) {
            System.out.println("DAY " + i);

            for (int j = 1; j <= 9; j++) {
                System.out.println("  " + (j + 8) + " - " + (j + 9));
            }
        }
    }
}
