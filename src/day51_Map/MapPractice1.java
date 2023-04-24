package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {
        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        //  1. Update the "M" to Male and "F" to Female
      /*  for (String s : employeeMap.keySet()) {
            if(employeeMap.get(s).equals("M"))
                employeeMap.put(s,"Male");
            else
                employeeMap.replace(s,"Female");
        }*/
        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if(entry.getValue().equalsIgnoreCase("m"))
                entry.setValue("Male");
            else
                entry.setValue("Female");


        }


        System.out.println(employeeMap);

        System.out.println("--------------------------------------------------------");
        //display the names of female employees

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if(entry.getValue().equalsIgnoreCase("female"))
                System.out.println(entry.getKey());
        }
    }
}
