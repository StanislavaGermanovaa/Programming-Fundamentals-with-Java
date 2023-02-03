package ExerciseAssociativeArrays;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String input = scan.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();
        while(!input.equals("end")) {
            String courseName = input.split(" : ")[0];
            String personName = input.split(" : ")[1];

            if(!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());
            }
            courses.get(courseName).add(personName);

            input = scan.nextLine();
        }
        courses.entrySet()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
                });
    }
}
