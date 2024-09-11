// Problem Statement
// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

// Example 1:

// Input: sentence = "A man, a plan, a canal, Panama!"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.

public class validPalindrome {

    static boolean isValidPalindrome(String s) {
        // remove invalid chars

        System.out.println(s);
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        System.out.println(s);
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidPalindrome("Was it a car or a bat I saw?"));
    }
}
