public class Sqrt {

    static int findSqrt(int x) {
        // Idea: any Sqrt(x) exits between 2 and x/2 (inclusive). Also we will find
        // untill ,n*n
        // <=x. where n is an integer
        long ans;
        if (x < 2) {
            return x;
        }
        // binary Search,
        int left = 2, right = x / 2, mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            ans = (long) mid * mid;
            if (ans > x)
                right = mid - 1;
            else if (ans < x) {
                left = mid + 1;
            } else
                return mid;
        }
        return right;
    }

    public static void main(String[] args) {
        System.out.println(findSqrt(4));
    }

}
