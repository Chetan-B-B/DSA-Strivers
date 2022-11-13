import java.util.Arrays;

//GIven =[1,2,3]
//return [3,2,1]

public class reverseAarray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(recursiveSwapOfArray(a, 0, a.length - 1)));

    }

    private static int[] recursiveSwapOfArray(int[] arr, int startIdx, int lastIdx) {

        if (startIdx > lastIdx)
            return arr;
        int temp = arr[startIdx];
        arr[startIdx] = arr[lastIdx];
        arr[lastIdx] = temp;

        return recursiveSwapOfArray(arr, startIdx + 1, lastIdx - 1);
    }
}
