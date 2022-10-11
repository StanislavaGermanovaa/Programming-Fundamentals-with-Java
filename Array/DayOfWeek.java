package array;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String[] dayArray={
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        int n=Integer.parseInt(scan.nextLine());

        if(n>=1&&n<=7){
            System.out.println(dayArray[n-1]);
        }else {
            System.out.printf("Invalid day!");
        }

    }
}
