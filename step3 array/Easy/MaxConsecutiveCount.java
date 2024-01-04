
public class MaxConsecutiveCount {

    public static void main(String[] args) {
        maxConsecutiveCount(new int[] { 1, 0, 1, 1, 0, 1, 1, 1, 1 });
    }

    private static void maxConsecutiveCount(int[] is) {
        // begin with assuming we have no 1's
        int count = 0;
        int prevCount = 0;
        for (int i : is) {
            if (i == 1) {
                count++;
            } else {
                prevCount = Math.max(count, prevCount);
                count = 0;
            }
        }
        System.out.println(prevCount > count ? prevCount : count);
    }
}
