//The Fibonacci numbers are the numbers in the following integer sequence.
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144

public class fibonacci {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {

            System.out.print(fib(i) + " ");
        }
    }

    // Gives fibonacci
    // value of`num`ex;for 6:o/p=8

    static int fib(int num) {
        if (num <= 1)
            return 1;
        return fib(num - 1) + fib(num - 2);

    }
}
