package ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String input=scan.nextLine();

        String[] wordsArr=input.split("\\s+");

        Random rndGenerator= new Random();

        for(int i=0;i<wordsArr.length;i++){
            int indexX = rndGenerator.nextInt(wordsArr.length);
            int indexY=rndGenerator.nextInt(wordsArr.length);

            String oldWordX=wordsArr[indexX];
            wordsArr[indexX]= wordsArr[indexY];
            wordsArr[indexY]=oldWordX;
        }
        System.out.print(String.join(System.lineSeparator(),wordsArr));
    }
}
