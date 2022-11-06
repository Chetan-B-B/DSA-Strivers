//divisors of a number == factors of a number 

// for( int i = 1; i * i <= num; i++ ){
/* upto sqrt is because every divisor after sqrt
    is also found when the number is divided by i.
   EXAMPLE like if number is 90 when it is divided by 5
    then you can also see that 90/5 = 18
    where 18 also divides the number.
   But when number is a perfect square
    then num / i == i therefore only i is the factor
}*/
public class getalldivisors {
    public static void main(String[] args) {

        int number = 2;
        // usual way
        // for (int i = 1; i <= number; i++) {
        // if (number % i == 0) {
        // System.out.println(i);
        // }
        // }
        // get all divisors
        for (int i = 1; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(i);
                if ((number / i) != i)
                    System.out.println((number / i));
            }
        }
    }
}
