// create following pattren
// * * * * * * * * *
//  * * * * * * *
//    * * * * *
//     * * *
//       *

public class pattren8 {
    public void printPattren(int n) {
        for (int i = 1; i <= n; i++) {// this for loop for row
            // Following for loops are for Columns
            // For loop for spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // for loop for first half of pattren
            for (int k = n; k >= i; k--) {
                System.out.print("*");
            }

            // for loop for remaining pattren
            for (int l = n; l > i; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattren8 p2 = new pattren8();
        p2.printPattren(5);
    }
}

// o/p: got same output