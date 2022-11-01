
public class checkpalindrome {
    public static void main(String[] args) {
        System.out.println(checkpalindrome21(121));
        System.out.println(checkpalindrome2(121));
    }

    // approach 1 : create a reverse value of x and check there are equal or not
    private static boolean checkpalindrome21(int x) {
        boolean isPalindrome = false;
        int original = x;
        int reverse = 0;
        while (x != 0) {
            int bit = x % 10;
            reverse = reverse * 10 + bit;
            x /= 10;
        }
        System.out.println(reverse);
        return reverse == original ? true : isPalindrome;
    }

    private static boolean checkpalindrome2(int x) {
        if (x < 0)
            return false;
        boolean isPalindrome = true;

        String intString = Integer.toString(x);
        int len = intString.length();
        for (int i = 0, j = len - 1; i < len / 2; i++, j--) {
            if (intString.charAt(i) != intString.charAt(j))
                return false;
        }
        ;

        return isPalindrome;
    }
}
