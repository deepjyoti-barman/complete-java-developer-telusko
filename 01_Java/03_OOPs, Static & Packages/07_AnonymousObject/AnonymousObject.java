// Demonstrate anonymous object in Java

class Demo {
    Demo() {
        System.out.println("Object created!");
    }

    public void show() {
        System.out.println("Demo.show() called!");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {

        // Anonymous object
        // The only downside is you can't use the object once again
        new Demo().show();
    }
}
