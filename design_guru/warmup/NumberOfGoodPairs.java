// Problem Statement
// Given an array of integers nums, return the number of good pairs.

// A pair (i, j) is called good if nums[i] == nums[j] and i < j.

// Example 1:

// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs, here are the indices: (0,3), (0,4), (3,4), (2,5).

public class NumberOfGoodPairs {

    static int findNumberOfGoodPairs(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ans++;
                }
            }
        }
        return ans;

    }

    // Its like a handshare problem for like ppl
    static int findNumberOfGoodPairsGood(int[] arr) {
        // in leetcode constrint is given as
        // 1 <= nums.length <= 100
        // 1 <= nums[i] <= 100
        int ans = 0;
        int[] store = new int[101]; // since we have 0 to 100 so 101
        for (int a : arr) {
            ans += store[a]++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findNumberOfGoodPairs(new int[] { 1, 1, 1, 1 }));
        System.out.println(findNumberOfGoodPairsGood(new int[] { 1, 1, 1, 1 }));
    }
}
