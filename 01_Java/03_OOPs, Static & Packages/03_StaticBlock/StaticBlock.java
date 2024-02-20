// Demonstrate the use of static block

class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("Inside the static block...");
    }

    // Setting default values for each object in the constructor
    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("Inside the constructor...");

        // We want the name variable to be initialized only once for all the objects
        // So putting it inside the constructor is not the solution
        // name = "Phone";
    }

    public void show() {
        System.out.println(brand + " " + price + " " + name);
    }

    public static void display(Mobile obj) {
        System.out.println(obj.brand + " " + obj.price + " " + name);
    }
}

public class StaticBlock {

    public static void main(String[] args) throws ClassNotFoundException {

        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1500;

        // Mobile obj2 = new Mobile();

        // Load the class without creating the object
        Class.forName("Mobile");
    }
}
