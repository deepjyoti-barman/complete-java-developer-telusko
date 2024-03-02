package other;

class Launch {

    public void display() {
        A obj = new A();
        System.out.println(obj.rollNo);
    }
}

public class A {

    int marks = 6;
    protected int rollNo = 101;

    public void show() {
        System.out.println(marks);
    }
}
