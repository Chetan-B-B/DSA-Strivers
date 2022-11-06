// GCD or HCF --> Refers to Greatest common divisor or Highest common factor

//Approach used is : https://www.geeksforgeeks.org/euclidean-algorithms-basic-and-extended/

public class gcdorhcf {
    public static void main(String[] args) {
        System.out.println(gcd(15, 20));
    }

    private static int gcd(int a, int b) {

        if (a == 0)
            return b;
        System.out.println(a + " " + b);
        return gcd(b % a, a);
    }
}
