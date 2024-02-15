// https://takeuforward.org/data-structure/longest-subarray-with-given-sum-k/
// This is an optimal Solution, refer link or notes for other approaches.
public class LongestSubArrayWithK {

    static void longestSubtArray(int[] nums, int k) {
        int n = nums.length;
        int sum = nums[0];
        int maxLen = 0;
        int left = 0, right = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            // left <= right mean there is a subarray
            while (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }
            if (sum == k)
                maxLen = Math.max(maxLen, right - left + 1);

            // move forward
            right++;

            // needed when right is at last element and left is still away from end.
            if (right < n)
                sum += nums[right];
        }
    }

    public static void main(String[] args) {
        longestSubtArray(new int[] { 2, 3, 5, 1, 9 }, 10);
    }
}
