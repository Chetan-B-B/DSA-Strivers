// https://takeuforward.org/arrays/find-the-missing-number-in-an-array/
// Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.
// Example 1:
// Input Format: N = 5, array[] = {1,2,4,5}
// Result: 3
// Explanation: In the given array, number 3 is missing. So, 3 is the answer.
public class MissingElement {
    static void missingElement(int[] arr) {
        // find sum of total numbers n*(n +1)/2
        int len = arr.length;
        // len += 1;
        int total = (len * (len + 1)) / 2;
        int givenSum = 0;

        for (int i : arr) {
            givenSum += i;
        }
        System.out.println(total - givenSum);
    }

    // https://leetcode.com/problems/missing-number/description/
    static void missingElementWithZero(int[] arr) {

    }

    public static void main(String[] args) {
        // asuming no zero's here
        // len is size of array with the missing one element
        missingElement(new int[] { 0, 1 });// 2
        // note the diff , zero
        missingElementWithZero(new int[] { 0, 1, 3 });// 2
        missingElementWithZero(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 });// 8
    }
}
