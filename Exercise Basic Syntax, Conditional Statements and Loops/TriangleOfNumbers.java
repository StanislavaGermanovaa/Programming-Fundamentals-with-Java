import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
/*unit1 ex8
8.	Triangle of Numbers
Write a program, which receives a number – n, and prints a triangle from 1 to n as in the examples.

 */
        Scanner scan=new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());

        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++) {
                System.out.printf("%d ", i);
            }
            System.out.printf("%n");
        }
    }
}
