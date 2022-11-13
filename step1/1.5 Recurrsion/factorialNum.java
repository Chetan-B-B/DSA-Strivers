
//factorial numbers less than or equal to N
import java.util.ArrayList;

class factorialNum {
    public static void main(String[] args) {
        System.out.println(factorialNum2(2));
    }

    static long factorial(long num) {
        if (num == 1)
            return 1;
        return num * factorial(num - 1);
    }

    private static ArrayList<Long> factorialNum2(long N) {

        // code here
        ArrayList<Long> al = new ArrayList<Long>();
        for (long i = 1; i <= N; i++) {
            // find the factorial of i
            long factOfI = factorial(i);

            // check factorial of i < N, then add to al
            if (factOfI <= N)
                al.add(factOfI);
            else
                return al;
        }
        return al;

    }
}
