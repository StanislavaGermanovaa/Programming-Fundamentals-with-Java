package lists;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        //Write a program that reads a list of integers. Then until you receive "end", you will be given different commands

        Scanner scan=new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String lineInput=scan.nextLine();
        while(!lineInput.equals("end")){
            String[] commandArr=lineInput.split(" ");
            String command=commandArr[0];

            switch (command){
                case "Add":
                    int numToAdd=Integer.parseInt(commandArr[1]);
                    firstList.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove=Integer.parseInt(commandArr[1]);
                    firstList.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    int numRemoveAt=Integer.parseInt(commandArr[1]);
                    firstList.remove(numRemoveAt);
                    break;
                case "Insert":
                    int numToInsert=Integer.parseInt(commandArr[1]);
                    int  indexInsert=Integer.parseInt(commandArr[2]);
                    firstList.add(indexInsert,numToInsert);
                    break;
            }


            lineInput=scan.nextLine();
        }
        System.out.println(firstList.toString().replaceAll("[\\[\\],]",""));
    }
}
