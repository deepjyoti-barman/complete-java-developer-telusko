// Write a program which to get the desired output for the given input
// Input: aaabcccccaa
// Output: a3b1c5a2

public class LP1_Strings {

    public static void main(String[] args) {

        String str = "aaabcccccaa";
        String output = "";
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {

            char ch = str.charAt(i);
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                output = output + ch + count;
                count = 1;
            }
        }

        output = output + str.charAt(str.length() - 1) + count;
        System.out.println(output);
    }
}
