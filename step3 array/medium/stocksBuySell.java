// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and 
// sell on day 5 (price = 6), profit = 6-1 = 5
// https://takeuforward.org/data-structure/stock-buy-and-sell/

public class stocksBuySell {
    public static void main(String[] args) {

        bruteforce(new int[] { 7, 1, 5, 3, 6, 4 });
        optimal(new int[] { 7, 1, 5, 3, 6, 4 });
    }

    public static void bruteforce(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[i])
                    max = Math.max(max, nums[j] - nums[i]);
            }
        }
        System.out.println(max);
    }

    public static void optimal(int[] nums) {
        int n = nums.length;
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int a : nums) {
            minPrice = Math.min(minPrice, a);
            maxProfit = Math.max(maxProfit, a - minPrice);
        }
        System.out.println(maxProfit);
    }

}
