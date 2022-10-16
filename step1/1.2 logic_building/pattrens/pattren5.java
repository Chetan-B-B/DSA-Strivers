// create following pattren
// *****
// ****
// ***
// **
// *

public class pattren5 {
    void printPattren(int length) {
        for (int i = length; i > 0; i--) {
            System.out.println("* ".repeat(i));
        }
    }

    void pattrenUsingRowsandColumns(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = length; j >= i; j--) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattren5 p2 = new pattren5();
        p2.printPattren(5);
        p2.pattrenUsingRowsandColumns(5);
    }
}

// o/p: got same output