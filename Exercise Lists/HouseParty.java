package ExerciseLists;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class HouseParty {
    public static void main(String[] args) {
        //Write a program that keeps track of guests going to a house party.
        //On the first input line, you are going to receive how many commands you are going to have.
        // On the next lines you are going to receive some of the following inputs:
//· "{name} is going!" · "{name} is not going!"

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<String> guests = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String command = scan.nextLine();

            if (command.contains("is not going!")) {
                String name = command.split("\\s+")[0];
                if(guests.contains(name)){
                    guests.remove(name);
                }else {
                    System.out.printf("%s is not in the list!%n", name);
                }

            } else if (command.contains("is going!")) {
                String name = command.split("\\s+")[0];
                if(guests.contains(name)){
                    System.out.printf("%s is already in the list!%n", name);
                }else {
                    guests.add(name);
                }
            }
        }

        for(int i=0;i<guests.size();i++){
            System.out.println(guests.get(i));
        }
    }
}
