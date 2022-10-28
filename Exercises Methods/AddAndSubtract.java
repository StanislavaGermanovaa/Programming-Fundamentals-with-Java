package ExerciseMethod;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        //You will receive 3 integers. Write a method sum to get the sum of the first two integers
        // and subtract the method that subtracts the third integer from the result from the sum method.
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        int sum = sumNum(num1, num2);
        int subtract = subtractNum(sum, num3);
        System.out.println(subtract);


    }

    public static int sumNum(int a, int b) {
        return a + b;
    }

    public static int subtractNum(int a, int b) {
        return a - b;
    }
}
