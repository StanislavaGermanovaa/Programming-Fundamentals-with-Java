package ExerciseMethod;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        //Write a program that checks if a given password is valid. Password rules are:
        //· 6 – 10 characters (inclusive);
        //· Consists only of letters and digits;
        //· Have at least 2 digits.
        Scanner scan =new Scanner(System.in);
        String text=scan.nextLine();
        boolean isCharactersValid=characters(text);
        if(!isCharactersValid){
            System.out.printf("Password must be between 6 and 10 characters%n");
        }

        boolean isContentValid=content(text);
        if(!isContentValid){
            System.out.printf("Password must consist only of letters and digits%n");
        }

        boolean isCntDigValid=cntDig(text);
        if(!isCntDigValid){
            System.out.printf("Password must have at least 2 digits%n");
        }

        if(isCharactersValid&&isContentValid&&isCntDigValid){
            System.out.printf("Password is valid%n");
        }
    }
    public static boolean characters(String text){
        if(text.length()>=6&&text.length()<=10){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean content(String text){
        for(char Symbol : text.toCharArray()){
            if(!Character.isLetterOrDigit(Symbol)){
                return false;
            }
        }
        return true;
    }

    public static boolean cntDig(String text){
        int cnt=0;
        for(char symbol : text.toCharArray()){
            if(Character.isDigit(symbol)){
                cnt++;
            }
        }
        return cnt>=2;
    }
}
