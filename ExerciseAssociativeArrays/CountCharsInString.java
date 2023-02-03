package ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class CountCharsInString {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String text=scan.nextLine().replaceAll("\\s+","");

        Map<Character,Integer> symbolMap=new LinkedHashMap<>();

        for(char symbol :text.toCharArray()){
           if(!symbolMap.containsKey(symbol)){
               symbolMap.put(symbol,1);
           }else{
               symbolMap.put(symbol,symbolMap.get(symbol)+1);
           }
        }
        symbolMap.entrySet().forEach(entry -> System.out.println(entry.getKey()+" -> "+entry.getValue()));


    }
}
