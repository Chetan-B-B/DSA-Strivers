// Problem Statement
// Given two strings containing backspaces (identified by the character ‘#’), check if the two strings are equal.

// Example 1:

// Input: str1="xy#z", str2="xzz#"
// Output: true
// Explanation: After applying backspaces the strings become "xz" and "xz" respectively.

public class BackSpaceString {

    static boolean backSpace(String str1, String str2) {
        boolean areEqual = true;
        int i = 0, j = 0;
        while (j < str1.length()) {
            if (str1.charAt(i) == '#') {

            }
            j++;
        }
        return areEqual;
    }

    public static void main(String[] args) {
        System.out.println(backSpace("xy#z", "xzz#"));
    }

}
