// check the image in this folder for the pattren
public class pattren22 {

    // This approach works only for n=4 for rest it fails
    // static void printTriangle(int n) {
    // printTop(n);
    // printBottom(n);

    // }

    // private static void printTop(int n) {
    // for (int i = 1; i <= n - 2; i++) {
    // for (int j = n - 2; j >= i; j--) {
    // System.out.print("*");
    // }
    // // for printing spaces
    // for (int k = 2; k <= i; k++) {
    // System.out.print(" ");
    // }
    // // for printing spaces
    // for (int k = 2; k <= i; k++) {
    // System.out.print(" ");
    // }
    // for (int j = n - 2; j >= i; j--) {
    // System.out.print("*");
    // }

    // System.out.println();
    // }
    // }

    // private static void printBottom(int n) {
    // for (int i = 1; i <= n - 2; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // // for printing spaces
    // for (int k = n - 2; k > i; k--) {
    // System.out.print(" ");
    // }
    // // for printing spaces
    // for (int k = n - 2; k > i; k--) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }

    // System.out.println();
    // }
    // }

    public static void main(String[] args) {
        printTriangle2(1);
        printTriangle2(2);
        printTriangle2(3);
        printTriangle2(4);
        printTriangle2(5);
    }

    private static void printTriangle2(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {

                System.out.print("*");
                for (int k = 2; k <= n - 1; k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
