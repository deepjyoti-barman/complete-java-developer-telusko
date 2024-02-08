// Demonstrate the use of do-while loop

public class DoWhileLoop {

    public static void main(String[] args) {

        // do-while loop is useful when we want to execute the body of the loop at least once even if the condition is false
        int i = 5;

        do
        {
            System.out.println("Hi, i = " + i);
            i++;
        } while (i <= 4);
    }
}
