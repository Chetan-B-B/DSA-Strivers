// create following pattren
// A
// B B
// C C C
// D D D D
// E E E E E
public class pattren17 {

    static void printTriangle(int n) {
        char a = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(a + " ");
            }
            a++;
            System.out.println();
        }
    }

    static void printTriangle2(int n) {
        char a = 'A';
        for (int i = 1; i <= n; i++) {
            // () are important otherwise .repeat only repeat ""
            System.out.println((a + "").repeat(i));
            a++;
        }
    }

    public static void main(String[] args) {
        // printTriangle(5);
        printTriangle2(5);
    }
}
