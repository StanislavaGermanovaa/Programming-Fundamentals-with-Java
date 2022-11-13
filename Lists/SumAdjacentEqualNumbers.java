package lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        //Write a program to sum all adjacent equal numbers in a list of decimal numbers, starting from left to right.
        //§ After two numbers are summed, the obtained result could be equal to
        // some of its neighbors and should be summed as well (see the examples below).
        //§ Always sum the leftmost two equal neighbors (if several couples of equal neighbors are available).

        Scanner scan = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scan.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numbersList.size() - 1; i++) {
            double currentNum = numbersList.get(i);
            double nextNum = numbersList.get(i + 1);

            if (currentNum == nextNum) {
                numbersList.set(i, currentNum + nextNum);
                numbersList.remove(i + 1);
                i = -1;
            }
        }

        System.out.println(joinEl(numbersList, " "));
    }

    public static String joinEl(List<Double> list,String delimiter){
        DecimalFormat df =new DecimalFormat("0.#");
        String result="";
        for(double item : list){
            String numDf=df.format(item)+ delimiter;
            result+=numDf;
        }
        return result;
    }
}
