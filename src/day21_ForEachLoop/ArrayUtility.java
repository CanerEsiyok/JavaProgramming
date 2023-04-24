package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        System.out.println(Arrays.toString(num));
        System.out.println(num[3]);
        System.out.println("-------------------------------------");

        int[] scores={45,71,23,4,96};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        String[] a={"ANNA", "Anna"};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("-------------------------------------");

        int[] arr1={1,3,2};
        int[] arr2={1,2,3};
        boolean r=Arrays.equals(arr1,arr2);
        System.out.println(r);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        r=Arrays.equals(arr1,arr2);
        System.out.println(r);
        System.out.println("-------------------------------------");

        char[] ch1={'a','b','c'};
        char[] ch2={'b','a','c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean anagram=Arrays.equals(ch1,ch2);
        System.out.println("anagram: "+anagram);


    }
}
