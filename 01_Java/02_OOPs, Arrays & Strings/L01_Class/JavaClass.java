// Demonstrates the implementation of classes and objects

class Calculator {

    // Property
    // Instance variable
    int a;

    // Methods / behaviour
    public int add(int n1, int n2) {
        // n1, n2 = Local variable
        int res = n1 + n2;
        return res;
    }
}

public class JavaClass {

    public static void main(String[] args) {

        int num1 = 4;
        int num2 = 5;

        // calc: non-primitive reference variable
        // new Calculator(): creates an object
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}
