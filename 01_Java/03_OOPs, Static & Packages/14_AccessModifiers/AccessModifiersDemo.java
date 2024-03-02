// Demonstrate the use of access modifiers in Java

import other.*;

class C extends A {

    public void printObj() {
        System.out.println(rollNo);  // Accessing protected member of class A
    }
}

public class AccessModifiersDemo {

    public static void main(String[] args) {

        A obj1 = new A();
        // System.out.println(obj1.marks); // CTE: marks is not public in A; cannot be accessed from outside package

        B obj2 = new B();
        // System.out.println(obj2.marks); // CTE: marks has private access in B

        C obj3 = new C();
        obj3.printObj();
    }
}
