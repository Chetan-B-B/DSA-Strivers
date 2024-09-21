
import java.util.Scanner;

public class Team {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int total = sc.nextInt();
        for (int i = 0; i < total; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += sc.nextInt();
            }
            // System.out.println("Sum");
            // System.out.println(sum);

            if (sum >= 2) {
                ans++;
            }
            // System.out.println("ans");
            // System.out.println(ans);
        }
        // System.out.println("FInal");

        System.out.println(ans);
    }
}
