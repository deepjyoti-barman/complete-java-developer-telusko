// Demonstrate the use of the abstract keyword

abstract class Car {

    // Declaring an abstract method
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("Playing music inside the car...");
    }
}

abstract class WagonR extends Car {

    // Implementing the abstract method
    public void drive() {
        System.out.println("Car is driving...");
    }
}

class UpdatedWagonR extends WagonR {

    // Implementing the abstract method
    public void fly() {
        System.out.println("Car is flying...");
    }
}

public class AbstractKeyword {

    public static void main(String[] args) {

        Car car = new UpdatedWagonR();
        car.playMusic();
        car.drive();
        car.fly();
    }
}
