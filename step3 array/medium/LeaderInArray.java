// https://takeuforward.org/data-structure/leaders-in-an-array/

import java.util.ArrayList;

public class LeaderInArray {
    public static void main(String[] args) {
        bruteForce(new int[] { 4, 7, 1, -1, 0 });
        // IN this case every element is the greatest
        optimalApproach(new int[] { 8, 7, 6, 5, 4, 3, 2, 1 });
    }

    static void bruteForce(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                }
            }
            if (isLeader) {
                System.out.println(arr[i]);

            }
        }
    }

    static void optimalApproach(int[] nums) {
        // { 4, 7, 1, -1, 0 }
        ArrayList<Integer> arr = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        // travel from backwards
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > max) {
                // that's a leader
                arr.add(nums[i]);
                max = nums[i];
            }
        }
        System.out.println(arr);
    }
}
