import java.util.Arrays;

public class RotateImageByNinety {
    public static void main(String[] args) {
        // given is a SQUARE METRIX
        // rotateImageBrute(new int[][] {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 }
        // });
        rotateImage(new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        });
    }

    public static void rotateImageBrute(int[][] nums) {
        // o/p
        // 7 4 1
        // 8 5 2
        // 9 6 3
        int[][] clone = new int[nums.length][nums[0].length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                clone[j][nums.length - i - 1] = nums[i][j];
            }
        }
        System.out.println(Arrays.deepToString(clone));
    }

    public static void rotateImage(int[][] nums) {
        // better

        // step 1: transponse array
        // 1 4 7
        // 2 5 8
        // 3 6 9
        // [0,0] -> [0,0]
        // [0,1] -> [1,0]
        // [0,2] -> [2,0]
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = nums[j][i];
                nums[j][i] = nums[i][j];
                nums[i][j] = temp;
            }
        }

        // Step 2: reverse the transposed colums
        // 7 4 1
        // 8 5 2
        // 9 6 3
        // [0,0] <->[0,2]
        // [0,1] <-> [0,1] // nothing This shows we need loop n/2
        // [1,0] <-> [1,2]

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n / 2); j++) {
                int temp = nums[i][j];
                nums[i][j] = nums[i][n - j - 1];
                nums[i][n - j - 1] = temp;
            }
        }
        System.out.println(Arrays.deepToString(nums));
    }
}
