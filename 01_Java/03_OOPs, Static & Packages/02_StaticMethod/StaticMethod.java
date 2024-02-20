// Demonstrate the use of static method

class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " " + price + " " + name);
    }

    public static void display(Mobile obj) {
        System.out.println(obj.brand + " " + obj.price + " " + name);
    }
}

public class StaticMethod {

    public static void main(String[] args) {

        Mobile.name = "SmartPhone";

        Mobile mobile1 = new Mobile();
        mobile1.brand = "Apple";
        mobile1.price = 1500;

        Mobile mobile2 = new Mobile();
        mobile2.brand = "Samsung";
        mobile2.price = 1700;

        Mobile.name = "Phone";
        mobile1.show();
        mobile2.show();

        Mobile.display(mobile1);
        Mobile.display(mobile2);
    }
}
