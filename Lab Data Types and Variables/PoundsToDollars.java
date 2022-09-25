import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        float pound=Float.parseFloat(scan.nextLine());

        float dollars= (float) (pound*1.36);
        System.out.printf("%.3f",dollars);
    }
}
