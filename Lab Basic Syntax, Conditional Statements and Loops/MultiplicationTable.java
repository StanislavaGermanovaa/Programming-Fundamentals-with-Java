import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        if (b > 10) {
            System.out.printf("%d X %d = %d%n", n, b, n * b);
        } else {
            for (int i = b; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", n, i, n * i);
            }
        }
    }
}
