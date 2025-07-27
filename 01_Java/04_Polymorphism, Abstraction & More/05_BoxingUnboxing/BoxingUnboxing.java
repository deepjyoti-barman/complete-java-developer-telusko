// Demonstrate boxing and unboxing

public class BoxingUnboxing {

    public static void main(String[] args) {

        int num = 7;
        Integer num1 = new Integer(num); // Boxing
        Integer num2 = num; // Auto-boxing

        int num3 = num1.intValue(); // Unboxing

        String str = "12";
        int num4 = Integer.parseInt(str); // Unboxing
        System.out.println(num4 + 20);
    }
}
