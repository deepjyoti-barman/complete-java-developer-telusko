// Demonstrate the use of packages in Java

import tools.Calculator;
import tools.AdvancedCalculator;

public class PackageDemo {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        AdvancedCalculator advCalc = new AdvancedCalculator();

        System.out.println(calc.add(10, 20));
        System.out.println(advCalc.mul(10, 20));
    }
}
