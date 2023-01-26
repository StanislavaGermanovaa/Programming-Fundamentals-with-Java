package ExerciseLists;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> stringList = Arrays.stream(scan.nextLine().split(", "))
                .collect(Collectors.toList());

        String inputCommand = scan.nextLine();


//input until "course start"
        while (!inputCommand.equals("course start")) {
            String[] commandArr = inputCommand.split("\\:");
            String command = commandArr[0];

            switch (command) {
                case "Add":
                    //Add:{lessonTitle}
                    String elementToAdd = commandArr[1];

                    if (!stringList.contains(elementToAdd)) {
                        stringList.add(elementToAdd);
                    }
                    break;
                case "Insert":
                    //Insert:{lessonTitle}:{index}
                    String elementToInsert = commandArr[1];
                    int indexToInsert = Integer.parseInt(commandArr[2]);

                    stringList.add(indexToInsert, elementToInsert);
                    break;
                case "Remove":
                    //Remove:{lessonTitle}
                    String elementToRemove = commandArr[1];

                    if (stringList.contains(elementToRemove)) {
                        stringList.remove(elementToRemove);
                    }
                    break;
                case "Swap":
                    //Swap:{lessonTitle}:{lessonTitle}
                    String firstElement = commandArr[1];
                    String secondElement = commandArr[2];

                    int indexOfFirstEl = stringList.indexOf(firstElement);
                    int indexOfSecondEl = stringList.indexOf(secondElement);

                    if (stringList.contains(firstElement) && stringList.contains(secondElement)) {
                        stringList.set(indexOfFirstEl, secondElement);
                        stringList.set(indexOfSecondEl, firstElement);
                    }
                    break;
                case "Exercise":
                    //Exercise:{lessonTitle} - add Exercise in the schedule right after the lesson index
                    String temp = commandArr[1];

                    String exercise = temp + "-Exercise";
                    int indexTitle = stringList.indexOf(temp);

                    if (stringList.contains(temp)) {
                        if (indexTitle == stringList.size() - 1) {

                            stringList.add(indexTitle + 1, exercise);
                        } else if (!stringList.get(indexTitle + 1).equals(exercise)) {
                            stringList.add(indexTitle + 1, exercise);

                        }
                    }else {
                        stringList.add(temp);
                        stringList.add(exercise);
                    }
                    break;
            }


            inputCommand = scan.nextLine();
        }
        int cnt=1;
        for(String element : stringList){
            System.out.println(cnt + "." + element);
            cnt++;
        }
    }
}
