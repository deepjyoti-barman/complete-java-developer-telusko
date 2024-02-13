// Demonstrate the use of arrays

public class Array {

    public static void main(String[] args) {

        // Array 1
        int[] nums1 = { 3, 7, 2, 4 };

        // Accessing a value
        System.out.println(" --- Array 1 ----");
        System.out.println(nums1[1]);

        // Altering a value
        nums1[1] = 6;
        System.out.println(nums1[1]);

        // Array 2
        int nums2[] = new int[4];

        nums2[0] = 4;
        nums2[1] = 8;
        nums2[2] = 3;
        nums2[3] = 9;

        // Printing all the values
        System.out.println(" --- Array 2 ----");
        for (int i = 0; i < 4; i++) {
            System.out.println(nums2[i]);
        }
    }
}
