// https://takeuforward.org/data-structure/move-all-zeros-to-the-end-of-the-array/

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        // moveZeroToEnd2(new int[] { 0, 1, 0, 3, 12 });
        moveZeroToEnd(new int[] { 1, 1, 1, 0 });
    }

    private static void moveZeroToEnd(int[] nums) {
        int n = nums.length;
        int i = -1;
        // find the first place of the zero element
        for (int j = 0; j < n; j++) {
            if (nums[j] == 0) {
                i = j;
                break;
            }
        }
        // no zero in the array
        if (i == -1)
            return;
        // j should start from i+1
        for (int j = i + 1; j < n; j++) {
            if (nums[j] != 0) {
                nums[i++] = nums[j];
                nums[j] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));

    }

    private static void moveZeroToEnd2(int[] nums) {
        int newArray[] = new int[nums.length];
        int i = 0;
        for (int a : nums) {
            if (a != 0) {
                newArray[i++] = a;
            }
        }
        nums = newArray;
        System.out.println(Arrays.toString(nums));
    }

    // nice
    private static void moveZeroToEnd3(int[] nums) {

        int i = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }

        while (i <= nums.length - 1) {
            nums[i] = 0;
            i++;
        }

    }
}
