package ExerciseMethod;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        //Write a method that receives two characters and prints all the characters in
        // between them on a single line according to ASCII.
        Scanner scan = new Scanner(System.in);

        char start = scan.nextLine().charAt(0);
        char stop = scan.nextLine().charAt(0);
        printASCII(start, stop);
    }

    public static void printASCII(char a, char b) {
        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                char ch = (char) i;
                System.out.printf("%c ", ch);
            }
        }else{
            for (int i = b + 1; i < a; i++) {
                char ch = (char) i;
                System.out.printf("%c ", ch);
            }

        }
    }
}
