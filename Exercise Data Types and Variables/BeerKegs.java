import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        //Write a program that calculates the volume of n beer kegs.
        // You will receive in total 3 * n lines. Every three lines will hold information for a single keg.
        // First up is the model of the keg, after that is the radius of the keg, and lastly is the height of the keg.
        //Calculate the volume using the following formula: π * r^2 * h.
        //In the end, print the model of the biggest keg.

        Scanner scan = new Scanner(System.in);
        byte n = Byte.parseByte(scan.nextLine());
        String biggestModel = "";
        double biggestVolume = 0;
        for (int i = 0; i < n; i++) {
            double volume = 0;
            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());
            volume = 3.14 * (radius * radius) * height;
            if (volume > biggestVolume) {
                biggestVolume = volume;
                biggestModel=model;
            }

        }
        System.out.printf("%s",biggestModel);
    }
}
