// create following pattren
// E
// D E
// C D E
// B C D E
// A B C D E
public class pattren19 {

    static void printTriangle(int n) {
        int m = 64;
        char a = (char) (m + n);
        for (int i = 1; i <= n; i++) {
            a = (char) (m + n);// This is the key
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a--;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(5);
    }
}
