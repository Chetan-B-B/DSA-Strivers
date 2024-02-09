// https://takeuforward.org/data-structure/longest-subarray-with-given-sum-k/
public class LongestSubArrayWithK {

    static void longestSubtArray(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int longestLength = 0;

        for (int i = 0, j = 1; j < n; j++, i++) {
            sum += (nums[i] + nums[j]);
            if (sum == k) {
                // +1 since i start at zero
                longestLength = Math.max(longestLength, (j + (i + 1)));
                sum = 0;
            }
        }
        System.out.println(longestLength);
    }

    public static void main(String[] args) {
        longestSubtArray(new int[] { 2, 3, 5, 1, 9 }, 10);
    }
}
