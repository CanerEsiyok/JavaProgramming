package day51_Map;

import java.util.*;

public class MapIteration {
    public static void main(String[] args) {
        Map<String,Integer> students=new HashMap<>();
        students.put("Aygun",95);
        students.put("Maria",80);
        students.put("Ali",85);
        students.put("Ozan",80);
        students.put("Alex",75);
        students.put("Serkan",70);
        students.put("Andriy",98);

        System.out.println(students);

    /*    Set<String> keys = students.keySet();
        for (String key : keys) {
            students.replace(key,students.get(key+5));
            //System.out.println(students.get(key));
            //System.out.println(key);
        }*/
        for (String s : students.keySet()) {
            if(students.get(s)<90)
                System.out.println(s);
        }
        Map<String,Integer> earlyBirds=new HashMap<>();
        Map<String,Integer> angryBirds=new HashMap<>();

        for (String s : students.keySet()) {
            if(students.get(s)>=90)
                earlyBirds.put(s,students.get(s));
        }
        for (String s : students.keySet()) {
            if(students.get(s)<90)
                angryBirds.put(s,students.get(s));
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

        System.out.println("---------------------------------------");
        Collection<Integer> values = students.values();
        System.out.println("values = " + values);
        List<Integer>list=new ArrayList<>(values);
        System.out.println("list = " + list);

        for (Integer value : students.values()) {
            System.out.println(value);
        }
        System.out.println("---------------------------------------");

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (Integer value : students.values()) {
            if(value<min)
                min=value;
            if(value>max)
                max=value;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

       /* Collection<Integer> vals = students.values();
        min = Collections.min(vals);
        max=Collections.max(vals);
        System.out.println("max = " + max);
        System.out.println("min = " + min);*/
        System.out.println("---------------------------------------");
        int count=0;
      /*  for (Integer value : students.values()) {
            if(value>=95)
                count++;
        }*/

        for (String s : students.keySet()) {
            if(students.get(s)>=95)
                count++;
        }

        System.out.println("count = " + count);

        System.out.println("---------------------------------------");

        Set<Map.Entry<String, Integer>> entries = students.entrySet();
        for (Map.Entry<String, Integer> stringIntegerEntry : students.entrySet()) {
           // System.out.println(stringIntegerEntry);
           // System.out.println(stringIntegerEntry.getKey());
            System.out.println(stringIntegerEntry.getValue());
        }


    }
}
