package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterfaces2 {
    public static void main(String[] args) {


        BiPredicate<int[], Integer> contains = (a, b) -> {
            boolean result = false;
            for (int i : a) {
                if (i == b) {
                    result = true;
                    break;
                }
            }
            return result;
        };
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean r1 = contains.test(arr, 7);
        System.out.println(r1);

    //create a program that checks if two strings are anagram
    BiPredicate<String,String> isAnagram=(str1,str2)->{
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.equals(arr2))
            return true;
        else return false;
    };
        System.out.println("---------------------------------------------");
    //create a function that can print the given string for given amount of times
        BiConsumer<String,Integer> repeat=(a,n)->{
            for (Integer i = 0; i < n; i++) {
                System.out.println(a);
            }

        };

        repeat.accept("Wooden Spoon",5);

        //create a function that takes first name and last name prints the formatted name
        BiConsumer<String,String> namePrint=(a,b)->{
            a=a.toUpperCase().substring(0,1)+a.toLowerCase().substring(1);
            b=b.toUpperCase().substring(0,1)+b.toLowerCase().substring(1);
            System.out.println(a+" "+b);
        };
        System.out.println("---------------------------------------------");
        namePrint.accept("cAnER","esIYOk");
        System.out.println("---------------------------------------------");

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");

        scrumTeam1.forEach((k,v)-> System.out.println(k+":"+v));

        System.out.println("---------------------------------------------");
        //create a function that takes two integers and return the max
        BiFunction<Integer,Integer,Integer> maxNumber=(a,b)->{
            if(a>b)
                return a;
            else return b;
        };
        int max=maxNumber.apply(100,200);
        System.out.println(max);
        System.out.println("---------------------------------------------");
        //create a function that can take  two int arrays and merge them into a list
        BiFunction<int[],int[], List<Integer>> mergeIntoList=(arr1,arr2)->{
            ArrayList<Integer> result = new ArrayList<>();
            for (int i : arr1) result.add(i);
            for (int i : arr2) result.add(i);
            return result;
        };
        int[] a={1,2,3,4,5};
        int[]b={6,7,8};
        List<Integer> merge=mergeIntoList.apply(a,b);
        System.out.println(merge);
        System.out.println("---------------------------------------------");

        //  create a function that takes a list of String and a list of Integer and merge into a map
        BiFunction<List<String>,List<Integer>,Map<String,Integer>> mapBiFunction=(s,integers)->{
            LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
            for (int i = 0; i < s.size(); i++) result.put(s.get(i),integers.get(i));
            return result;
        };
        List<String> names=new ArrayList<>(Arrays.asList("Cedric","Bakambu","Zizou"));
        List<Integer> scores=new ArrayList<>(Arrays.asList(70,80,40));
        Map<String,Integer> map=mapBiFunction.apply(names,scores);
        System.out.println(map);
    }
}