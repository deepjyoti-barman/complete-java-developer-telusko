// Demonstrate the use of inheritance in Java

public class Inheritance {

    public static void main(String[] args) {

        AdvancedCalculator obj = new AdvancedCalculator();
        int result1 = obj.add(5, 4);
        int result2 = obj.sub(7, 3);
        int result3 = obj.mul(4, 5);
        int result4 = obj.div(8, 2);

        System.out.println(result1 + " " + result2 + " " + result3 + " " + result4);
    }
}
