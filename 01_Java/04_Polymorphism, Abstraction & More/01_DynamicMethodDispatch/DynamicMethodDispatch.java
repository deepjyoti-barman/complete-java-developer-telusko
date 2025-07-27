// Demonstration of dynamic method dispatch with a suitable example

class A {
    public void show() {
        System.out.println("In A :: show()");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B :: show()");
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        // A parent class reference can refer to a child class object
        // The type of obj2 is A but it is referring to an object/implementation of B
        // The same object reference 'obj' is behaving differently based on the object it is referring to, this is called dynamic method dispatch or runtime polymorphism
        // During compile time, when we call obj.show() we are not sure which show() method will be called, it is decided at runtime
        obj = new B();
        obj.show();
    }
}
