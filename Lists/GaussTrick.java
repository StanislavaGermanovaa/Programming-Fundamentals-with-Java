package lists;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;

public class GaussTrick {
    public static void main(String[] args) {
        //Write a program that sum all numbers in a list in the following order:
        //
        //first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n, last - n

        Scanner scan = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int size=numList.size();

        for (int i = 0; i < size / 2; i++) {
            int firstNum = numList.get(i);
            int secondNum = numList.get(numList.size() - 1);

            numList.set(i, firstNum + secondNum);
            numList.remove(numList.size() - 1);
        }
        for (int item : numList) {
            System.out.print(item + " ");
        }
    }
}
