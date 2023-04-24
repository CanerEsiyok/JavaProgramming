package day51_Map;

import java.util.*;

public class MapPractice4 {
    public static void main(String[] args) {

        ArrayList<String> group1 = new ArrayList<>(Arrays.asList( "Duygu","Magda","Farangez","Edison","Kerem","Farangis" ));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList( "Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat" ));
        ArrayList<String> group9 = new ArrayList<>(Arrays.asList( "Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem" ));
        ArrayList<String> group24 = new ArrayList<>(Arrays.asList( "Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas" ));
        ArrayList<String> group5 = new ArrayList<>(Arrays.asList("Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene" ));


        Map<Integer,List<String>> map=new TreeMap<>();
        map.put(1,group1);
        map.put(2,group2);
        map.put(9,group9);
        map.put(24,group24);
        map.put(5,group5);

        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            if(entry.getKey()==9)
                System.out.println(entry.getValue());
        }
        System.out.println("------------------------------");
        for (String s : map.get(24)) {
            System.out.println(s);
        }
        System.out.println("------------------------------");
        System.out.println(map.get(2).get(1));

        System.out.println("------------------------------");

        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            for (String s : entry.getValue()) {
                System.out.println(s);
            }
        }


    }
}
