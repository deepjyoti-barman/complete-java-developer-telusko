// Different usages of assignment operators in Java

public class AssignmentOperators {

    public static void main(String[] args) {

        int num1 = 7;
        int num2 = 5;

        int result = num1 % num2;
        System.out.println(result);

        num1 = num1 + 2;
        num1 += 2; // compound assignment operator
        System.out.println(num1);

        ++num1; // pre-increment operator: increments the value first and then the value is fetched
        num1++; // post-increment operator: value is fetched first and then the value is incremented
        System.out.println(num1);

        --num1; // pre-decrement operator
        num1--; // post-decrement operator
        System.out.println(num1);
    }
}