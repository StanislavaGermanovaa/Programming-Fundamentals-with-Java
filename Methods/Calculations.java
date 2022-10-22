package Methods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        //Write a program that receives a string on the first line ("add", "multiply", "subtract", "divide")
        // and on the next two lines receives two numbers. Create four methods (for each calculation)
        // and invoke the right one depending on the command.
        // The method should also print the result (it needs to be void).
        Scanner scan = new Scanner(System.in);
        String operation=scan.nextLine();
        int a=Integer.parseInt(scan.nextLine());
        int b=Integer.parseInt(scan.nextLine());
        calculate(operation,a,b);

    }

    public static void calculate(String math, int num1, int num2) {
        switch (math){
            case "add":
                System.out.println(num1+num2); break;
            case "multiply":
                System.out.println(num1*num2); break;
            case "subtract":
                System.out.println(num1-num2); break;
            case "divide":
                System.out.println(num1/num2); break;
        }
    }
}
