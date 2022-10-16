// create following pattren
// *
// **
// ***
// ****
// *****

public class pattren2 {
    void printPattren(int length) {
        for (int i = 0; i < length; i++) {
            System.out.println("* ".repeat(i + 1));
        }
    }

    void pattrenUsingRowsandColumns(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattren2 p2 = new pattren2();
        p2.printPattren(5);
        p2.pattrenUsingRowsandColumns(5);
    }
}

// o/p: got same output