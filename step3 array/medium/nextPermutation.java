// Java program for the above approach 

import java.util.ArrayList;
import java.util.Arrays;

public class nextPermutation {
    // Function for swapping two numbers
    static void swap(int nums[], int l, int i) {
        int temp = nums[l];
        nums[l] = nums[i];
        nums[i] = temp;
    }

    // Function to find the possible
    // permutations
    static void permutations(ArrayList<int[]> res,
            int[] nums, int l, int h) {
        // Base case
        // Add the array to result and return
        if (l == h) {
            res.add(Arrays.copyOf(nums, nums.length));
            return;
        }

        // Permutations made
        for (int i = l; i <= h; i++) {
            // Swapping
            swap(nums, l, i);

            // Calling permutations for
            // next greater value of l
            permutations(res, nums, l + 1, h);

            // Backtracking
            swap(nums, l, i);
        }
    }

    // Function to get the permutations
    static ArrayList<int[]> permute(int[] nums) {
        // Declaring result variable
        ArrayList<int[]> res = new ArrayList<int[]>();
        int x = nums.length - 1;

        // Calling permutations for the first
        // time by passing l
        // as 0 and h = nums.size()-1
        permutations(res, nums, 0, x);
        return res;
    }

    // Driver Code
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        // ArrayList<int[]> res = permute(nums);

        // // printing result
        // for (int[] x : res) {
        // for (int y : x) {
        // System.out.print(y + " ");
        // }
        // System.out.println();
        // }
        permaution_better_approach(new int[] { 2, 1, 5, 4, 3, 0, 0 });
    }

    static void permaution_better_approach(int[] nums) {

        // find the increment point from last index
        // arr[i] > arr[j]
        int i = -1;
        int len = nums.length;
        for (int j = len - 2; j >= 0; j--) {
            if (nums[j] < nums[j + 1]) {
                i = j;
                break;
            }
        }
        if (i == -1) {
            // array is sorted in Descending order in that case we need to return ascending
            // order
            Arrays.sort(nums);
            System.out.println(nums);
            return;
        }
        System.err.println(i);
        // (I'm going in reverse order bcz we see the increment point so I'll find the
        // pint easily , imagine them in
        // graph plot)
        // iterate from last index to small to find the number slightly grater number.
        for (int j = len - 1; j > i; j--) {
            if (nums[j] > nums[i]) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                break;
            }
        }
        System.out.println(Arrays.toString(nums));

        // Step 3: reverse the right half
        reverseAarray(nums, i + 1, len - 1);
        System.out.println(Arrays.toString(nums));
    }

    static void reverseAarray(int[] nums, int start, int end) {
        int temp = 0;
        while (start < end) {
            temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}
