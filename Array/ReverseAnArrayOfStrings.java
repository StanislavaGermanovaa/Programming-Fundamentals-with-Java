package array;

import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputArray = scan.nextLine().split(" ");

        for (int i = 0; i < inputArray.length / 2; i++) {
            String oldEl = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - 1 - i];
            inputArray[inputArray.length - 1 - i] = oldEl;
        }
        System.out.println(String.join(" ",inputArray));
    }
}
