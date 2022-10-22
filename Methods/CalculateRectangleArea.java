package Methods;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        //Create a method that calculates and returns the area of a rectangle by given width and length.
        Scanner scan=new Scanner(System.in);
        int num1=Integer.parseInt(scan.nextLine());
        int num2=Integer.parseInt(scan.nextLine());
        System.out.println(area(num1,num2));
    }
    public static int area(int a,int b){
        int area=a*b;
        return area;
    }
}
