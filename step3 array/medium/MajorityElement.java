//https://takeuforward.org/data-structure/find-the-majority-element-that-occurs-more-than-n-2-times/

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {

        findMajorityElement(new int[] { 1, 1, 1, 1, 2, 2, 2 });
        findMajorityElement2(new int[] { 1, 1, 1, 1, 2, 2, 2 });
        findMajorityElement3(new int[] { 1, 1, 1, 1, 2, 2, 2 });
    }

    public static void findMajorityElement(int[] nums) {
        // Brute force approach
        int n = nums.length - 1;
        int maxElement = 0;
        int maxLength = n / 2;
        for (int i = 0; i < n; i++) {
            int target = nums[i];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == target)
                    count++;
            }
            if (count > maxLength)
                maxElement = target;
        }
        System.out.println(maxElement);
    }

    public static void findMajorityElement2(int[] nums) {
        // better approach
        int n = nums.length - 1;
        HashMap<Integer, Integer> mapp = new HashMap<>();
        for (int a : nums) {
            mapp.put(a, mapp.getOrDefault(a, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> it : mapp.entrySet()) {
            if (it.getValue() > (n / 2))
                System.out.println(it.getKey());
        }
    }

    public static void findMajorityElement3(int[] nums) {
        // best approach - MOore's voting algorithm
        int n = nums.length - 1;
        int element = 0;
        int cnt = 0;
        for (int a : nums) {
            if (cnt == 0) {
                cnt = 1;
                element = a;
            } else if (a == element)
                cnt++;
            else
                cnt--;
        }
        // just in case if we don't have any Majority elements
        int cnt_2 = 0;
        for (int a : nums) {
            if (a == element)
                cnt_2++;
        }
        if (cnt_2 > (n / 2))
            System.out.println(element);
    }

}
