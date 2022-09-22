import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int allPeople = Integer.parseInt(scan.nextLine());
        String typeOfPeople = scan.nextLine();
        String day = scan.nextLine();

        double sum = 0;

        if (typeOfPeople.equals("Students")) {
            if (day.equals("Friday")) {
                sum = allPeople * 8.45;
            } else if (day.equals("Saturday")) {
                sum = allPeople * 9.80;
            } else if (day.equals("Sunday")) {
                sum = allPeople * 10.46;
            }
        } else if (typeOfPeople.equals("Business")) {
            if (day.equals("Friday")) {
                sum = allPeople * 10.90;
            } else if (day.equals("Saturday")) {
                sum = allPeople * 15.60;
            } else if (day.equals("Sunday")) {
                sum = allPeople * 16;
            }
        } else if (typeOfPeople.equals("Regular")) {
            if (day.equals("Friday")) {
                sum = allPeople * 15;
            } else if (day.equals("Saturday")) {
                sum = allPeople * 20;
            } else if (day.equals("Sunday")) {
                sum = allPeople * 22.50;
            }
        }

        if (typeOfPeople.equals("Students") && allPeople >= 30) {
            sum = sum-(sum * 0.15);
        } else if (typeOfPeople.equals("Business") && allPeople >= 100) {
            if (day.equals("Friday")) {
                sum = sum - (10 * 10.90);
            } else if (day.equals("Saturday")) {
                sum = sum - (10 * 15.60);
            } else if (day.equals("Sunday")) {
                sum = sum - (10 * 16);
            }
        } else if (typeOfPeople.equals("Regular") && allPeople >= 10 && allPeople <= 20) {
            sum = sum-(sum * 0.05);
        }

        System.out.printf("Total price: %.2f",sum);
    }
}
