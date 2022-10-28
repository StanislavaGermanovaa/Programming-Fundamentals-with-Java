package ExerciseMethod;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        //You will receive a single string. Write a method that prints the middle character.
        // If the length of the string is even, there are two middle characters.
        Scanner scan=new Scanner(System.in);

        String text=scan.nextLine();
        printMiddleLetter(text);
    }
    public static void printMiddleLetter(String text){
        if(text.length()%2==1){
            int middleChar=text.length()/2;
            System.out.println(text.charAt(middleChar));
        }else {
            int firstMiddleChar=text.length()/2-1;
            int secondMiddleChar=text.length()/2;

            System.out.println(""+text.charAt(firstMiddleChar)+text.charAt(secondMiddleChar));
        }
    }
}
