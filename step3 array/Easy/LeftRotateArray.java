// https://takeuforward.org/data-structure/left-rotate-the-array-by-one/

import java.util.Arrays;

public class LeftRotateArray {

    public static void rotate(int[] nums, int k) {
        // It invloves 3 sorts
        // step 1: sort second half
        int i, j;
        int n = nums.length;
        if (n == 0)
            return;
        k = k % n;
        if (k > n)
            return;
        for (i = n - k, j = n - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        System.out.println(Arrays.toString(nums));

        // sort first half
        for (i = 0, j = n - k - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        System.out.println(Arrays.toString(nums));

        // sort again
        for (i = 0, j = n - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }

    // here we don't need the guards
    public void rotate2(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    public static void main(String[] args) {
        rotate(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3);
        // result should look like this {7,6,5,4 ,3,2,1}
    }
}
