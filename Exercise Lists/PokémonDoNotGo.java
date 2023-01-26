package ExerciseLists;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class PokémonDoNotGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumRemoved = 0;
        while (numbers.size() > 0) {
            int index = Integer.parseInt(scan.nextLine());
            if (index >= 0 && index <= numbers.size() - 1) {
                int removedEl = numbers.get(index);
                sumRemoved += removedEl;
                numbers.remove(index);
                modifyLIst(numbers, removedEl);
            } else if (index < 0) {
                int firstElem = numbers.get(0);
                sumRemoved += firstElem;
                numbers.remove(0);
                int lastEl = numbers.get(numbers.size() - 1);
                numbers.add(0, lastEl);
                modifyLIst(numbers, firstElem);
            } else if (index > numbers.size() - 1) {
                int lastElem = numbers.get(numbers.size() - 1);
                sumRemoved += lastElem;
                numbers.remove(numbers.size() - 1);
                int firstElem = numbers.get(0);
                numbers.add(firstElem);
                modifyLIst(numbers, lastElem);
            }
        }
        System.out.println(sumRemoved);
    }



    private static void modifyLIst(List<Integer> numbers, int removedEl) {
        for (int i = 0; i <= numbers.size() - 1; i++) {
            int currentNUm = numbers.get(i);
            if (currentNUm <= removedEl) {
                currentNUm += removedEl;
            } else {
                currentNUm -= removedEl;
            }
            numbers.set(i, currentNUm);
        }
    }
}
