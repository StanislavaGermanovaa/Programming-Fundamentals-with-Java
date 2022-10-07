import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startingYield = Integer.parseInt(scan.nextLine());
        int days = 0;
        int totalAmountOfSpace=0;
        while (startingYield >= 100) {
            int temp=startingYield-26;
         totalAmountOfSpace+=temp;
         days++;
         startingYield-=10;
        }
        System.out.println(days);
        if(totalAmountOfSpace>=26){
            totalAmountOfSpace-=26;
        }
        System.out.println(totalAmountOfSpace);
    }
}
