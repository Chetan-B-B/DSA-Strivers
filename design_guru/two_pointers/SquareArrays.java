// Solution: Squaring a Sorted Array
// Problem Statement
// Given a sorted array, create a new array containing squares of all the numbers of the input array in the sorted order.

// Example 1:

// Input: [-2, -1, 0, 2, 3]
// Output: [0, 1, 4, 4, 9]
// Example 2:

// Input: [-3, -1, 0, 1, 2]
// Output: [0, 1, 1, 4, 9]

import java.util.*;

public class SquareArrays {

    static void naiveSqaureArrays(int[] arr) {
        int i = 0;
        for (int a : arr) {
            arr[i++] = a * a;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void usingTwoPointers(int[] nums) {
        int[] squares = new int[nums.length];
        int highestIdx = nums.length - 1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare >= rightSquare) {
                squares[highestIdx--] = leftSquare;
                left++;

            } else {
                squares[highestIdx--] = rightSquare;
                right--;
            }

        }
        System.out.println(Arrays.toString(squares));

    }

    public static void main(String[] args) {
        naiveSqaureArrays(new int[] { -2, -1, 0, 2, 3 });
        usingTwoPointers(new int[] { -2, -1, 0, 2, 3 });
    }
}
