// Demonstrates the use of logical operators

public class LogicalOperators {

    public static void main(String[] args) {

        // Logical operators are used to combine the results of two logical operations and generate the final output
        // && Logical AND operator
        // || Logical OR operator
        // ! Logical NOT operator

        // x > y && a < b: If the first condition evaluates to false it will not check the second condition, and the output will be false
        // x > y || a < b: If the first condition evaluates to true it will not check the second condition, and the output will be true
        // This is when it is known as short circuit

        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result = x > y && a < b;
        System.out.println(result);

        result = x < y || a < b;
        System.out.println(result);

        result = a > b;
        System.out.println(!result);
    }
}