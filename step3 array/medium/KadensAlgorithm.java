// Kadane’s Algorithm : Maximum Subarray Sum in an Array
// Problem Statement: Given an integer array arr, find the ** contiguous subarray ** (containing at least one number) which
// has the largest sum and returns its sum and prints the subarray.
// Example 1:

// Input: arr = [-2,1,-3,4,-1,2,1,-5,4] 

// Output: 6 

// Explanation: [4,-1,2,1] has the largest sum = 6. 
public class KadensAlgorithm {
    public static void main(String[] args) {
        bruteForce(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 });
        kadensAlgo(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 });
        printSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 });
    }

    public static void bruteForce(int[] nums) {
        int n = nums.length;
        int prevSum = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum > prevSum) {
                    prevSum = sum;
                }
            }
        }
        System.out.println(prevSum);
    }

    public static void kadensAlgo(int[] nums) {
        // Real Kadens Algo
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > maxi) {
                maxi = sum;
            }

            if (sum < 0) {
                sum = 0;
            }

        }
        System.out.println(maxi);

    }

    public static void printSubArray(int[] nums) {
        // using kadens algo , print the sub array
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int ansStart = -1, ansEnd = -1;
        for (int i = 0; i < nums.length; i++) {
            if (sum == 0)
                start = i;
            sum += nums[i];
            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;

            }
            if (sum < 0) {
                sum = 0;
            }

        }
        // printing the subarray:
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.print("]");

    }

}
