package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        //Read a number n and n lines of products. Print a numbered list of all the products ordered by name

        Scanner scan=new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        List<String> productList=new ArrayList<>();
        for(int i=0;i<n;i++){
            String product=scan.nextLine();

            productList.add(product);
        }

        Collections.sort(productList);

        for(int i=0;i<productList.size();i++){
            System.out.println(i+1+"."+productList.get(i));
        }
    }
}
