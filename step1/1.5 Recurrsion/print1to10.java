public class print1to10 {
    public static void main(String[] args) {
        print(10);
    }

    private static void print(int N) {
        if (N == 0)
            return;
        System.out.print(N);
        print(N - 1);// Note: Don't use N-- . Bcz it'll assign N(call print method with same value).
                     // So
        // it;ll cause same N value to print. say N=10. It'll print 10 infinite time
    }
}
