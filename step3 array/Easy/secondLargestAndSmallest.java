// 1. if we initialize the numbers to first element in the array, it's fails when the first element in the array is large, so we need to initialise them to small number , Integer.MIN_VALUE
// 2. While using Arrays.sort(), finidng second Largest and smallest will be difficult when duplicates are present.

public class secondLargestAndSmallest {
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 3, 3, 56, 32, 11 };
        int arr[] = { 1, 10, 22, 11, 3 };
        // approach 1
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int element : arr) {
            if (element > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = element;
            } else if ((element > secondLargest) && (element != firstLargest)) {
                // if second largest is after the firstLargest in array, we need this condition.
                secondLargest = element;
            }
        }
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int element : arr) {
            if (element < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = element;
            } else if ((element < secondSmallest) && (element != firstSmallest)) {
                // if second smallest is after the firstSmallest in array, we need this
                // condition.
                secondSmallest = element;
            }
        }
        System.out.println(firstSmallest + " " + secondSmallest);
        System.out.println(firstLargest + " " + secondLargest);
    }
}
