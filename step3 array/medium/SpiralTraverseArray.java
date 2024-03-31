public class SpiralTraverseArray {
    public static void main(String[] args) {
        spiralArray(new int[][] {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        });
    }

    static void spiralArray(int[][] nums) {
        int rows = nums.length;
        int cols = nums[0].length;

        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;
        while (left <= right && top <= bottom) {
            // print right
            for (int i = left; i <= right; i++) {
                System.out.println(nums[left][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++)
                System.out.println(nums[i][right]);
            right--;

        }

    }
}
