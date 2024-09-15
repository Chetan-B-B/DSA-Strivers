// Find Non-Duplicate Number Instances (easy)
// Problem Statement
// Given an array of sorted numbers, move all non-duplicate number instances at the beginning of the array in-place. The non-duplicate numbers should be sorted and you should not use any extra space so that the solution has constant space complexity i.e., .

// Move all the unique number instances at the beginning of the array and after moving return the length of the subarray that has no duplicate in it.

// Example 1:

// Input: [2, 3, 3, 3, 6, 9, 9]
// Output: 4
// Explanation: The first four elements after moving element will be [2, 3, 6, 9].

import java.util.Arrays;

public class MoveNonDuplicates {

    static void HeyMoveNonDuplicates(int[] arr) {
        int nextNonDuplicate = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[nextNonDuplicate - 1] != arr[i]) {
                arr[nextNonDuplicate] = arr[i];
                nextNonDuplicate++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        HeyMoveNonDuplicates(new int[] { 2, 3, 3, 3, 6, 9, 9 });
    }

}
