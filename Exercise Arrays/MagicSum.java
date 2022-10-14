package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        //Write a program that prints all unique pairs in an array of integers whose sum is equal to a given number.

        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int givenSum = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= arr.length - 1; i++) {
            int temp = arr[i];
            for (int j = i + 1; j <= arr.length - 1; j++) {
                int temp2 = arr[j];
                if (temp + temp2 == givenSum) {
                    System.out.println(temp + " " + temp2);
                }
            }
        }
    }
}
