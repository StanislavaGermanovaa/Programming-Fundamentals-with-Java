package ExerciseArrays;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //You will be given a count of wagons in a train n. On the next n lines,
        // you will receive how many people will get on that wagon.
        // In the end, print the whole train and the sum of the people on the train.

        int n = Integer.parseInt(scan.nextLine());
        int[] people = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            people[i] = Integer.parseInt(scan.nextLine());
            sum += people[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",people[i]);
        }
        System.out.println();
        System.out.println(sum);
    }
}
