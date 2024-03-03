// Example 1:

// Input:
// arr[] = {1,2,-4,-5}, N = 4
// Output:
// 1 -4 2 -5

// Explanation: 

// Positive elements = 1,2
// Negative elements = -4,-5
// To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.

import java.util.ArrayList;
import java.util.Arrays;

public class Rearrange {
    public static void main(String[] args) {
        bruteforce(new int[] { 1, 2, -4, -5 });
    }

    public static void bruteforce(int nums[]) {
        // create a seperate arrays for pos and negative
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int n : nums) {
            if (n < 0)
                neg.add(n);
            else
                pos.add(n);
        }
        int n = nums.length;
        // for (int i = 0; i < n / 2; i++) {
        // System.out.println(pos.get(i));
        // System.out.println(neg.get(i));
        // }
        // If asked for Inplace
        // Place pos on even index and negatice on odd index
        for (int i = 0; i < n / 2; i++) {
            nums[2 * i] = pos.get(i);
            nums[2 * i + 1] = neg.get(i);
        }
        System.out.println(Arrays.toString(nums));
    }
}
