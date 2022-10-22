package Methods;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        //Create a method that prints the sign of an integer number
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        signOfInteger(number);

    }

    public static void signOfInteger(int a) {
        if (a > 0) {
            System.out.printf("The number %d is positive.", a);
        } else if (a < 0) {
            System.out.printf("The number %d is negative.", a);
        } else {
            System.out.printf("The number %d is zero.", a);
        }
    }
}
