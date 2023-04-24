package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        int maxSalary=Integer.MIN_VALUE;
        int minSalary=Integer.MAX_VALUE;
        String max="";
        String min="";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()>maxSalary) {
                maxSalary = entry.getValue();
                max=entry.getKey();
            }
            if(entry.getValue()<minSalary){
                minSalary= entry.getValue();
                min= entry.getKey();
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        int count=0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()>=120000 && entry.getValue()<=150000)
                count++;
        }
        System.out.println(count);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if(entry.getValue()<118000)
                    System.out.println(entry.getKey());
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()<120000)
                map.replace(entry.getKey(), entry.getValue()+10000);
        }
        System.out.println(map);


        /*
1. Given the following map that contains the employee name and thier salary:
     Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);
    1.1 who has the maximum salary?
    1.2 who has the minimum salary?
    1.3 how many employees has the salary between 120k ~ 150K?
    1.4 display the names of the employees who are making less than 118k?
    1.5 increase the salary of each employee by 10K
 */
    }
}
