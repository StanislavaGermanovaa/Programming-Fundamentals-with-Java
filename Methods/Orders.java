package Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        //Write a method that calculates the total price of an order and prints it on the console.
        // The method should receive one of the following products: coffee, water, coke, snacks,
        // and a quantity of the product
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double times = Double.parseDouble(scan.nextLine());
        order(name,times);

    }

    public static void order(String order, double a) {
        switch (order) {
            case "coffee":
                System.out.printf("%.2f",a*1.50);
            break;
            case "water":
                System.out.printf("%.2f",a*1.00);
            break;
            case "coke":
                System.out.printf("%.2f",a*1.40);
            break;
            case "snacks":
                System.out.printf("%.2f",a*2.00);
            break;
        }
    }
}
