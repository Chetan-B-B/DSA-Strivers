// create following pattren
//   A
//  ABA
// ABCBA
//ABCDCBA
public class pattren18 {

    static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            char ch1 = 'A';

            for (int k = n - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print(ch1);
                ch1++;
            }

            ch1 = (char) (ch1 - 2);

            for (char a = ch1; a >= 'A'; a--) {
                System.out.print(a);
            }

            // for(char c = ch1)
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(4);
        // for (char a = 'D'; a >= 'A'; a--) {
        // System.out.println(a);
        // }
    }
}
