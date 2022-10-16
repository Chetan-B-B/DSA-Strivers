// create following pattren
//       *
//      * *
//     * * *
//    * * * *
//    * * * *
//     * * *
//      * *
//       *
class pattren10 {
    void printPattren(int length) {
        for (int i = 1; i <= length; i++) {// this for loop for row
            // Following for loops are for Columns
            // For loop for spaces
            for (int j = length; j > i; j--) {
                System.out.print(" ");
            }
            // for loop for first half of pattren
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int a = 1; a <= length; a++) {
            for (int m = 1; m < a; m++) {
                System.out.print(" ");
            }
            // for loop for first half of pattren
            for (int n = length; n >= a; n--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattren10 p2 = new pattren10();
        p2.printPattren(5);
    }
}

// o/p: got same output