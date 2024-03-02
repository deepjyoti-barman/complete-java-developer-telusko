// We are creating a new class AdvancedCalculator and not adding new methods inside the Calculator class because we want to keep the Calculator class simple and if we add new methods then we can't sell the simple Calculator for 10$. 
// With the help of inheritance now we can sell a Calculator which has two methods for 10$ and an AdvancedCalculator which has four methods for 20$. This way we can keep the price of the Calculator low and sell the AdvancedCalculator at a higher price.
public class AdvancedCalculator extends Calculator {

    public int mul(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}
