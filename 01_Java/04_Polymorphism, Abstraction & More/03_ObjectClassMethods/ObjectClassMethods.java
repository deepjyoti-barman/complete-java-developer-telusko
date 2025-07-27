// Demonstrate the methods a class inherits from Object class

class Laptop {
    String model;
    int price;

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {

        Laptop that = (Laptop) obj;
        return this.model.equals(that.model) && this.price == that.price;
    }

    @Override
    public int hashCode() {
        return model.hashCode() + price;
    }
}

public class ObjectClassMethods {
    public static void main(String[] args) {

        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 100;

        // Printing object directly
        System.out.println(obj1);
        System.out.println(obj1.toString());

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 100;

        // Comparing values of both the objects by equals() method
        System.out.println(obj1.equals(obj2));

        // Comparing hashCode() methods of obj1 and obj2
        System.out.println(obj1.hashCode() == obj2.hashCode());
    }
}