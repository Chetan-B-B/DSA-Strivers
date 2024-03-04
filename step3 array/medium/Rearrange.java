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
        System.out.println(Arrays.toString(rearrangeUnequalArray(new int[] { 1, 2, -4, -5, 3, 4 })));
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

    public int[] rearrangeArray(int[] arr) {
        int newArr[] = new int[arr.length];
        int posIdx = 0;
        int negIdx = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                newArr[posIdx] = arr[i];
                posIdx += 2;
            } else {
                newArr[negIdx] = arr[i];
                negIdx += 2;
            }
        }
        return newArr;
    }

    public static int[] rearrangeUnequalArray(int[] nums) {
        // problem is when both pos and neg are not equal
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0)
                pos.add(nums[i]);
            else
                neg.add(nums[i]);
        }
        // Now we have all positives and negatives seperated.

        if (pos.size() > neg.size()) {
            // first add all the equal numbers of pos and neg to array
            for (int j = 0; j < neg.size(); j++) {
                nums[2 * j] = pos.get(j);
                nums[2 * j + 1] = neg.get(j);
            }
            int index = 2 * neg.size(); // index of orignal array to continue.
            for (int k = neg.size(); k < pos.size(); k++) {
                nums[index++] = pos.get(k);
            }

        } else {
            for (int i = 0; i < pos.size(); i++) {
                nums[2 * i] = pos.get(i);
                nums[2 * i + 1] = neg.get(i);
            }
            int index = 2 * pos.size();
            for (int i = pos.size(); i < neg.size(); i++) {
                nums[index++] = neg.get(i);
            }
        }

        return nums;
    }

}
// [1,-2,4,-5, 9]
// [1,4,9]
// -2,-5
