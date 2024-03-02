// Program to demonstrate the use of super() method in Java

class A {

    public A() {
        super(); // Calling the constructor of Object class
        System.out.println("Inside A");
    }

    public A(int i) {
        super();
        System.out.println("Inside A with value of i as " + i);
    }
}

class B extends A {

    public B() {
        super(); // super() call is implicitly added by the compiler
        System.out.println("Inside B");
    }

    public B(int i) {
        super(i);
        System.out.println("Inside B with value of i as " + i);
    }
}

public class SuperMethod {

    public static void main(String[] args) {

        B obj1 = new B();
        B obj2 = new B(2);
    }
}
