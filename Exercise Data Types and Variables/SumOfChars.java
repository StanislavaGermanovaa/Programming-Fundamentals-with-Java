import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        //Write a program that sums the ASCII codes of n characters. Print the sum on the console.
        Scanner scan=new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());
        char ch;
        int sum=0;
        for(int i=0;i<n;i++){
            ch=scan.nextLine().charAt(0);
            sum+=ch;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
