import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String typeOfDay = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        int price = 0;
        boolean isValid = true;
        if (age >= 0 && age <= 18) {
            if (typeOfDay.equals("Weekday")) {
                price = 12;
            } else if (typeOfDay.equals("Weekend")) {
                price = 15;
            } else if (typeOfDay.equals("Holiday")) {
                price = 5;
            }else {
                isValid=false;
            }
        } else if (age > 18 && age <= 64) {
            if (typeOfDay.equals("Weekday")) {
                price = 18;
            } else if (typeOfDay.equals("Weekend")) {
                price = 20;
            } else if (typeOfDay.equals("Holiday")) {
                price = 12;
            } else {
                isValid = false;
            }
        } else if (age > 64 && age <= 122) {
            if (typeOfDay.equals("Weekday")) {
                price = 12;
            } else if (typeOfDay.equals("Weekend")) {
                price = 15;
            } else if (typeOfDay.equals("Holiday")) {
                price = 10;
            } else {
                isValid = false;
            }
        } else {
            isValid = false;
        }

        if(!isValid){
            System.out.printf("Error!");
        }else{
            System.out.printf("%d$",price);
        }
    }
}
