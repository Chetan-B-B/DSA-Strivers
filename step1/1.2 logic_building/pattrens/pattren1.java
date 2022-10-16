/**
 * pattren1
 * you need to print the following pattren
 */

// ******
// ******
// ******
// ******
// ******
public class pattren1 {
    void printPattren(int length) {
        // Length specifies the how long the pattren should repeat and
        // size specifies the width of the pattren
        int size = length;
        for (int i = 0; i < length; i++) {
            System.out.println("* ".repeat(size));
        }
    }

    public static void main(String[] args) {
        pattren1 p1 = new pattren1();
        p1.printPattren(5);
    }
}

// O/p:
// *****
// *****
// *****
// *****
// *****