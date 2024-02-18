// Demonstrate that String class objects are immutable in nature

public class StringImmutability {

    public static void main(String[] args) {

        // Creates the object in String Constant Pool (SCP) area inside heap memory
        // Both the references are pointing to the same object "Navin"
        String s1 = "Navin";
        String s2 = "Navin";

        System.out.println(s1 == s2);
        // In String class hashCode() method is overloaded so it calculates the output based on their contents and not on their memory addresses
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

        // The following syntax creates the object in the heap memory
        // Every time a new String object is created
        String s3 = new String("Ashok");
        String s4 = new String("Ashok");

        System.out.println(s3 == s4);
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
    }
}
