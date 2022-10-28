package ExerciseMethod;

import java.util.Scanner;

public class SmallestThreeNumbers {
    public static void main(String[] args) {
        //Write a method to print the smallest of three integer numbers. Use an appropriate name for the method.

        Scanner scan = new Scanner(System.in);
        int firstNUm = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());
        int thirdNum = Integer.parseInt(scan.nextLine());
        smallest(firstNUm, secondNum, thirdNum);
    }

    public static void smallest(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
