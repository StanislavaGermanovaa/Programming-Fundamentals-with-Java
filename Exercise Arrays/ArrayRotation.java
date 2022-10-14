package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        //Write a program that receives an array
        // and the number of rotations you have to perform (the first element goes at the end).

        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rotations = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= rotations; i++) {
            int firstElm = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = firstElm;
        }
        for(int number : arr){
            System.out.print(number+ " ");
        }
    }
}
