import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        //Calculate how many courses will be needed to elevate n
        // persons by using an elevator with a capacity of p persons.
        // The input holds two lines: the number of people n and the capacity p of the elevator.
        Scanner scan=new Scanner(System.in);

        int people=Integer.parseInt(scan.nextLine());
        int capacity=Integer.parseInt(scan.nextLine());

        if(people<capacity){
            System.out.println(1);
        }else{
            int courses=(int) Math.ceil((double) people/capacity);
            System.out.println(courses);
        }

    }
}
