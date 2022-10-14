package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        //Write a program that prints common elements in two arrays.
        // You have to compare the elements of the second array to the elements of the first.
        Scanner scan = new Scanner(System.in);
        String[] firstArr=scan.nextLine().split(" ");
        String[] secondArr=scan.nextLine().split(" ");
        int length;
        if (firstArr.length > secondArr.length) {
            length = firstArr.length;
        } else {
            length = secondArr.length;
        }


        for(String elemSecondArr : secondArr){
            for(String elemFirstArr : firstArr){
                if(elemSecondArr.equals(elemFirstArr)){
                    System.out.printf("%s ", elemFirstArr);
                }
            }
        }
    }
}
