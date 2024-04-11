import java.util.*;

class CountSubArraySum {
    public static int subarraySum(int[] arr, int k) {
        int n = arr.length; // size of the given array.
        Map<Integer, Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;

        mpp.put(0, 1); // Setting 0 in the map.
        for (int i = 0; i < n; i++) {
            // add current element to prefix Sum:
            preSum += arr[i];

            // Calculate x-k:
            int remove = preSum - k;

            // Add the number of subarrays to be removed:
            cnt += mpp.getOrDefault(remove, 0);

            // Update the count of prefix sum
            // in the map.
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        System.out.println(mpp);
        return cnt;

    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[] { 3, 1, 2, 4 }, 12));
    }
}