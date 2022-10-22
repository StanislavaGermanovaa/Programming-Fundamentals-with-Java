package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        //Create a program that reads an integer number
        // and multiplies the sum of all its even digits by the sum of all its odd digits:

        Scanner scan = new Scanner(System.in);
        int num =
                Math.abs(Integer.parseInt(scan.nextLine()));
        System.out.println(multiply(num));

    }

    public static int multiply(int a) {
        int evenSum=evenCnt(a);
        int oddSum=oddCnt(a);

        return evenSum*oddSum;
    }

    public static int evenCnt(int number1) {
        String intToString = Integer.toString(number1);

        int[] arr = Arrays
                .stream(intToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int oddCnt(int number2) {
        String intToString = Integer.toString(number2);
        int sum = 0;
        int[] arr = Arrays
                .stream(intToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
