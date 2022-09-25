import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        short meters=Short.parseShort(scan.nextLine());

        double km=meters/1000.0;

        System.out.printf("%.2f",km);

    }
}
