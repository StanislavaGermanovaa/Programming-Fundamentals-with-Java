package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        //You are going to receive two lists with numbers. Create a result list that contains the numbers from both of the lists.
        // The first element should be from the first list, the second from the second list, and so on.
        // If the length of the two lists is not equal, just add the remaining elements at the end of the list.

        Scanner scan = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result=new ArrayList<>();
        int minSize=Math.min(firstList.size(),secondList.size());

        for(int i=0;i<minSize;i++){
            int numFirstList=firstList.get(i);
            int numSecondList=secondList.get(i);

            result.add(numFirstList);
            result.add(numSecondList);
        }

        if(firstList.size()>secondList.size()){
            result.addAll(firstList.subList(minSize,firstList.size()));
        }else if(secondList.size()>firstList.size()){
            result.addAll(secondList.subList(minSize,secondList.size()));
        }

        System.out.println(result.toString().replaceAll("[\\[\\],]",""));
    }
}
