
// Triplets with Smaller Sum (medium)
// Problem Statement
// Given an array arr of unsorted numbers and a target sum, count all triplets in it such that arr[i] + arr[j] + arr[k] < target where i, j, and k are three different indices. Write a function to return the count of such triplets.

// Example 1:

// Input: [-1, 0, 2, 3], target=3 
// Output: 2
// Explanation: There are two triplets whose sum is less than the target: [-1, 0, 3], [-1, 0, 2]
// Example 2:

// Input: [-1, 4, 2, 1, 3], target=5 
// Output: 4
// Explanation: There are four triplets whose sum is less than the target: 
// [-1, 1, 4], [-1, 1, 3], [-1, 1, 2], [-1, 2, 3]
// Constraints:

// n == arr.length
// 0 <= n <= 3500
// -100 <= arr[i] <= 100
// -100 <= target <= 100

// sol is similar to threesum but to find < traget we do this.
// target - (taregt -1) =  Wrong algo
import java.util.*;

public class TripletsWithSmallerSum {

    static int threeSumSmaller(int[] arr, int target) {
        // Idea same as threesum closest
        // idea is generate all the sub arrays but instead of o(n3) we do at 0(n2) by
        // keeping arr[i] as constent and generating all the value
        int res = 0;
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {

            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum >= target)
                    k--;
                else {
                    // This is important. For current i and j, there
                    // can be total k-j third elements.
                    res += (k - j);
                    j++;

                }
            }
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {

        threeSumSmaller(new int[] { 5, 1, 3, 4, 7 }, 12);
    }

}
