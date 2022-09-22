import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        /*unit1 ex7
        Your task is to calculate the total price of a purchase from a vending machine.
        Until you receive "Start" you will be given different
        coins that are being inserted into the machine........
         */
        Scanner scan=new Scanner(System.in);
        double sum=0;
        String n=scan.nextLine();

        while(!n.equals("Start")){
            double i=Double.parseDouble(n);
            if (i==0.1||i==0.2||i==0.5||i==1||i==2) {
                sum += i;
                n = scan.nextLine();
            }else {
                System.out.printf("Cannot accept %.2f%n",i);
                n = scan.nextLine();
            }
        }

        String purchase=scan.nextLine();
        while(!purchase.equals("End")){
            if(purchase.equals("Nuts")){
                sum-=2.0;
                if(sum<0.00){
                    System.out.printf("Sorry, not enough money%n");
                    sum+=2.0;
                }else{
                    System.out.printf("Purchased %s%n",purchase);
                }
            }else if(purchase.equals("Water")){
                sum-=0.7;
                if(sum<0.00){
                    System.out.printf("Sorry, not enough money%n");
                    sum+=0.7;
                }else{
                    System.out.printf("Purchased %s%n",purchase);
                }
            }else if(purchase.equals("Crisps")){
                sum-=1.5;
                if(sum<0.00){
                    System.out.printf("Sorry, not enough money%n");
                    sum+=1.5;
                }else{
                    System.out.printf("Purchased %s%n",purchase);
                }
            }else if(purchase.equals("Soda")){
                sum-=0.8;
                if(sum<0.00){
                    System.out.printf("Sorry, not enough money%n");
                    sum+=0.8;
                }else{
                    System.out.printf("Purchased %s%n",purchase);
                }
            }else if(purchase.equals("Coke")){
                sum-=1.0;
                if(sum<0.00){
                    System.out.printf("Sorry, not enough money%n");
                    sum+=1.0;
                }else{
                    System.out.printf("Purchased %s%n",purchase);
                }
            }else {
                System.out.printf("Invalid product%n");
            }

            purchase=scan.nextLine();

        }
        System.out.printf("Change: %.2f",sum);
    }
}
