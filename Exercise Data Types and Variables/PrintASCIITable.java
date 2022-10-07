import java.util.Scanner;

public class PrintASCIITable {
    public static void main(String[] args) {
        //write a program that prints part of the ASCII table of characters at the console.
        // On the first line of input, you will receive
        // the char index you should start with,
        // and on the second line - the index of the last character you should print.
        Scanner scan = new Scanner(System.in);

        int startIndex = Integer.parseInt(scan.nextLine());
        int stopIndex = Integer.parseInt(scan.nextLine());
        for (int i = startIndex; i <= stopIndex; i++) {
            char ch= (char) i;
            System.out.printf("%c ",ch);

        }

    }
}
