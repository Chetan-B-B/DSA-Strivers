// create following pattren
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
public class pattren14 {
    static char a;

    static void printTriangle(int n) {
        // This is a good example for pre and post increment , this method doesn't give
        // the correct answer I wanted bcz it'll start print from 0 bcz I did k++
        // basically it'll assign k value(here assign mean print ) and then it'll
        // increment.To solve this you need to change k=1 or use ++k
        int k = 0;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();

        }

    }

    static void printTriangle2(int n) {
        // This gives correct answer bcz I did ++k
        int k = 0;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(++k + " ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        printTriangle(5);
        printTriangle2(5);

        System.out.println(a + "aa");
    }
}
