// create following pattren
// 12345
// 1234
// 123
// 12
// 1

class pattren6 {
    void printPattren(int length) {
        for (int i = length; i >= 0; i--) {// this for loop for row
            for (int j = 1; j <= i; j++) {// column
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattren6 p2 = new pattren6();
        p2.printPattren(2);
    }
}

// o/p: got same output