package Methods;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        //Write a method that receives a grade between 2.00 and 6.00 and prints the corresponding grade in words:
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        grades(number);
    }

    public static void grades(double a) {
        if (a >= 2.00 && a <= 2.99) {
            System.out.printf("Fail");
        } else if (a >= 3.00 && a <= 3.49) {
            System.out.printf("Poor");
        } else if (a >= 3.50 && a <= 4.49) {
            System.out.printf("Good");
        } else if (a >= 4.50 && a <= 5.49) {
            System.out.printf("Very good");
        } else if (a >= 5.50 && a <= 6.00) {
            System.out.printf("Excellent");
        }
    }
}
