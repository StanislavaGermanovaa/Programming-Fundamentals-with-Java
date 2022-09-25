import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String townName=scan.nextLine();
        int population=Integer.parseInt(scan.nextLine());
        short area=Short.parseShort(scan.nextLine());

        String result=String.format("Town %s has population of %d and area %d square km."
        ,townName,population,area);
        System.out.println(result);

    }
}
