// create following pattren
// A
// A B
// A B C
// A B C D
// A B C D E
public class pattren15 {

    static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
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
