// create following pattren
// 1
// 0 1 
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

public class pattren12 {

    static void printPattren2(int length) {
        String beforeElem = "";
        int k = 1;
        for (int i = 1; i <= length; i++) {
            // System.out.println("beforeElem" + " " + beforeElem);
            if (i % 2 == 0) {
                k = 0;
            } else {
                k = 1;
            }
            System.out.println(k + " " + beforeElem);
            // update before element
            beforeElem = k + " " + beforeElem;
        }
    }

    public static void main(String[] args) {
        printPattren2(5);
    }
}
