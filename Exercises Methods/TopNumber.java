package ExerciseMethod;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        //Read an integer n from the console. Find all top numbers in the range [1 … n] and print them.
        // A top number holds the following properties:
        //· Its sum of digits is divisible by 8,
        //· Holds at least one odd digit,
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            if(divisibleBy8(i)){
                if(oddDig(i)){
                    System.out.println(i);
                }
            }

        }
    }

    public static boolean divisibleBy8(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDig = n % 10;
            sum += lastDig;
            n /= 10;
        }
        return sum % 8 == 0;
    }

    public static boolean oddDig(int n) {
        int cnt = 0;
        while (n > 0) {
            int temp = n % 10;
            if (temp % 2 != 0) {
                cnt++;
            }
            n /= 10;
        }
       return cnt>0;
    }
}
