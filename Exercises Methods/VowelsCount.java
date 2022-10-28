package ExerciseMethod;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        //Write a method that receives a single string and prints the count of the vowels.

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        vowelsCnt(text.toLowerCase(Locale.ROOT));

    }

    public static void vowelsCnt(String text) {
        char ch;
        int cnt = 0;
        for (int i = 0; i < text.length(); i++) {
            ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'u' || ch == 'i' || ch == 'o' ) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
