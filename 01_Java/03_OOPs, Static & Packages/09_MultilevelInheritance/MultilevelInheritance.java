// Program to demonstrate multilevel inheritance

public class MultilevelInheritance {

    public static void main(String[] args) {

        ScientificCalculator sc = new ScientificCalculator();

        int result1 = sc.add(4, 5);
        int result2 = sc.sub(7, 3);
        int result3 = sc.mul(5, 4);
        int result4 = sc.div(15, 5);
        int result5 = sc.power(4, 2);

        System.out.println(result1 + " " + result2 + " " + result3 + " " + result4 + " " + result5);
    }
}
