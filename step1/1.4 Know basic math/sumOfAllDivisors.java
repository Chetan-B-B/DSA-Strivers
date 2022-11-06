public class sumOfAllDivisors {
    static long sumOfDivisors(int N) {
        // code here
        long total = 0;
        for (int i = 1; i <= N; i++) {
            // find divisor for i
            long sum = 0;

            for (int j = 1; j <= (int) Math.sqrt(i); j++) {
                if (i % j == 0) {
                    // System.out.println(j);
                    sum += j;
                    if ((i / j) != j) {
                        // System.out.println(i / j);
                        sum = sum + (i / j);
                    }
                }
            }
            total += sum;
        }
        System.out.println(total);
        return total;
    }

    public static void main(String[] args) {
        sumOfDivisors(77976);
        sumOfDivisors2(77976);
    }

    // More optimised
    // Hint: Try to do it in a single loop and think about how many times a number
    // can be a divisor
    // explaination
    // https://www.notion.so/Programming-shortcuts-f5eb6c3c94a84b2786029ef6ed0ca096#a746d6dc7b394946b959964030092880
    private static long sumOfDivisors2(int n) {
        long total = 0;

        for (int i = 1; i <= n; i++) {
            // find number of time i can be divisor of n
            long repeatation = (n / i);
            total += (repeatation * i);
        }
        System.out.println(total);
        return total;
    }
}
