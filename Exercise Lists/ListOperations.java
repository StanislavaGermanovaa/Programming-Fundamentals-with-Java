package ExerciseLists;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        //You will be given numbers (a list of integers) on the first input line.
        // Until you receive "End" you will be given operations you must apply on the list. The possible commands are:

        //Add {number} - add number at the end
        //· Insert {number} {index} - insert number at given index
        //· Remove {index} - remove that index
        //· Shift left {count} - first number becomes last 'count' times
        //· Shift right {count}

        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scan.nextLine();

        while (!command.equals("End")) {
            if (command.contains("Add")) {
                int addElement = Integer.parseInt(command.split("\\s+")[1]);
                numbers.add(addElement);

            } else if (command.contains("Insert")) {
                int elemToInsert = Integer.parseInt(command.split("\\s+")[1]);
                int indexToInsert = Integer.parseInt(command.split("\\s+")[2]);
                if (isValidIndex(indexToInsert, numbers)) {

                    numbers.add(indexToInsert, elemToInsert);
                } else {
                    System.out.printf("Invalid index%n");
                }

            } else if (command.contains("Remove")) {
                int indexToRemove = Integer.parseInt(command.split("\\s+")[1]);
                if (isValidIndex(indexToRemove, numbers)) {
                    numbers.remove(indexToRemove);
                } else {
                    System.out.printf("Invalid index%n");
                }

            } else if (command.contains("Shift left")) {
                int shiftLeftCnt = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 1; i <= shiftLeftCnt; i++) {
                    int firstNUm = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstNUm);
                }

            } else if (command.contains("shift right")) {
                int shiftRightCnt = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 1; i <= shiftRightCnt; i++) {
                    int lastNUm = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, lastNUm);
                }
            }

            command = scan.nextLine();
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static boolean isValidIndex(int index, List<Integer> numbers) {
        return index >= 0 && index <= numbers.size() - 1;
    }
}
