// Given a 32 bit number X, reverse its binary form and print the answer in decimal.

// Example 1:

// Input:
// X = 1
// Output:
// 2147483648 
// Explanation:
// Binary of 1 in 32 bits representation-
// 00000000000000000000000000000001
// Reversing the binary form we get, 
// 10000000000000000000000000000000,
// whose decimal value is 2147483648.

public class reversedigits {

    static Long dectobintodec(Long x) {
        // 32 bits
        String bits = "00000000000000000000000000000000";
        int bitsLength = bits.length();
        String binaryString = Long.toBinaryString(x);
        // binary 32 bit representation
        String binary32bitRep = bits.substring(0, bitsLength - binaryString.length()).concat(binaryString);
        // reverse the 32 bit represenation
        String reversebinary32bitRep = new String(new StringBuffer(binary32bitRep).reverse());
        // convert back to decimal(base10) representaion
        // Note: 1.use radix =2 to convert binary to decimal and
        // radix = 10 to convert --> test this line
        // decimal to binary
        // 2. We need to use Long bcz int cannot hold the result.
        return Long.parseLong(reversebinary32bitRep, 2);
    }

    // Using shift operators
    static Long usingMath(Long X) {

        long reverse = 0;
        long remainder = 0;

        int n = 1;
        while (n <= 32) {
            remainder = X % 2;
            reverse = reverse * 2 + remainder;
            X = X / 2;
            n++;
        }
        return reverse;
    }

    static Long Approach3(Long X) {

        // User function Template for Java

        long ans = 0;
        for (int i = 32; i > 0; i--) {

            // This is like 2^n +...+2^5+2^4+2^3+2^2+2^1+2^0. we are moving one bit like
            // this faashion and when the value is returned it is converted from binary bits
            // to decimal value
            ans = ans << 1;

            // The following line i used to add one bit to the result , so when we << (left
            // shit we actually have next value). and & thsi opeator does bitwise AND . so 1
            // * 1 = 1 , 0 *1 = 0.
            ans = ans + (X & 1);

            X = X >> 1;
        }

        return ans;
    };

    public static void main(String[] args) {
        // l is used for represent long
        // System.out.println(dectobintodec(1l));
        // System.out.println(usingMath(1l));
        System.out.println(Approach3(1l));
        // System.out.println(2 & 1); --> bitwise AND

    }
}
