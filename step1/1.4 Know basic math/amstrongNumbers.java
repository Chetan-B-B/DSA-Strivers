//An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. 
//For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371

//Note : The following approach fails for 1634(digits > 4)(1634 is an armstrong number). This is bcz you kept base (Math.pow()) constant to 3. Base depends on the total number of digits in the given numbers.

//To find the number of digits
// Math.log10(number)+1
public class amstrongNumbers {
    public static void main(String[] args) {
        int number = 54748;
        int original = number;
        int total = 0;
        int base = (int) Math.log10(number) + 1;
        // you know how to get the individual number
        // get individual digit
        while (number > 0) {
            int digit = number % 10;
            total += Math.pow(digit, base);
            number /= 10;
        }
        if (original == total)
            System.out.println("Its a amstrong number");
        else
            System.out.println("It's not a amstrong number");
    }
}
