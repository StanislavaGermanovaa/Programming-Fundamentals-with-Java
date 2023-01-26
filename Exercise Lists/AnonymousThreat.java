package ExerciseLists;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //You will receive a single input line containing STRINGS separated by spaces.
        //You will then begin receiving commands in one of the following formats:
        //· merge {startIndex} {endIndex}
        //· divide {index} {partitions}

        List<String> text = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scan.nextLine();

        while (!command.equals("3:1")) {
            //merge {startIndex} {endIndex}

            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);
                if (startIndex < 0) {
                    startIndex = 0;
                }

                if (endIndex > text.size() - 1) {
                    endIndex = text.size() - 1;
                }

                boolean isValidIndexes = startIndex <= text.size() - 1 && endIndex >= 0 && startIndex < endIndex;

                while (!isValidIndexes) {
                    String resultText = "";
                    for (int i = startIndex; i <= endIndex; i++) {
                        String currentText = text.get(i);
                        resultText += currentText;
                    }
                    for (int index = startIndex; index <= endIndex; index++) {
                        text.remove(startIndex);
                    }
                    text.add(startIndex, resultText);
                }
            }//divide
            else if (command.contains("divide")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int parts = Integer.parseInt(command.split(" ")[2]);

                String elementDivide = text.get(index);
                text.remove(index);

                int sizeOfDivineText = elementDivide.length();

                int beginIndexOfText = 0;
                for (int part = 1; part < parts; part++) {
                    text.add(index, elementDivide.substring(beginIndexOfText, beginIndexOfText + sizeOfDivineText));
                    index++;
                    beginIndexOfText += sizeOfDivineText;
                }
                text.add(index, elementDivide.substring(beginIndexOfText));
            }

            command = scan.nextLine();
        }
        for (String i : text) {
            System.out.print(i + " ");

        }
    }
}
