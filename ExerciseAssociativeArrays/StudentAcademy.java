package ExerciseAssociativeArrays;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countStudents = Integer.parseInt(scan.nextLine());

        Map<String, List<Double>> studentsGrade = new LinkedHashMap<>();
        for (int i = 1; i <= countStudents; i++) {
            String name = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());

            if (!studentsGrade.containsKey(name)) {
                studentsGrade.put(name, new ArrayList<>());
            }
            studentsGrade.get(name).add(grade);
        }

        Map<String, Double> avrgGradeStudents = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentsGrade.entrySet()) {
            String studentsName=entry.getKey();
            List<Double> listGrade = entry.getValue();
            double averageGrade = getAverageGrade(listGrade);
            if(averageGrade>=4.50){
                avrgGradeStudents.put(studentsName,averageGrade);
            }
        }

        avrgGradeStudents.entrySet().forEach(entry-> System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()));
    }

    private static double getAverageGrade(List<Double> listGrade) {
        double sumGrade=0;
        for(double grade : listGrade){
            sumGrade+=grade;
        }
        return sumGrade/listGrade.size();
    }
}
