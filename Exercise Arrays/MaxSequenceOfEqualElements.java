package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        //Write a program that finds the longest sequence of equal elements in an array of integers.
        // If several longest sequences exist, print the leftmost one.
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxLength=0;
        int length=1;

        int startIndex=0;
        int bestStart=0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[i-1]){
                length++;
            }else {
                length=1;
                startIndex=i;
            }

            if(length>maxLength){
                maxLength=length;
                bestStart=startIndex;
            }
        }

        for(int i=bestStart;i<bestStart+maxLength;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

