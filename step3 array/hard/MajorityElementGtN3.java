import java.util.ArrayList;
import java.util.Arrays;

public class MajorityElementGtN3 {
    static void mooresVotingAlgorithm(int[] arr, int n) {
        // find the largest element repeating element using mooresVotingAlgorithm and
        // verify
        int el1 = Integer.MIN_VALUE, el2 = Integer.MAX_VALUE;
        int ct1 = 0, ct2 = 0;
        for (int a : arr) {

            if (ct1 == 0 && a != el2) {
                ct1++;
                el1 = a;
            } else if (ct2 == 0 && a != el1) {
                ct2++;
                el2 = a;
            } else if (a == el1)
                ct1++;
            else if (a == el2)
                ct2++;
            else {
                ct1--;
                ct2--;
            }
        }
        System.out.println(el1 + " " + el2);
        ArrayList<Integer> ls = new ArrayList<>();
        ct1 = 0;
        ct2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == el1)
                ct1++;
            if (arr[i] == el2)
                ct2++;
        }

        int mini = (int) (n / 3) + 1;
        if (ct1 >= mini)
            ls.add(el1);
        if (ct2 >= mini)
            ls.add(el2);

        System.out.println(Arrays.toString(ls.toArray()));
    }

    public static void main(String[] args) {
        mooresVotingAlgorithm(new int[] { 1, 2 }, 2);
    }
}