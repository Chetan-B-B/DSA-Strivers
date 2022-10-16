// create following pattren
// 1
// 22
// 333
// 4444
// 55555

public class pattren4 {
    void printPattren(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.println((Integer.toString(i) + " ").repeat(i));
        }
    }

    public static void main(String[] args) {
        pattren4 p2 = new pattren4();
        p2.printPattren(5);
    }
}

// o/p: got same output