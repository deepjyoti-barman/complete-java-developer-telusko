// Type conversion in Java

public class TypeConversion {

    public static void main(String[] args) {

        byte b = 127;
        int a;
        a = b; // widening / implicit conversion
        System.out.println(a);

        a = 257;
        b = (byte) a; // narrowing / lossy conversion / explicit conversion / casting
        System.out.println(b); // 257 % 256 = 1

        float f = 5.6f;
        int x = (int) f;
        System.out.println(x);

        byte p = 10;
        byte q = 30;
        int result = p * q; // type promotion, 10 * 30 = 300 which is beyond the range of byte so it is promoted to int
        System.out.println(result);

        // Note: char to boolean, int to char etc. conversions are not allowed
    }
}
