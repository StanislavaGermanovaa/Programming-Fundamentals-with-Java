import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int lastDig = 0;
        int saveNum = number;
        int sum = 0;

        while (number != 0) {
            int product = 1;
            lastDig = number % 10;
            for (int i = 1; i <= lastDig ; i++) {
                product *= i;
            }
            sum+=product;
            number = number / 10;
        }
        if (sum == saveNum) {
            System.out.printf("yes");
        } else {
            System.out.printf("no");
        }
    }
}
