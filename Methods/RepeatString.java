package Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        //Write a method that receives a string and a repeat count n (integer).
        // The method should return a new string (the old one repeated n times).
        Scanner scan=new Scanner(System.in);
        String text=scan.nextLine();
        int n=Integer.parseInt(scan.nextLine());
        repeat(text,n);

    }
    public static void repeat(String text,int times){
        for(int i=0;i<times;i++){
            System.out.print(text);
        }
    }
}
