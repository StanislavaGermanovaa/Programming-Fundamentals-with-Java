package Methods;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        //Create a method for printing triangles as shown below:
        Scanner scan=new Scanner(System.in);
        int number=Integer.parseInt(scan.nextLine());
        for(int i=1;i<=number;i++){
            triangle(1,i);
        }
        for(int i=number-1;i>=1;i--){
            triangle(1,i);
        }
    }

    public static void triangle(int start,int end){
        for(int i=start;i<=end;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
