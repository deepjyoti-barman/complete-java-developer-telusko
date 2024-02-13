// Demonstrates the implementation of different type of objects

class Computer {

    // A method with no arguments or return value
    public void playMusic() {
        System.out.println("Playing music... ");
    }

    // A method with no arguments, but with a return value
    public String getMeAPen() {
        return "Pen";
    }

    // A method with 1 argument and a return value
    public String getMeANewPen(int cost) {
        if (cost >= 10)
            return "Brand New Pen";

        return "Nothing";
    }
}

public class Methods {

    public static void main(String[] args) {

        Computer obj = new Computer();

        obj.playMusic();

        String pen1 = obj.getMeAPen();
        System.out.println(pen1);

        String pen2 = obj.getMeANewPen(12);
        System.out.println(pen2);
    }
}
