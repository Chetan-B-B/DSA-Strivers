// Given an array of numbers sorted in ascending order and a target sum, find a pair in the array whose sum is equal to the given target.

// Write a function to return the indices of the two numbers (i.e. the pair) such that they add up to the given target. If no such pair exists return [-1, -1].

// Example 1:

// Input: [1, 2, 3, 4, 6], target=6
// Output: [1, 3]
// Explanation: The numbers at index 1 and 3 add up to 6: 2+4=6

// Constraints:

// 2 <= arr.length <= 104
// -109 <= arr[i] <= 109
// -109 <= target <= 109
// Only one valid answer exists.

import java.util.Arrays;

public class TargetSum {

    static int[] findTargetSum(int[] arr, int target) {
        int[] result = { -1, -1 };
        int left = 0, right = arr.length - 1;
        int sum;
        while (left < right) {
            sum = arr[left] + arr[right];
            if (sum > target)
                right = right - 1;
            else if (sum < target)
                left = left + 1;
            else {
                result[0] = left;
                result[1] = right;
                return result;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findTargetSum(new int[] { 1, 2, 3, 4, 6 }, 6)));
        ;
    }

}
