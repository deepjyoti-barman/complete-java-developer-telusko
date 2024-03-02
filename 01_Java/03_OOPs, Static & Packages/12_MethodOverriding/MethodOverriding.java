// Demonstrate method overriding in Java

class A {
    public void show() {
        System.out.println("in show(() of A)");
    }

    public void config() {
        System.out.println("in config() of A");
    }
}

class B extends A {

    public void show() {
        System.out.println("in show() of B");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {
        B obj = new B();
        obj.config();
        obj.show();
    }
}
