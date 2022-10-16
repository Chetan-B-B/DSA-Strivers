// check the image in this folder for the pattren
public class pattren20 {

    static void printTriangle(int n) {
        printTop(n);
        printBottom(n);

    }

    private static void printTop(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            // for printing spaces
            for (int k = 2; k <= i; k++) {
                System.out.print(" ");
            }
            // for printing spaces
            for (int k = 2; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    private static void printBottom(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for printing spaces
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            // for printing spaces
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // printTriangle(5);
        printTriangle(4);
        // printTriangle(3);
        // printTriangle(2);
    }
}
