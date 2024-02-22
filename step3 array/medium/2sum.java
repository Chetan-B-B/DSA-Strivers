// Check if a pair with given sum exists in Array
// Problem Statement: Given an array of integers arr[] and an integer target.

// 1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.

// 2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.

import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {
        // I will do 2nd varient alone here.
        findTwoSumA1(new int[] { 2, 6, 5, 8, 11 }, 14);
        findTwoSumA2(new int[] { 2, 6, 5, 8, 11 }, 14);

    }

    private static void findTwoSumA1(int[] nums, int target) {
        // TODO Auto-generated method stub

        int n = nums.length;
        int[] result = { -1, -1 };
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((nums[i] + nums[j] == target)) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        for (int a : result)
            System.out.println(a);

    }

    private static void findTwoSumA2(int[] nums, int target) {
        // better approach with Hashing

        int[] result = { -1, -1 };
        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int reminder = target - nums[i];
            if (myHashMap.containsKey(reminder)) {
                result[0] = myHashMap.get(reminder);
                result[1] = i;
            }
            myHashMap.put(nums[i], i);
        }
        for (int a : result)
            System.out.println(a);

    }
}
