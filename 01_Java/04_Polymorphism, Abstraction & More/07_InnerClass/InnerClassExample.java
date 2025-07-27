// Demonstrate inner classes in Java

// Outer class
class Outer {
    int age;

    public void show() {
        System.out.println("Inside Outer :: show()");
    }

    // Non-static inner class
    class Inner {

        public void config() {
            System.out.println("Inside Inner :: config()");
        }
    }

    // Static inner class
    static class InnerStatic {

        public void effect() {
            System.out.println("Inside InnerStatic :: effect()");
        }
    }
}

public class InnerClassExample {

    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.show();

        // Calling the method of non-static inner class
        Outer.Inner obj1 = obj.new Inner();
        obj1.config();

        // Calling the method of static inner class
        Outer.InnerStatic obj2 = new Outer.InnerStatic();
        obj2.effect();
    }
}
