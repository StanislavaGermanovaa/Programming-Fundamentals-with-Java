package ExerciseMethod;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        //Write a method that receives a single integer n and prints an nxn matrix with that number

        Scanner scan=new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        printMatrix(n);

    }
    public static void printMatrix(int a){
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                System.out.printf("%d ",a);
            }
            System.out.println();
        }
    }
}
