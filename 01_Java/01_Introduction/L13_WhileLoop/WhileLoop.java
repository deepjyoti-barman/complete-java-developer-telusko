// Demonstrates the use of while loop
// Also shows us an example of nested while loop
// Print 'Hi' 5 times and for every 'Hi' print 'Hello' 3 times

public class WhileLoop {

    public static void main(String[] args) {

        int i = 1;
        while (i <= 5) {
            System.out.println("Hi, i = " + i);

            int j = 1;
            while (j <= 3) {
                System.out.println("Hello, j = " + j);
                j++;
            }

            i++;
        }
    }
}
