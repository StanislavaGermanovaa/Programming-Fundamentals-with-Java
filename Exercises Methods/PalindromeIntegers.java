package ExerciseMethod;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        //A palindrome is a number that reads the same backward as forward, such as 323 or 1001.
        // Write a program that reads a positive
        // integer number until you receive "END". For each numbered print, whether the number is palindrome or not.

        Scanner scan = new Scanner(System.in);

        String num = scan.nextLine();
        while (!num.equals("END")) {
            if(!palindrome(num)){
                System.out.println("false");
            }else {
                System.out.println("true");
            }
            num=scan.nextLine();
        }
    }
    public static boolean palindrome(String num){
        String reversedStr= "";
        for(int i=num.length()-1;i>=0;i--){
            reversedStr+=num.charAt(i);
        }
        return num.equals(reversedStr);
    }

}

