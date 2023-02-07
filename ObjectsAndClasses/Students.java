package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class Students {

    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String town;

        public Student(String firstName, String lastName, int age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }

        public String getTown() {
            return this.town;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Read the list of students until you receive the "end" command. After that, you will receive a city name.
        //Print only students which are from the given city, in the following format: "{firstName} {lastName} is {age} years old".

        List<Student> listStudents = new ArrayList<>();
        String inputLine = scan.nextLine();

        while (!inputLine.equals("end")) {
            String[] arrStudentsData = inputLine.split("\\s+");
            String firstName=arrStudentsData[0];
            String lastName=arrStudentsData[1];
            int age=Integer.parseInt(arrStudentsData[2]);
            String town=arrStudentsData[3];

            Student currentStudent=new Student(firstName,lastName,age,town);
            listStudents.add(currentStudent);

            inputLine = scan.nextLine();
        }

        String homeTown=scan.nextLine();

        for(Student item : listStudents){
            if(item.getTown().equals(homeTown)){
                System.out.printf("%s %s is %d years old%n",item.getFirstName(),item.getLastName(),item.getAge());
            }
        }

    }
}
