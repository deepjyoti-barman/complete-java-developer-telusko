// Program to demonstrate the use of this() method in Java

class A {

    public A() {
        super();
        System.out.println("Inside A");
    }

    public A(int i) {
        super();
        System.out.println("Inside A with value of i as " + i);
    }
}

class B extends A {

    public B() {
        super();
        System.out.println("Inside B");
    }

    public B(int i) {
        this(); // executes the default constructor of the same class
        System.out.println("Inside B with value of i as " + i);
    }
}

public class ThisMethod {

    public static void main(String[] args) {

        B obj = new B(2);
    }
}
