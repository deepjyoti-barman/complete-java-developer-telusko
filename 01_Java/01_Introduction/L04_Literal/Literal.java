// Demonstrates the use of literals in Java

public class Literal {

    public static void main(String[] args) {

        int num1 = 0b101; // binary to int
        System.out.println(num1);

        int num2 = 0x7E; // hexadecimal to int
        System.out.println(num2);

        int num3 = 10_00_00_000;
        System.out.println(num3);

        double num4 = 56;
        System.out.println(num4);

        double num5 = 12e10;
        System.out.println(num5);

        char ch = 'a';
        ch++;
        System.out.println(ch);

        String str = "Hello world";
        System.out.println(str);
    }
}
