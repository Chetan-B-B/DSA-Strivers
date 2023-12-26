
import java.util.*;

public class LargestElement {

    public static void main(String[] args) {
        int arr[] = { 12, 2, 3, 2, 2, 222, 43, 2, 1 };
        // nlogn
        // Arrays.sort(arr);
        // System.out.println(arr[arr.length - 1]);

        // o(n)
        int large = 12;
        for (int x : arr) {
            if (x > large) {
                large = x;
            }
        }
        System.out.println(large);
    }
}
