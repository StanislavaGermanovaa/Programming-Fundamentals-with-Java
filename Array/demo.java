package array;

import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr=Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int even=0;
        int odd=0;

        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            if(temp%2==0){
                even+=temp;
            }else{
                odd+=temp;
            }
        }
        System.out.println(even-odd);
    }
}
