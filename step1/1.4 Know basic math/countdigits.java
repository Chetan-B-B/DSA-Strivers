/**
 * count digits
 */
public class countdigits {
    static int evenlyDivides(int N) {
        // code here
        int count = 0;
        int number = N;
        // To get last digit , --> Here we are not using this. It just for the
        // reference.

        // int digit = number % 10;
        // idea : Just divide the given number N by 10 and increment 10(10 * 10 ) till
        // length of
        // the given Number
        while (number > 0) {
            int digit = number % 10;
            if (digit != 0 && N % digit == 0)
                count++;
            number = number / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(evenlyDivides(30));
    }
}