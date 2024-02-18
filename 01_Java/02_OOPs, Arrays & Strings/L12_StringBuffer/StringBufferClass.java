// Demonstrate the use of StringBuffer class in Java

public class StringBufferClass {

    public static void main(String[] args) {

        // When no value is passed default initialCapacity = 16
        StringBuffer sb1 = new StringBuffer();
        System.out.println("Empty string capacity = " + sb1.capacity()); // 16

        // When some value is passed initialCapacity = Length of the string + 16
        StringBuffer sb2 = new StringBuffer("Deepjyoti");
        System.out.println("Initial capacity = " + sb2.capacity()); // 25

        // Appending a string of length 16
        sb2.append("7kPbQnW4F9j2eY5X");
        System.out.println("Capacity in between = " + sb2.capacity()); // 25

        // Appending one more character to exceed the initialCapacity
        sb2.append("a");
        System.out.println("New capacity = " + sb2.capacity()); // 52

        // Get the length of the StringBuffer object
        System.out.println("length() = " + sb2.length()); // 26

        // Convert StringBuffer object to String
        String str = sb2.toString();
        System.out.println("StringBuffer to String = " + str);

        // Deleting a character
        sb2.deleteCharAt(5);
        System.out.println("deleteCharAt() = " + sb2);

        // Deleting a range of characters
        sb2.delete(8, sb2.length());
        System.out.println("delete() = " + sb2);

        // Inserting a string
        sb2.insert(5, "y");
        System.out.println("insert() = " + sb2);

        // Get a part of the string
        String subStr = sb2.substring(4);
        System.out.println("substring() = " + subStr);

        // sb2 = "Deepjyoti" --> Length: 9
        // sb.setLength(12) --> "Deepjyotinullnullnull" --> Length: 12
        sb2.setLength(12);
        System.out.println("Post setLength() = " + sb2);
        System.out.println("Current length = " + sb2.length());

        // Change the initial capacity
        sb1.ensureCapacity(100);
        System.out.println("ensureCapacity() = " + sb1.capacity());
    }
}
