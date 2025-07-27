// Demonstrate the use of interfaces in Java

interface A {
    int age = 47;

    void show();
}

class B implements A {

    @Override
    public void show() {
        System.out.println("In B :: show()...");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        System.out.println("Age: " + A.age);
    }
}
