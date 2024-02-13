// Demonstrate the use of method overloading

class Calculator {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, double n2) {
        return n1 + n2;
    }
}

public class MethodOverloading {

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        int res1 = obj.add(3, 4);
        System.out.println(res1);

        int res2 = obj.add(3, 4, 5);
        System.out.println(res2);

        double res3 = obj.add(3.5, 4.2);
        System.out.println(res3);
    }
}
