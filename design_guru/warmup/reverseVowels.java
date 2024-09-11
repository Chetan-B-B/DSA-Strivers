// Input: s= "DesignGUrus"
// Output: "DusUgnGires"

public class reverseVowels {
    public static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
                || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U');
    }

    public static void reverseVowel(String str) {
        char[] str2 = str.toCharArray();
        int i = 0, j = str.length() - 1;
        System.out.println(str);
        while (i < j) {
            if (!isVowel(str2[i])) {
                i++;
                continue;
            }
            if (!isVowel(str2[j])) {
                j--;
                continue;
            }
            // swap
            char t = str2[i];
            str2[i] = str2[j];
            str2[j] = t;
            i++;
            j--;
            System.out.println(str2);
        }

    }

    public static void main(String[] args) {
        reverseVowel("DesignGUrus");
    }
}
