package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Create a method that calculates and returns the value of a number raised to a given power.
        double num = Double.parseDouble(scan.nextLine());
        int times = Integer.parseInt(scan.nextLine());

        System.out.println(new DecimalFormat("0.####").format(mathPower(num, times)));
    }

    public static double mathPower(double a, int b) {
        double result = 1;
        result = Math.pow(a, b);

        return result;
    }
}
