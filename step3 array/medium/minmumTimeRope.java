//https://leetcode.com/problems/minimum-time-to-make-rope-colorful/?envType=daily-question&envId=2023-12-27
public class minmumTimeRope {

    public static int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        int result = 0;
        for (int i = 1; i < n; i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                result = result + Math.min(neededTime[i], neededTime[i - 1]);
                neededTime[i] = Math.max(neededTime[i], neededTime[i - 1]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String colors = "aaabbbabbbb";
        int[] neededTime = { 3, 5, 10, 7, 5, 3, 5, 5, 4, 8, 1 };
        System.out.println(minCost(colors, neededTime));
    }
}
