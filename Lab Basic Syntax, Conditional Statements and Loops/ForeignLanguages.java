import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         String country=scan.nextLine();

         switch (country){
             case "England":
             case "USA":
                 System.out.printf("English"); break;
             case "Spain":
             case "Argentina":
             case "Mexico":
                 System.out.printf("Spanish");break;
             default:
                 System.out.printf("unknown");
         }
    }
}
