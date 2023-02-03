package ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, String> users = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] inputLine = scan.nextLine().split("\\s+");
            String command = inputLine[0];
            String name = inputLine[1];
            if (command.contains("unregister")) {

                if (!users.containsKey(name)) {
                    System.out.println("ERROR: user " + name + " not found");
                } else {
                    users.remove(name);
                    System.out.println(name + " unregistered successfully");
                }
            } else if (command.contains("register")) {
                String licensePlate = inputLine[2];

                if (!users.containsKey(name)) {
                    users.put(name, licensePlate);
                    System.out.println(name + " registered " + licensePlate + " successfully");
                } else {
                    System.out.println("ERROR: already registered with plate number " + licensePlate);
                }

            }

        }
        users.forEach((userName, licensePlate) -> System.out.println(userName + " => " + licensePlate));
    }
}
