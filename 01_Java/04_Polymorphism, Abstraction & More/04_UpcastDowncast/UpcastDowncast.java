// Program to demonstrate upcasting and downcasting in Java

class A {

    public void show1() {
        System.out.println("In A :: show()");
    }
}

class B extends A {

    public void show2() {
        System.out.println("In B :: show()");
    }
}

public class UpcastDowncast {

    public static void main(String[] args) {

        // Dis-advantage of upcasting is that we can't access the methods of the subclass even if the object is of subclass
        A obj = new B(); // Up-casting
        obj.show1();

        B obj2 = (B) obj; // Down-casting
        obj2.show2();
    }
}
