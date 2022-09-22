import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int firstHours=Integer.parseInt(scan.nextLine());
        int firstMin=Integer.parseInt(scan.nextLine());

        int allMinutes=(firstHours*60)+firstMin + 30;
        int hour=allMinutes/60;
        int min=allMinutes%60;
        if(hour>23){
            hour=0;
        }
        System.out.printf("%d:%02d",hour,min);
    }
}
