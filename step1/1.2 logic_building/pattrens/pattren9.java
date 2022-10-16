// create following pattren
//       *
//     * * *
//    * * * * *
//  * * * * * * *
// * * * * * * * * *
//  * * * * * * *
//    * * * * *
//     * * *
//       *
class pattren9 {
    void printPattren(int length) {
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
        for (int a = 1; a <= length - 1; a++) {
            for (int m = 1; m <= a; m++) {
                System.out.print(" ");
            }
            // for loop for first half of pattren
            for (int n = length - 1; n >= a; n--) {
                System.out.print("*");
            }

            // for loop for remaining pattren
            for (int o = length - 1; o > a; o--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattren9 p2 = new pattren9();
        p2.printPattren(5);
    }
}

// o/p: got same output