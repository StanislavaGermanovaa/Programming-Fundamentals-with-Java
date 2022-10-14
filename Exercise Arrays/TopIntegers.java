package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        //Write a program to find all the top integers in an array.
        // A top integer is an integer that is bigger than all the elements to its right.
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i <= arr.length-1; i++) {
            int currentNum=arr[i];
            if(i==arr.length-1){
                System.out.print(currentNum+ " ");
                break;
            }
            boolean flag=false;
            for(int j=i+1;j<=arr.length-1;j++){
                int nextNum=arr[j];
                if(currentNum>nextNum){
                    flag=true;
                }else{
                    flag=false;
                    break;

                }
            }
            if(flag){
                System.out.print(currentNum + " ");
            }
        }
    }
}
