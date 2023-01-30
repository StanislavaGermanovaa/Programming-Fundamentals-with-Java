package LabAssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String[] inputArr=scan.nextLine().split(" ");

        LinkedHashMap<String,Integer> wordMap=new LinkedHashMap<>();
        for(String word: inputArr){
            word=word.toLowerCase();

            wordMap.putIfAbsent(word, 0);
            wordMap.put(word, wordMap.get(word)+1);
        }
        List<String> resultList=new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if(entry.getValue()%2!=0){

                resultList.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ",resultList));

    }
}
