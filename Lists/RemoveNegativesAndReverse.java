package lists;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        //Read a list of integers, remove all negative numbers from it and print the remaining elements in reversed order.
        // In case of no elements left in the list, print "empty".

        Scanner scan = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        firstList.removeIf(e -> e < 0);

        Collections.reverse(firstList);

        if(firstList.size()==0){
            System.out.println("empty");
        }else{
            System.out.println(firstList.toString().replaceAll("[\\[\\],]",""));
        }
    }
}
