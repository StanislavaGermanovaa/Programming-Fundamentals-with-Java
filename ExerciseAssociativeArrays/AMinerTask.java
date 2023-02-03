package ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        Map<String, Integer> resourcesQuantity = new LinkedHashMap<>();
        while (!command.equals("stop")) {
            int quantity = Integer.parseInt(scan.nextLine());

            //няма ресурс
            if (!resourcesQuantity.containsKey(command)) {
                resourcesQuantity.put(command, quantity);
            } else {
                resourcesQuantity.put(command, resourcesQuantity.get(command) + quantity);
            }

            command = scan.nextLine();
        }

        resourcesQuantity.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
