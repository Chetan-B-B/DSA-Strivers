// Problem Statement
// Given an array of unsorted numbers, find all unique triplets in it that add up to zero.

// Example 1:

// Input: [-3, 0, 1, 2, -1, 1, -2]
// Output: [[-3, 1, 2], [-2, 0, 2], [-2, 1, 1], [-1, 0, 1]]
// Explanation: There are four unique triplets whose sum is equal to zero. smallest sum.'
import java.util.*;

class TripletSumtoZero {

    static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    result.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;

                    // skip the duplicates
                    while (j < k && arr[j] == arr[j - 1])
                        j++;
                    while (j < k && arr[k] == arr[k + 1])
                        k--;
                }
            }

        }
        return result;
    }

    static List<List<Integer>> threeSumNaive(int[] arr) {
        Set<List<Integer>> sc = new HashSet<>();
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = Arrays.asList(arr[i] + arr[j] + arr[k]);
                        temp.sort(null);
                        sc.add(temp);
                    }

                }
            }

        }
        List<List<Integer>> result = new ArrayList<>(sc);

        return result;
    }

    static List<List<Integer>> threeSumBetter(int[] arr) {
        Set<List<Integer>> st = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(arr[i] + arr[j]);
                if (hashset.contains(third)) {
                    // we found the arr
                    List<Integer> temp = Arrays.asList(arr[i] + arr[j] + third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashset.add(third);

            }

        }

        return new ArrayList<>(st);
    }

    public static void main(String[] args) {
        List<List<Integer>> ans1 = threeSumNaive(new int[] { -3, 0, 1, 2, -1, 1, -2 });
        List<List<Integer>> ans2 = threeSumBetter(new int[] { -3, 0, 1, 2, -1, 1, -2 });
        System.out.println(ans1.equals(ans2));
    }
}
