import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {

        setMatrixWithZero(new int[][] { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } });
        SetMatrixZeroBetter.setMatrixWithZeroBetter(new int[][] {
                { 0, 1, 2, 0 },
                { 3, 4, 5, 2 },
                { 1, 3, 1, 5 } });
    }

    static void setMatrixWithZero(int[][] nums) {
        // brute forece
        int m = nums.length;// rows
        int n = nums[0].length; // colums These 2 piece of info provided int constarints section of leetcode.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i][j] == 0) {
                    // update rows and colums with -1 , bcz if we do update with 0 all our array
                    // elements converts to zero.
                    updateRow(i, n, nums);
                    updateColumn(j, m, nums);
                }
            }
        }
        // convert -1 to zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i][j] == -1) {
                    nums[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(nums));
    }

    static void updateRow(int idx, int col, int[][] nums) {
        for (int i = 0; i < col; i++) {
            if (nums[idx][i] != 0) // need to avoid collision, if same row/col has 2 zero ,in first interation only
                                   // we will make everthing -1 to avoid it we need the check
                nums[idx][i] = -1;
        }
    }

    static void updateColumn(int idx, int row, int[][] nums) {
        for (int j = 0; j < row; j++) {
            if (nums[j][idx] != 0) // need to avoid collision
                nums[j][idx] = -1;
        }
    }
}

class SetMatrixZeroBetter {
    static void setMatrixWithZeroBetter(int[][] nums) {
        int rows = nums.length;
        int cols = nums[0].length;
        int[] rowsBasket = new int[rows];
        int[] colsBasket = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (nums[i][j] == 0) {
                    rowsBasket[i] = 1;
                    colsBasket[j] = 1;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowsBasket[i] == 1 || colsBasket[j] == 1) {
                    nums[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(nums));
    }
}