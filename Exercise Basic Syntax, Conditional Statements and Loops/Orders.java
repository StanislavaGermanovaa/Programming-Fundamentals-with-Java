import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        /*unit1 ex9
        We are placing N orders at a time. You need to calculate the price on the following formula:
((daysInMonth * capsulesCount) * pricePerCapsule)
         */
        Scanner scan=new Scanner(System.in);
        int countOfOrders=Integer.parseInt(scan.nextLine());
        double pricePerCapsule;
        int daysInMonth;
        int capsulesCount;
        double finalPrice=0;
        for(int i=0;i<countOfOrders;i++){
            pricePerCapsule=Double.parseDouble(scan.nextLine());
            daysInMonth=Integer.parseInt(scan.nextLine());
            capsulesCount=Integer.parseInt(scan.nextLine());
            System.out.printf("The price for the coffee is: $%.2f%n",((daysInMonth * capsulesCount) * pricePerCapsule));
            finalPrice+=((daysInMonth * capsulesCount) * pricePerCapsule);

        }
        System.out.printf("Total: $%.2f",finalPrice);
    }
}
