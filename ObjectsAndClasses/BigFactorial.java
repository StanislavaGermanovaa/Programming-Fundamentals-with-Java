package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());

        BigInteger result=new BigInteger(String.valueOf(1));

        for(int i=1;i<=n;i++){
            result=result.multiply(BigInteger.valueOf(i));
        }

        System.out.print(result);
    }
}
