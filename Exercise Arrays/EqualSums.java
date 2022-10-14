package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        //Write a program that determines if an element exists in the array such that the sum
        // of the elements on its left is equal to the sum of the elements on its right.
        // If there are no elements to the left/right, their sum is considered to be 0.
        // Print the index that satisfies the required condition or "no" if there is no such index

        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean flag = false;

        if (arr.length <= 1) {
            System.out.println(0);
        } else {

            for (int i = 0; i < arr.length - 1; i++) {
                int temp = arr[i];
                int leftSum = 0;
                int rightSum = 0;

                for (int leftIndex = 0; leftIndex < i; leftIndex++) {
                    leftSum += arr[leftIndex];
                }
                for (int rightIndex = i + 1; rightIndex <= arr.length - 1; rightIndex++) {
                    rightSum += arr[rightIndex];
                }
                if (leftSum == rightSum) {
                    System.out.println(i);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("no");
            }
        }
    }
}
