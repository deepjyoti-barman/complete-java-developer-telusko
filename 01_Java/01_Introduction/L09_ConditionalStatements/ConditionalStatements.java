// Demonstrates the use of conditional statements

public class ConditionalStatements {
    
    public static void main(String[] args) {
        
        int x = 28;

        if (x > 10 && x <= 20) {
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }

        int small = 4;
        int large = 10;

        if (large > small)
            System.out.println(large);
        else
            System.out.println(small);
    }
}
