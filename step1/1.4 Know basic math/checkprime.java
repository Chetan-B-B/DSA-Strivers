// 1 is not a prime number

public class checkprime {
    public static void main(String[] args) {
        System.out.println(checkprime2(2));

    }

    // Fails for input 5 .
    // private static String checkprime2(int num) {
    // if (num <= 0)
    // return "NO";
    // if (num == 1 || num == 2)
    // return "Yes";
    // for (int i = 2; i <= 5; i++) {
    // if (num % i == 0) {
    // return "NO";
    // }
    // }
    // return "YEs";
    // }
    private static String checkprime2(int num) {
        if (num <= 1)
            return "NO";
        // if (num == 1 || num == 2)
        // return "Yes";
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return "NO";
        }
        return "Yes";
    }
}
