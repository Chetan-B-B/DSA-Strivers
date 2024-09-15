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

    public static void main(String[] args) {
        naiveSqaureArrays(new int[] { -2, -1, 0, 2, 3 });
    }
}
