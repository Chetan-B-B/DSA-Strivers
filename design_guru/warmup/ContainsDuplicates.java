// Problem Statement
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// Example 1:

// Input: nums= [1, 2, 3, 4]
// Output: false  
// Explanation: There are no duplicates in the given array.

class ContainsDuplicates {

    static void bestWay(int[] arr) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, xor = 0, sum = 0;

        for (int a : arr) {
            max = Math.max(max, a);
            min = Math.min(min, a);
            xor = xor ^ a;
        }
        System.out.println(max + " " + min);
        // find sum from min to max
        for (int i = min; i <= max; i++) {
            sum = sum ^ i;
        }
        System.out.println(xor + " " + sum + " " + (xor ^ sum));
        // https://stackoverflow.com/a/53167702/17783052
    }

    public static void main(String[] args) {
        bestWay(new int[] { 1, 3 });
    }
}