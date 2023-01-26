package ExerciseLists;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        // Write a program that reads a list of integers from the console and receives commands which manipulate the list.
        // Your program may receive the following commands:

//· Delete {element} - delete all elements in the array which are equal to the given element
//· Insert {element}

        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scan.nextLine();

        while (!command.equals("end")) {
            if (command.contains("Delete")) {
                int numForRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(Arrays.asList(numForRemove));
            } else if (command.contains("Insert")){
                int element=Integer.parseInt(command.split(" ")[1]);
                int index=Integer.parseInt(command.split(" ")[2]);
                numbers.add(index,element);
            }

                command = scan.nextLine();
        }

        for(int number : numbers){
            System.out.print(number+" ");
        }
    }
}
