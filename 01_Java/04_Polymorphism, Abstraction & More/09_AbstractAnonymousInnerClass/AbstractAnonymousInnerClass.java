// Demonstrate Anonymous Inner Class with abstract class

abstract class A {
    public abstract void show();
}

public class AbstractAnonymousInnerClass {

    public static void main(String[] args) {

        // Instead of creating another class B just to implement the show() method of A
        // we can use anonymous inner class to provide the implementation
        A obj = new A() {
            public void show() {
                System.out.println("In anonymous inner class :: show()");
            }
        };

        // Here we are not creating the object of class A
        // We are actually creating the object of anonymous inner class
        obj.show();
    }
}
