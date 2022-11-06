// An efficient solution is based on the below formula for LCM of two numbers ‘a’ and ‘b’. 

//    a x b = LCM(a, b) * GCD (a, b)

//    LCM(a, b) = (a x b) / GCD(a, b)

public class lcmandhcf {

    public static void main(String[] args) {
        System.out.println(lcm(15, 20));
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    private static int lcm(int i, int j) {

        // 1. find gcd and then use above formule
        System.err.println(gcd(i, j));
        return ((i * j) / gcd(i, j));
    }
}
