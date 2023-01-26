package ExerciseLists;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        //Write a program to append several arrays of numbers
        //§ Arrays are separated by "|"
        //§ Values are separated by spaces (" ", one or several)
        //§ Order the arrays from the last to the first and their values from left to right

        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();

        List<String> listSeparatedByPipe= Arrays.stream(input.split("\\|"))
                .collect(Collectors.toList());

        Collections.reverse(listSeparatedByPipe);

        System.out.println(listSeparatedByPipe.toString()
        .replace("[","")
        .replace("]","")
        .trim()
        .replaceAll(",","")
        .replaceAll("\\s+"," "));



    }
}
