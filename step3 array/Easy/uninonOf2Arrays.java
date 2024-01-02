import java.util.Arrays;
import java.util.HashSet;

public class uninonOf2Arrays {
    static int[] union(int[] a1, int[] a2) {
        HashSet<Integer> h1 = new HashSet<>();
        for (int a : a1)
            h1.add(a);
        for (int a : a2)
            h1.add(a);
        int arr[] = new int[h1.size()];

        int i = 0;

        // iterating over the hashset
        for (int ele : h1) {
            arr[i++] = ele;
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(union(new int[] { 1, 2, 3, 4, 5 }, new int[] { 2, 3, 4, 4, 5 })));
    }
}
