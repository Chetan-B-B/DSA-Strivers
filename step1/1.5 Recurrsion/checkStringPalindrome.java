public class checkStringPalindrome {
    public static void main(String[] args) {
        String S = "abba";
        int start = 0;
        int end = S.length() - 1;
        while (start < end) {
            if (S.charAt(start) != S.charAt(end))
                System.out.println("NO");
            start++;
            end--;
        }
        System.out.println("Yes");
    }
}
