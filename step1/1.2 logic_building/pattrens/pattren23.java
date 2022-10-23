// Java Program to print rectangular
// inner reducing pattern
// check the image in this folder for the pattren

// watch this video https://www.youtube.com/watch?v=0VtcUKIdNa0&ab_channel=KumarShubham
// How the variable top, left , bottom and right are initialized? Ans: They are the values of corresponding borders. Top is 0 because it is 0th row. Bottom is the last row hence row length - 1. Left is 0 because it is leftmost column, right is columns count - 1 because it is the rightmost column
class Pattern23 {

    // function to compute pattern
    public static void innerPattern(int n) {
        // Pattern Size
        int size = 2 * n - 1;
        int front = 0;
        int back = size - 1;
        int a[][] = new int[size][size];
        while (n != 0) {
            for (int i = front; i <= back; i++) {
                for (int j = front; j <= back; j++) {
                    if (i == front || i == back ||
                            j == front || j == back)
                        a[i][j] = n;
                }
            }
            ++front;
            --back;
            --n;
        }
        print(a, size);
    }

    // function to Print pattern
    public static void print(int a[][], int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    // Main Method
    public static void main(String[] args) {
        int n = 4; // Input
        innerPattern(n);
        // innerPattern(9);
    }
}
