import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        //Read four integer numbers. Add first to the second,
        // divide (integer) the sum by the third number,
        // and multiply the result by the fourth number. Print the result.
        Scanner scan=new Scanner(System.in);

        int firstNum=Integer.parseInt(scan.nextLine());
        int secondNum=Integer.parseInt(scan.nextLine());
        int thirdNum=Integer.parseInt(scan.nextLine());
        int fourthNum=Integer.parseInt(scan.nextLine());

        int sumOfTwoNum=firstNum+secondNum;
        double divideNum=sumOfTwoNum/thirdNum;
        double multiplyNum=divideNum*fourthNum;

        System.out.printf("%.0f",multiplyNum);

    }
}
