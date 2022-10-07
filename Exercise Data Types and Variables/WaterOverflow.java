import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        //You have a water tank with a capacity of 255 liters.
        // On the next n lines, you will receive liters of water, which you must pour into your tank.
        // If the capacity is not enough, print "Insufficient capacity!"
        // and continue reading the next line. On the last line, print the liters in the tank.

        Scanner scan=new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());
        double capacity=255;
        for(int i=0;i<n;i++){
            double pourUp=Integer.parseInt(scan.nextLine());
            capacity-=pourUp;
            if(capacity<=0){
                capacity+=pourUp;
                System.out.printf("Insufficient capacity!%n");
            }

        }
        System.out.printf("%.0f",255-capacity);
    }
}
