// concept if we used int reverse =0 ; Then during reverse during last step while appending 1 to 964632435, The result will be out of int so long value will be converted to int (Which will cause loss few bits in order to convert from long to int —> Concept of Narrowing). 
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