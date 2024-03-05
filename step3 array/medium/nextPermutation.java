// https://takeuforward.org/data-structure/next_permutation-find-next-lexicographically-greater-permutation/

import java.util.Arrays;
import java.util.Collections;

public class nextPermutation {
    public static void main(String[] args) {
        bruteforce(new int[] { 2, 1, 3 });
    }

    public static void bruteforce(int[] nums) {
        // sort them in smallest to largest
        int[] arr = nums.clone();
        Arrays.sort(nums);
        System.out.println(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j)
                    break;
                System.out.print(nums[i] + " " + nums[j] + " ");
            }
            System.out.println();
        }
    }
}
