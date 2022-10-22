package Methods;

import java.util.Scanner;

public class GreaterOFTwoValues {
    public static void main(String[] args) {
        //You are given two values of the same type as input. The values can be of type int, char of String.
        // Create a method getMax() that returns the greater of the two values:
        Scanner scan=new Scanner(System.in);

        String text=scan.nextLine();

        switch (text){
            case "int":
                int a=Integer.parseInt(scan.nextLine());
                int b=Integer.parseInt(scan.nextLine());
                intReturn(a,b);
                break;
            case "char":
                char symbol1=scan.nextLine().charAt(0);
                char symbol2=scan.nextLine().charAt(0);
                charReturn(symbol1,symbol2);
                break;
            case "string":
                String text1=scan.next();
                String text2=scan.next();
                System.out.println(stringReturn(text1,text2));
                break;
        }
    }

    public static void intReturn(int a,int b){
        if(a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
    public static void charReturn(char a,char b){
        if(a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
    public static String stringReturn(String text1,String text2){
       if(text1.compareTo(text2)>0){
           return text1;
        }else {
           return text2;
       }
    }
}
