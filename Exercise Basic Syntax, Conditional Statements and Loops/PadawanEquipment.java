import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        double amountOfMoney=Double.parseDouble(scan.nextLine());
        int cntOfStudents=Integer.parseInt(scan.nextLine());
        double lightSabers=Double.parseDouble(scan.nextLine());
        double robes=Double.parseDouble(scan.nextLine());
        double belts=Double.parseDouble(scan.nextLine());

        double lightSabersPrice=lightSabers*(Math.ceil(cntOfStudents+0.1*cntOfStudents));
        double robesPrice=robes*cntOfStudents;
        double beltsPrice=(cntOfStudents-cntOfStudents/6)*belts;

        double totalSum=lightSabersPrice+robesPrice+beltsPrice;

        if(totalSum<=amountOfMoney){
            System.out.printf("The money is enough - it would cost %.2flv.",totalSum);
        }else{
            System.out.printf("George Lucas will need %.2flv more.",totalSum-amountOfMoney);
        }
    }
}
