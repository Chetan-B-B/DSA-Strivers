// create following pattren
// *
// * * 
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

public class pattren11 {
    public void printPattren(int n) {
        for (int i = 1; i <= n; i++) {// this for loop for row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int k = n; k > 1; k--) {
            for (int l = 1; l < k; l++)
                System.out.print("* ");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattren11 p2 = new pattren11();
        p2.printPattren(5);
    }
}

// o/p: got same output