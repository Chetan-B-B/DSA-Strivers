// Given an array containing 0s, 1s and 2s, sort the array in-place. You should treat numbers of the array as objects, hence, we can’t count 0s, 1s, and 2s to recreate the array.

// The flag of the Netherlands consists of three colors: red, white and blue; and since our input array also consists of three different numbers that is why it is called Dutch National Flag problem.

// Example 1:

// Input: [1, 0, 2, 1, 0]
// Output: [0 0 1 1 2]

//  ? Idea: We will have 3 pointers, low, mid and high. 0 to low will have 0's, low to mid 1 and high to arr.length -1 will have 2's. but mid to high have unsorted array  and next is  sorting 

import java.util.*;

public class DutchNatioanlFlag {

    static int[] broYouKnowThisAlready(int[] arr) {

        int low = 0, mid = 0, high = arr.length - 1, temp;
        while (mid <= high) {

            if (arr[mid] == 0) {
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }

        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(broYouKnowThisAlready(new int[] { 1, 0, 2, 1, 0 })));
    }

}
