public class shortestWordDistance {

    static int findShortestDistance(String[] arrStrings, String word1, String word2) {
        int len = Integer.MAX_VALUE;
        int i = -1, j = -1;
        for (int k = 0; k < arrStrings.length; k++) {
            if (arrStrings[k].equals(word1))
                i = k;
            if (arrStrings[k].equals(word2))
                j = k;
            if (i != -1 && j != -1) {
                len = Math.min(len, Math.abs(j - i));
            }

        }

        return len;

    }

    public static void main(String[] args) {
        System.out.println(findShortestDistance(new String[] { "a", "c", "d", "b", "a" },
                "a", "b"));
    }
}
