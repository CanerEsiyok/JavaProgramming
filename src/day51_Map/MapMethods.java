package day51_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {
        Map<String,Integer>students=new HashMap<>();
        students.put("Aygun",85);
        students.put("Maria",86);
        students.put("Ali",95);
        students.put("Ozan",98);
        students.put("Alex",96);
        students.put("Serkan",97);
        students.put("Andriy",98);


        System.out.println("students = " + students);
        System.out.println("students.size() = " + students.size());
        System.out.println("students.get(\"Alex\") = " + students.get("Alex"));
        students.replace("Ali",90);
        System.out.println("students = " + students);
        students.remove("Alex");
        System.out.println("students.size() = " + students.size());

        boolean r1=students.containsKey("Muhtar");
        System.out.println("r1 = " + r1);
        boolean r2=students.containsKey("Andriy");
        System.out.println("r2 = " + r2);

        boolean r3=students.containsValue(100);
        System.out.println("r3 = " + r3);
        boolean r4=students.containsValue(97);
        System.out.println("r4 = " + r4);

        Map<String,Integer> map1=new HashMap<>();
        map1.putAll(students);
        Map<String,Integer> map2=new HashMap<>();
        map2.putAll(students);
        boolean r5=map1.equals(map2);
        System.out.println("r5 = " + r5);
        System.out.println(map1==map2);


    }
}
