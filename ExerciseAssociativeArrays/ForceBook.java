package ExerciseAssociativeArrays;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        //side-> user
        Map<String, List<String>> map = new LinkedHashMap<>();

        while (!command.equals("Lumpawaroo")) {
            //command = "{force_side} | {force_user}"
            //command = "{force_user} -> {force_side}"

            if (command.contains(" | ")) {
                String group = command.split("\\s+\\|\\s+")[0];
                String user = command.split("\\s+\\|\\s+")[1];

                if (!map.containsKey(group)) {
                    map.put(group, new ArrayList<>());
                }
                boolean isExistUser = false;
                for (List<String> listUsers : map.values()) {
                    if (listUsers.contains(user)) {
                        isExistUser = true;
                    }
                }
                if (!isExistUser) {
                    map.get(group).add(user);
                }

            } else if (command.contains(" -> ")) {
                String user = command.split("\\s+\\->\\s+")[0];
                String group = command.split("\\s+\\->\\s+")[1];

                map.entrySet().forEach(entry -> entry.getValue().remove(user));

                if (map.containsKey(group)) {
                    map.get(group).add(user);
                } else {
                    map.put(group, new ArrayList<>());
                    map.get(group).add(user);
                }
                System.out.printf("%s joins the %s side!%n",user,group);
            }
            command = scan.nextLine();
        }
        //списъка не е празен
        map.entrySet().stream().filter(entry -> entry.getValue().size()>0)
                .forEach(entry -> {
                            System.out.printf("Side: %s, Members: %d%n",entry.getKey(),entry.getValue().size());
                            entry.getValue().forEach(user -> System.out.println("! "+ user));
                        });
    }
}
