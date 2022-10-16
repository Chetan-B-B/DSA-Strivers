// create following pattren
//       *
//     * * *
//    * * * * *
//  * * * * * * *
// * * * * * * * * *
public class pattren7 {
    public void printPattren(int length) {
        for (int i = 1; i <= length; i++) {// this for loop for row
            // Following for loops are for Columns
            // For loop for spaces
            for (int j = length; j > i; j--) {
                System.out.print(" ");
            }
            // for loop for first half of pattren
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // for loop for remaining pattren
            for (int l = 2; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattren7 p2 = new pattren7();
        p2.printPattren(5);
    }
}

// o/p: got same output