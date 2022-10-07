import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        //You will be given a single integer. Your task is to find the sum of its digits.
        Scanner scan=new Scanner(System.in);

        int number=Integer.parseInt(scan.nextLine());
        int sum=0;

        while(number>0){
            int temp=number%10;
            sum+=temp;
            number/=10;
        }
        System.out.println(sum);
    }
}
