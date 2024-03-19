import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        longestConsecutiveSequence(new int[] { 3, 8, 5, 7, 6 });
        // o/p should be 4 viz longest consecutive subsequence is 1, 2, 3, and 4.
    }

    static void longestConsecutiveSequence(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        // 1,2,3,4,100,200
        // 3,5,6,7,8
        int max = 0;
        int prevMax = 0;
        for (int i = 1; i <= n - 1; i++) {
            // [1, 2, 0, 1] to handle cases like this
            if (nums[i] == nums[i - 1])
                continue;
            if (nums[i] == nums[i - 1] + 1) {
                max += 1;
            } else {
                prevMax = Math.max(prevMax, max);
                max = 0;
            }
        }
        // + 1 to include the number example 1,2,3,4 , +1 is added to count 1
        System.out.println(prevMax > max ? prevMax + 1 : max + 1);
    }

}
