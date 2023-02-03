package ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> items = new LinkedHashMap<>();

        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);
boolean isWin=false;
        Map<String, Integer> junkItems = new LinkedHashMap<>();
        while (true) {
            String input = scan.nextLine();
            String[] inputData = input.split("\\s+");
            for (int i = 0; i < inputData.length; i += 2) {
                int quantity = Integer.parseInt(inputData[i]);
                String material = inputData[i + 1].toLowerCase(Locale.ROOT);

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = items.get(material);
                    items.put(material, currentQuantity + quantity);

                } else {
                    if (!junkItems.containsKey(material)) {
                        junkItems.put(material, quantity);
                    } else {
                        int current = junkItems.get(material);
                        junkItems.put(material, current + quantity);
                    }
                }
                if (items.get("shards") >= 250) {
                    System.out.printf("Shadowmourne obtained!");
                    items.put("shards",items.get("shards")-250);
                    isWin=true;
                    break;
                } else if (items.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    items.put("fragments",items.get("fragments")-250);
                    isWin=true;
                    break;
                } else if (items.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    items.put("motes",items.get("motes")-250);
                    isWin=true;
                    break;
                }
            }
            if(isWin){
                break;
            }
        }

        items.entrySet().forEach(entry -> System.out.println(entry.getKey()+": "+entry.getValue()));
        junkItems.entrySet().forEach(entry -> System.out.println(entry.getKey()+": "+entry.getValue()));

    }
}
