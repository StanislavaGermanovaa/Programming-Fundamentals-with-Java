import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lostGames = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        int cntHeadset = lostGames / 2;
        int cntMouse = lostGames / 3;
        int cntKeyboards = lostGames / 6;
        int cntDisplay = lostGames / 12;

        double finalSum= (cntHeadset*headsetPrice)+ (cntMouse*mousePrice)+(cntKeyboards*keyboardPrice)+(cntDisplay*displayPrice);

        System.out.printf("Rage expenses: %.2f lv.",finalSum);
    }
}
