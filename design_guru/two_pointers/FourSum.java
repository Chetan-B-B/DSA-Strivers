// Problem Challenge 1: Quadruple Sum to Target (medium)
// Problem Statement
// Given an array of unsorted numbers and a target number, find all unique quadruplets in it, whose sum is equal to the target number.

// Example 1:

// Input: [4, 1, 2, -1, 1, -3], target=1
// Output: [-3, -1, 1, 4], [-3, 1, 1, 2]
// Explanation: Both the quadruplets add up to the target.
// Example 2:

// Input: [2, 0, -1, 1, -2, 2], target=2
// Output: [-2, 0, 2, 2], [-1, 0, 1, 2]
// Explanation: Both the quadruplets add up to the target.

import java.util.*;

public class FourSum {

    // o(n4) is naive way

    // lets code 0(n3) and space O(2 * no. of the quadruplets)+O(N)
    static List<List<Integer>> foursumBetter(int[] arr, int target) {
        Set<List<Integer>> st = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Integer> hs = new HashSet<>();
                for (int k = j + 1; k < n; k++) {

                    int sum = arr[i] + arr[j] + arr[k];
                    int fourthVal = target - sum;
                    if (hs.contains(fourthVal)) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], fourthVal);
                        temp.sort(null);
                        st.add(temp);
                    }

                    hs.add(arr[k]);
                }
            }
        }
        printListOfList(st);
        return new ArrayList<>(st);
    }

    // o(n3 * nlogn) but removed dependency with set
    static List<List<Integer>> foursumBest(int[] arr, int target) {
        List<List<Integer>> st = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (i != 0 && arr[i] == arr[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                // given i != j != k!= l
                if (j != (i + 1) && arr[j] == arr[j - 1])
                    continue;
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = arr[i];
                    sum += arr[j];
                    sum += arr[k];
                    sum += arr[l];
                    if (sum > target) {
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        st.add(Arrays.asList(arr[i], arr[j], arr[l], arr[k]));
                        k++;
                        l--;
                        while (k < l && arr[k] == arr[k - 1]) {
                            k++;

                        }
                        while (k < l && arr[l] == arr[l + 1]) {
                            l--;
                        }
                    }
                }

            }
        }
        printListOfList(st);
        return new ArrayList<>(st);
    }

    static <T> void printListOfList(Collection<? extends List<T>> result) {
        for (List<T> it : result) {
            System.out.print("[");
            for (T element : it) {
                System.out.print(element + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // foursumBetter(new int[] { 4, 1, 2, -1, 1, -3 }, 1);
        // foursumBest(new int[] { 4, 1, 2, -1, 1, -3 }, 1);
        foursumBetter(new int[] { 1, 0, -1, 0, -2, 2 }, 0);
        foursumBest(new int[] { 1, 0, -1, 0, -2, 2 }, 0);
    }

}
