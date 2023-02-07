package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String town;

        Student() {
            this.firstName = null;
            this.lastName = null;
            this.age = 0;
            this.town = null;
        }

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

        public void setFirstName(String firstName){
            this.firstName=firstName;
        }
        public void setLastName(String lastName){
            this.lastName=lastName;
        }
        public void setAge(int age){
            this.age=age;
        }
        public void setTown(String town){
            this.town=town;
        }

        public String toString() {
            return String.format("%s %s is %d years old%n",
                    this.getFirstName(),
                    this.getLastName(),
                    this.getAge());
        }
    }
    public static void main(String[] args) {
//If you receive a student who already exists (first name and last name should be unique), overwrite the information.
        Scanner scan=new Scanner(System.in);

        List<Student> listStudents = new ArrayList<>();
        String inputLine = scan.nextLine();

        while (!inputLine.equals("end")) {
            String[] arrStudentsData = inputLine.split("\\s+");
            String firstName=arrStudentsData[0];
            String lastName=arrStudentsData[1];
            int age=Integer.parseInt(arrStudentsData[2]);
            String town=arrStudentsData[3];

            Student student = new Student(firstName, lastName, age, town);

            int existingIndex = findStudentsIndex(listStudents, student.getFirstName(), student.getLastName());

            if (existingIndex != -1) {
                listStudents.get(existingIndex).setAge(student.getAge());
                listStudents.get(existingIndex).setTown(student.getTown());
            } else {
                listStudents.add(student);
            }

            inputLine = scan.nextLine();
        }

        String searchTown = scan.nextLine();

        for (Student s : listStudents) {
            if (s.getTown().equals(searchTown)) {
                System.out.print(s);
            }
        }
    }

    static public int findStudentsIndex(List<Student> studentsList, String firstName, String  lastName) {
        for (int i = 0; i < studentsList.size(); i++) {
            String firstNameList = studentsList.get(i).getFirstName();
            String lastNameList = studentsList.get(i).getLastName();

            if (firstNameList.equals(firstName) && lastNameList.equals(lastName)) {
                return i;
            }
        }

        return -1;
    }
}
