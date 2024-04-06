// https://takeuforward.org/data-structure/longest-subarray-with-given-sum-k/
// This is an optimal Solution, refer link or notes for other approaches.

import java.util.HashMap;

public class LongestSubArrayWithK {

    static void longestSubtArray(int[] nums, int k) {
        // optimal for only +ive elements
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
        System.out.println(maxLen);

    }

    static void longestSubtArrayBetter(int[] nums, int k) {
        // Optimal approach for both negative and pos elements
        // Better approach if only have positives
        int maxLen = 0, sum = 0;
        HashMap<Integer, Integer> presumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k)
                maxLen = Math.max(maxLen, i + 1);

            int rem = sum - k;
            if (presumMap.containsKey(rem)) {
                int len = i - presumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!presumMap.containsKey(rem)) {
                presumMap.put(rem, i);
            }
        }
        System.out.println(presumMap);
        System.out.println(maxLen);
    }

    public static void main(String[] args) {
        longestSubtArray(new int[] { 2, 3, 5, 1, 9 }, 10);
        longestSubtArrayBetter(new int[] { 2, 3, 5, 1, 9 }, 10);
    }
}
