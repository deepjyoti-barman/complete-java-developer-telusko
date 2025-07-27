// Program to demonstrate the need of interfaces in Java

interface Computer {
    void code();
}

class Laptop implements Computer {

    @Override
    public void code() {
        System.out.println("In Laptop :: Code, compile & run...");
    }
}

class Desktop implements Computer {

    @Override
    public void code() {
        System.out.println("In Desktop :: Code, compile & run...");
    }
}

class Developer {

    // Tight Coupling: Developer object is dependent on Laptop object
    // public void develop(Laptop laptop) {}

    // Loose Coupling: Developer object is dependent on Computer interface
    public void develop(Computer computer) {
        computer.code();
    }
}

public class NeedOfInterfaces {

    public static void main(String[] args) {

        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

        Developer navin = new Developer();
        navin.develop(laptop);
        navin.develop(desktop);
    }
}
