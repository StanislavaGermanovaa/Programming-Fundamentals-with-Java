package array;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());
            array[i] = currentNum;
        }
        for(int i=array.length-1;i>=0;i--){
            System.out.printf("%d ",array[i]);
        }
    }
}
