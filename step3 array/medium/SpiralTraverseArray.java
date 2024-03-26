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

        int top = 0, right = nums[0].length - 1, left = 1, bottom = 1;
        while (left < right && top < bottom) {
            // print left
            System.out.println("not printing");
            for (int i = 0; i < cols; i++) {
                System.out.println(nums[0][left++]);
            }

        }

    }
}
