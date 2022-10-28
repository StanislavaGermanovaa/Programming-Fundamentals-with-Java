package ExerciseMethod;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        //Read two integer numbers. Calculate the factorial of each number.
        // Divide the first result by the second and print the division formatted to the second decimal point.
        Scanner scan=new Scanner(System.in);
        int num1=Integer.parseInt(scan.nextLine());
        int num2=Integer.parseInt(scan.nextLine());

        long fac1=factNum(num1);
        long fac2=factNum(num2);
        double division=fac1*1.00/fac2;
        System.out.printf("%.2f",division);

    }
    public static long factNum(int a){
        long fact=1;
       for(int i=1;i<=a;i++){
           fact*=i;
       }
       return fact;
    }
}
