package ExerciseLists;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        //You will be given two hands of cards, which will be integer numbers.
        // Assume that you have two players. You must find the winning deck and, respectively, the winner.

        Scanner scan=new Scanner(System.in);

        List<Integer> firstPlayer= Arrays
                .stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayer=Arrays
                .stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while(firstPlayer.size()!=0&&secondPlayer.size()!=0){
            int firstPlayerCard = firstPlayer.get(0);
            int secondPlayerCard = secondPlayer.get(0);
            firstPlayer.remove(0);
            secondPlayer.remove(0);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayer.add(firstPlayerCard);
                firstPlayer.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayer.add(secondPlayerCard);
                secondPlayer.add(firstPlayerCard);
            }

            if (firstPlayer.size() == 0) {
                System.out.printf("Second player wins! Sum: %d", getCardsSum(secondPlayer));
            }
            else if (secondPlayer.size() == 0) {
                System.out.printf("First player wins! Sum: %d", getCardsSum(firstPlayer));
            }
        }

    }
    private static int getCardsSum(List<Integer> listCards) {
        int sum = 0;
        for (int card : listCards) {
            sum += card;
        }

        return sum;
    }
}
