public class singleNumber {
    static void FindSingleNumber(int[] arr) {
        // optimal , for more :
        // https://takeuforward.org/arrays/find-the-number-that-appears-once-and-the-other-numbers-twice/
        int xor = 0;
        for (int a : arr) {
            xor ^= a;
            System.out.println(xor);
        }
    }

    public static void main(String[] args) {
        FindSingleNumber(new int[] { 4, 1, 1 });
    }

}
