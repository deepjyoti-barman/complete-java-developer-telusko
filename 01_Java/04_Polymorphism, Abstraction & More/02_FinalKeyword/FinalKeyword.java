// Demonstrate the use of final keyword in Java

// final class
final class Demo {

}

// CTE: cannot inherit from final 'Demo'
// class NewDemo extends Demo { }

class Calc {

    // final method
    public final void show() {
        System.out.println("In Calc :: show()");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdvCalc extends Calc {

    // CTE: overridden method is final
    // public void show() {
    // System.out.println("In AdvCalc :: show()");
    // }

    public void sub(int a, int b) {
        System.out.println(a - b);
    }
}

public class FinalKeyword {
    public static void main(String[] args) {

        // final variable
        final int num = 0;
        // num = 1; // CTE: cannot assign a value to final variable 'num'
    }
}
