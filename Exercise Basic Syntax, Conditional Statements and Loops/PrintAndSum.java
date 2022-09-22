import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=Integer.parseInt(scan.nextLine()); //beginning
        int b=Integer.parseInt(scan.nextLine()); //end

        int sum=0; //sum of numbers

        for(int i=a;i<=b;i++){
            System.out.printf("%d ",i);
            sum+=i;  // sum all numbers
        }
        System.out.println(); //new line
        System.out.printf("Sum: %d",sum);
    }
}
