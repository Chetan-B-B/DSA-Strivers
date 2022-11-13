public class factorial {
    public static void main(String[] args) {
        factorialOfnumber(5);
        System.out.println(factUsingRecurssion(5));
    }

    static void factorialOfnumber(long num) {
        long initalize = 1;
        for (long i = 1; i <= num; i++) {
            initalize = initalize * i;
            System.out.println(initalize);
        }
    }

    static long factUsingRecurssion(long num) {
        if (num == 1)
            return 1;
        return num * factUsingRecurssion(num - 1);

    }
}
