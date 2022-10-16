// create following pattren
// 1      1
// 12    21
// 123  321
// 12344321

// Solution Imagine it as 
// 1******1
// 12****21
// 123**321
// 12344321

class Solution {

    void printTriangle(int n) {

        for (int i = 1; i <= n; i++)

        {

            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");
            }

            for (int k = 0; k < 2 * n - 2 * i; k++) {

                System.out.print("  ");
            }

            for (int l = i; l > 0; l--) {

                System.out.print(l + " ");
            }

            System.out.println();

        }

        // code here
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        s1.printTriangle(5);
    }
}