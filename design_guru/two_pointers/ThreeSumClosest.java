
// https://www.youtube.com/watch?v=uSpJQa6MRZ8&ab_channel=NikhilLohia
import java.util.*;

public class ThreeSumClosest {
    static int threeSumClosest(int[] arr, int target) {
        // idea is generate all the sub arrays but instead of o(n3) we do at 0(n2) by
        // keeping arr[i] as constent and generating all the value
        int res = 0;
        int n = arr.length;
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < n - 2; i++) {

            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < target) {
                    j++;
                } else if (sum > target) {
                    k--;
                } else {
                    return sum;
                }
                int diffToTarget = Math.abs(sum - target);
                if (diffToTarget < minDiff) {
                    res = sum;
                    minDiff = diffToTarget;
                }

            }
        }

        return res;
    }

    static void printListOfList(List<List<Integer>> result) {
        for (List<Integer> it : result) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        threeSumClosest(new int[] { -3, 0, 1, 2, -1, 1, -2 }, 3);

    }
}