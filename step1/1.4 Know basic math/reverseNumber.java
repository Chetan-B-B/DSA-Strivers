
class reversenumber {
    public static void main(String[] args) {
        reversenumber s = new reversenumber();
        System.out.println(s.reverse(1534236469));
    }

    public int reverse(int x) {

        int a = x;
        long reverse = 0;// This is important
        if (x < 0)
            x *= -1;
        while (x > 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)
                return 0;
        }
        if (a < 0) {
            reverse *= -1;
        }

        return (int) reverse;
    }
}