package lists;

import java.util.*;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        //Now we will implement more complicated list commands. Again, read a list, and until you receive "end" read commands:
        //Contains {number}
        //Print even
        //Print odd
        //Get sum
        //Filter {condition} {number}

        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scan.nextLine();

        while (!command.contains("end")) {
            if (command.contains("Contains")) {
                int number = Integer.parseInt(command.split("\\s+")[1]);
                boolean flag=false;
                for(int i=0;i<numbers.size();i++){
                    if(number==numbers.get(i)){
                        flag=true;
                    }
                }
                if(flag==true){
                    System.out.printf("Yes%n");
                }else {
                    System.out.printf("No such number%n");
                }
            } else if (command.contains("Print even")) {
                for(int i=0;i<numbers.size();i++){
                    int even=numbers.get(i);
                    if(even%2==0){
                        System.out.print(even + " ");
                    }
                }
                System.out.println();
            } else if (command.contains("Print odd")) {
                for(int i=0;i<numbers.size();i++){
                    int odd=numbers.get(i);
                    if(odd%2!=0){
                        System.out.print(odd + " ");
                    }
                }
                System.out.println();
            } else if (command.contains("Get sum")) {
                int sum=0;
                for(int i=0;i<numbers.size();i++){
                    int num=numbers.get(i);
                   sum+=num;
                }
                System.out.println(sum);

            } else if (command.contains("Filter")) {
                String condition=command.split("\\s+")[1];
                int num=Integer.parseInt(command.split("\\s+")[2]);

                if(condition.contains("<=")){
                    for(int i=0;i<numbers.size();i++){
                        if(numbers.get(i)<=num){
                            System.out.print(numbers.get(i)+" ");
                        }
                    }
                    System.out.println();

                }else if(condition.contains(">=")){
                    for(int i=0;i<numbers.size();i++){
                        if(numbers.get(i)>=num){
                            System.out.print(numbers.get(i)+" ");
                        }
                    }
                    System.out.println();

                }else if(condition.contains("<")){
                    for(int i=0;i<numbers.size();i++){
                        if(numbers.get(i)<num){
                            System.out.print(numbers.get(i)+" ");
                        }
                    }
                    System.out.println();

                }else if(condition.contains(">")){
                    for(int i=0;i<numbers.size();i++){
                        if(numbers.get(i)>num){
                            System.out.print(numbers.get(i)+" ");
                        }
                    }
                    System.out.println();

                }

            }

            command = scan.nextLine();
        }

    }
}
