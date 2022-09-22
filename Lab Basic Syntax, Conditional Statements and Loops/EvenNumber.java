import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        while(n%2!=0){
            System.out.printf("Please write an even number.%n");
            n=Integer.parseInt(scan.nextLine());
        }
        if(n<0){
            n=n*(-1);
        }

        System.out.printf("The number is: %d",n);
    }
}
