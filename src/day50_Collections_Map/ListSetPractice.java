package day50_Collections_Map;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        System.out.println(set);
        //  Integer[] array = set.toArray(new Integer[0]);
       List<Integer>list =new ArrayList<>(set);
        System.out.println(list);

        List<String>names=new LinkedList<>();
        names.addAll(Arrays.asList("James","Jimmy","Kate"));
        ((LinkedList<String>) names).poll();
        System.out.println(names);
    }
}
