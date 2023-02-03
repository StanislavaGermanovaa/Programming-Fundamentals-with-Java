package ExerciseAssociativeArrays;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String inputLine=scan.nextLine();
        Map<String,List<String>> companyUsers=new LinkedHashMap<>();

        while (!inputLine.equals("End")){
            String company=inputLine.split("\\s+\\->\\s+")[0];
            String id=inputLine.split("\\s+\\->\\s+")[1];

            if(companyUsers.containsKey(company)){
                List<String> employees=companyUsers.get(company);
                if(!employees.contains(id)){
                    employees.add(id);
                }
            }else{
               List<String> employees=new ArrayList<>();
               employees.add(id);
               companyUsers.put(company,employees);
            }

            inputLine=scan.nextLine();
        }

        companyUsers.entrySet().stream()
                .forEach(company -> {
                    System.out.println(company.getKey());
                    company.getValue().forEach(employee -> System.out.println("-- " + employee));
                });
    }
}
