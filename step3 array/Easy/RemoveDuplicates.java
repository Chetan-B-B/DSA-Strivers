// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Remove Duplicates from the array and make changes to same array(in-place Algorithm)

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        // int i = arr[0], j = arr[0];
        // System.out.println(i + " " + j);
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println(i + 1); // size of the array wirthout duplicates
        System.out.println(Arrays.toString(arr));

    }
}
