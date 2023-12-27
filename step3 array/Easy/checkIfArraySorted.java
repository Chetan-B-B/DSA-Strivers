// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

//Sorted and rotated
// -> Input [ 3, 4, 5, 1, 2] , true
// -> Input [2,1,3,4], false
// -> nums = [1,2,3] , true
/****
 * count = nums[i] > nums[i+1] i.e. number is greater than its right.
 * Find count.
 * -- In case of sorted array there will be 0 counts.
 * [1,2,3,4,5]
 * -- In case of rotated sorted array there will be 1 count.
 * [3,4,5,1,2]
 * -- In other cases like [2,1,3,4] counts > 1 ==> 2
 * 
 * How to count 4 > 2, in that case we need nums[i] > nums[(i+1)%len]
 * 
 *****/
public class checkIfArraySorted {
    public static void main(String[] args) {
        int nums[] = { 3, 4, 5, 1, 2 };
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;

            }
        }
        if (count == 0) {
            System.out.println(true);
        }
        if (count == 1 && nums[0] >= nums[nums.length - 1])
            System.out.println(true);
        System.out.println(false);

    }
}
