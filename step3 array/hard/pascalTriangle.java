
public class pascalTriangle {
    public static long nCr(int n, int r) {
        long res = 1;

        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static int pascalTriangleUtil(int r, int c) {
        int element = (int) nCr(r - 1, c - 1);
        return element;
    }

    public static void nCrV2(int n) {
        // given n , print all the elemennt in the row n
        // v2 best way
        long res = 1;
        System.out.print(res + " ");

        // since we already printed 1 , we started col from 1
        for (int c = 1; c < n; c++) {
            res = res * (n - c);
            res = res / c;
            System.out.print(res + " ");
        }
        System.out.println();

    }

    public static void ncrV3(int n) {
        // print entire pascal triangle till n
        for (int i = 1; i <= n; i++) {
            nCrV2(i);
        }
    }

    public static void main(String[] args) {
        int r = 5; // row number
        int c = 3; // col number
        int element = pascalTriangleUtil(r, c);
        System.out.println("The element at position (r,c) is: " + element);
        nCrV2(6);
        ncrV3(6);
    }
}
