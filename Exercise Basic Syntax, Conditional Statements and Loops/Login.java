import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

       String username=scan.nextLine();
       String password="";
       char ch;
       for(int i=0;i<username.length();i++){
           ch=username.charAt(i);
           password=ch+password;
       }
       int cnt=1;
        String tryPassword=scan.nextLine();
       while(!password.equals(tryPassword)){
           System.out.printf("Incorrect password. Try again.%n");
           tryPassword=scan.nextLine();
           cnt++;
           if(cnt==4){
               break;
           }
       }
        if (password.equals(tryPassword)) {
            System.out.printf("User %s logged in.",username);
        }else if(cnt==4){
            System.out.printf("User %s blocked!",username);
        }

    }
}
