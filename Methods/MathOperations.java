package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        //Write a method that receives two numbers and an operator, calculates the result, and returns it.

        Scanner scan=new Scanner(System.in);
        int firstNum=Integer.parseInt(scan.nextLine());
        String operation=scan.nextLine();
        int secondNum=Integer.parseInt(scan.nextLine());

        System.out.println(new DecimalFormat("0.####").format(calculate(firstNum,operation,secondNum)));

    }

    public static double calculate(int a,String operation,int b){
        double result=0.0;
        switch (operation){
            case "/":
                result=a/b; break;
            case "*":
                result=a*b; break;
            case "+":
                result=a+b; break;
            case "-":
                result=a-b; break;
        }
        return result;
    }
}
