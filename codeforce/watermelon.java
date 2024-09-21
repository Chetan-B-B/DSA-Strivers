import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weight = input.nextInt();
        if (weight <= 2) {
            System.out.println("NO");
            return;
        }
        if (weight % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
