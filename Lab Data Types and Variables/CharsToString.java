import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char firstLine=scan.nextLine().charAt(0);
        char secondLine=scan.nextLine().charAt(0);
        char thirdLine=scan.nextLine().charAt(0);

        System.out.printf("%c%c%c",firstLine,secondLine,thirdLine);

    }
}
