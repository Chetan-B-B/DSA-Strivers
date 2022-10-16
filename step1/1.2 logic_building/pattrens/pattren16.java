// create following pattren
// A B C D E
// A B C D
// A B C
// A B
// A
public class pattren16 {

    static void printTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            char a = 'A';
            for (int j = 1; j <= i; j++) {

                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(5);
    }
}
