// Subarrays with Product Less than a Target 

// Given an array with positive numbers and a positive target number, find all of its contiguous subarrays whose product is less than the target number.

// Example 1:

// Input: [2, 5, 3, 10], target=30                                              
// Output: [2], [5], [2, 5], [3], [5, 3], [10]                           
// Explanation: There are six contiguous subarrays whose product is less than the target.

import java.util.*;;

public class Tripletsproduct {

    static void tripletsProductWrong(int[] arr, int target) {
        // ! THis is wrong bcz we are considering the only window (imagine) size of 2
        // ! tripletsProduct(new int[] { 10, 5, 2, 6 }, 100); {5,2,6} is valid which is
        // of length 3
        int left = 0;
        int right = 1;
        Set<List<Integer>> set = new HashSet<>();
        while (right < arr.length) {
            if ((arr[right] * arr[left]) < target) {
                set.add(Arrays.asList(arr[right], arr[left]));

            }
            if (arr[left] < target) {
                set.add(Arrays.asList(arr[left]));
            }
            if (arr[right] < target) {
                set.add(Arrays.asList(arr[right]));
            }

            left++;
            right++;

        }

        printListOfList(set);

    }

    static int tripletsProduct(int[] arr, int taregt) {
        // sliding window
        int left = 0;
        int right = 0;
        int product = 1;
        int res = 0;
        while (right < arr.length) {

            product *= arr[right];

            // make window valid before procedding
            while (left <= right && product >= taregt) {
                product /= arr[left];
                left++;

            }

            res += (right - left) + 1;
            System.out.println(res);
            right++;

            // check valid window

        }
        System.out.println(res);

        return res;
    }

    static void printListOfList(Set<List<Integer>> result) {
        for (List<Integer> it : result) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + ",");
            }
            System.out.print("] ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // tripletsProductWrong(new int[] { 10, 5, 2, 6 }, 100);
        tripletsProduct(new int[] { 10, 5, 2, 6 }, 100);
    }

}
