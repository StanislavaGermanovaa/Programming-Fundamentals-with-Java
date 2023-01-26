package ExerciseLists;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        //On the first line, you will be given a list of wagons (integers).
        // Each integer represents the number of passengers that are currently in each wagon.
        // On the next line, you will get the max capacity of each wagon (single integer).
        // Until you receive "end" you will be given two types of input:
        //
        //· Add {passengers} - add a wagon to the end with the given number of passengers
        //· {passengers} - find an existing wagon to fit all the passengers (starting from the first wagon)

        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int capacity = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();

        while (!command.contains("end")) {
            if (command.contains("Add")) {
                int wagon = Integer.parseInt(command.split("\\s+")[1]);
                numbers.add(wagon);
            } else {
                int passengers = Integer.parseInt(command.split("\\s+")[0]);
                for (int i = 0; i < numbers.size(); i++) {
                    int currentWagon = numbers.get(i);
                    if (currentWagon + passengers <= capacity) {
                        numbers.set(i, currentWagon + passengers);
                        break;
                    }
                }
            }


            command = scan.nextLine();
        }
        for(int wagon :numbers){
            System.out.print(wagon+ " ");
        }


    }
}
