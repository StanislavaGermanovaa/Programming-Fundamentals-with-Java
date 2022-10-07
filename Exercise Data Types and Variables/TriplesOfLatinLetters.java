import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        //Write a program to read an integer n and
        // print all triples of the first n small Latin letters, ordered alphabetically:
        Scanner scan=new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    char firstChar=(char) ('a'+i);
                    char secondChar=(char) ('a'+j);
                    char thirdChar=(char)('a'+k);
                    System.out.printf("%c%c%c",firstChar,secondChar,thirdChar);
                    System.out.println();
                }
            }
        }

    }
}
