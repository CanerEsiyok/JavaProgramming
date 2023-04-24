package day53_FunctionalInterface.tasks;

import java.util.*;
import java.util.function.Function;

public class PracticeTasks {
    public static void main(String[] args) {
        Function<List<Integer>,Integer> function=n->{
            return Collections.max(n);
        };
        List<Integer> list=new ArrayList<>(Arrays.asList(4,7,52,60,-1,47));
        System.out.println(function.apply(list));

    //1.3 Create a function that can return the longest String from a List of String
       Function<List<String>,String> function1= n->{
           int maxSize=0;
           String longest="";
           for (String s : n) {
               if (s.length() > maxSize) {
                   maxSize = s.length();
                   longest=s;
               }
           }
           return longest;
       };

       List<String> names=new ArrayList<>(Arrays.asList("Caner","Emine","Mustafa","Fatma","Ece"));
        System.out.println(function1.apply(names));
        //1.5 Create a function that can convert List of integer to int array
        Function<List<Integer>,int[]> convertToArray=n->{
            int[] result = new int[n.size()];
            for (int i = 0; i < n.size(); i++) {
                result[i]=n.get(i);
            }
            return result;
        };

        System.out.println(Arrays.toString(convertToArray.apply(list)));
        //4.2 Create a function that can convert a Set of Integers to List of Integers
        Function<Set<Integer>,List<Integer>> convertToListOfIntegers= set->{
            List<Integer> list1 = new ArrayList<>(set);
            return list1;
        };
       


    }



}
