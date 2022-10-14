package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        //You are given an array with integers. Write a program to modify the elements after receiving
        // the following commands:
        //· "swap {index1} {index2}" takes two elements and swap their places.
        //· "multiply {index1} {index2}" takes the element at the 1st index and multiplies it with the element at 2nd index.
        // Save the product at the 1st index.
        //· "decrease" decreases all elements in the array with 1.

        // On the first input line, you will be given the initial array values separated by a single space.
        //On the next lines, you will receive commands until you receive the command "end".

        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scan.nextLine();
        while (!command.equals("end")){
            if(command.contains("swap")){
                int index1=Integer.parseInt(command.split(" ")[1]);
                int index2=Integer.parseInt(command.split(" ")[2]);

                int el1=arr[index1];
                int el2=arr[index2];
                arr[index1]=el2;
                arr[index2]=el1;
            }else if(command.contains("multiply")){
                int index1=Integer.parseInt(command.split(" ")[1]);
                int index2=Integer.parseInt(command.split(" ")[2]);

                int el1=arr[index1];
                int el2=arr[index2];

                int product=el1*el2;
                arr[index1]=product;

            }else if(command.equals("decrease")){
                for(int i=0;i<=arr.length-1;i++){
                    arr[i]=arr[i]-1;
                }
            }

            command=scan.nextLine();
        }

        for(int i=0;i<=arr.length-1;i++){
            int temp=arr[i];
            if(i!=arr.length-1){
                System.out.print(temp + ", ");
            }else {
                System.out.print(temp);
            }
        }
    }
}
