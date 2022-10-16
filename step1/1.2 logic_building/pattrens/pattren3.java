// create following pattren
// 1
// 12
// 123
// 1234
// 12345

class pattren3 {
    void printPattren(int length) {
        String beforeElem = "";
        for (int i = 1; i <= length; i++) {
            // System.out.println("beforeElem" + " " + beforeElem);
            System.out.println(beforeElem + "" + i + " ");
            // update before element
            beforeElem = beforeElem + "" + i + " ";
        }
    }

    void printPattren2(int n) {
        for (int i = 1; i <= n; i++) {
            int inital = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(inital++);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattren3 p2 = new pattren3();
        p2.printPattren(5);
        p2.printPattren2(5);
    }
}

// o/p: got same output