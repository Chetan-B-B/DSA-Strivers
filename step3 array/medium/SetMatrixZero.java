public class SetMatrixZero {
    public static void main(String[] args) {
        setMatrixWithZero(new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } });
    }

    static void setMatrixWithZero(int[][] nums) {
        // brute forece
        int m = nums.length;// rows
        int n = nums[0].length; // colums These 2 piece of info provided int constarints section of leetcode.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i][j] == 0) {

                }
            }
        }
    }
}
