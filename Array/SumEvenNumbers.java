package array;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String[] inputArray=scan.nextLine().split(" ");
        int[] numArr=new int[inputArray.length];

        for(int i=0;i<numArr.length;i++){
            numArr[i]=Integer.parseInt(inputArray[i]);
        }

        int evenSum=0;
        for(int i=0;i<numArr.length;i++){
            int currentEl=numArr[i];
            if(currentEl%2==0){
                evenSum+=currentEl;
            }
        }
        System.out.println(evenSum);
    }
}
