package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {


        int[] nums = {10, 20, 30, 3, 5};
        ArraysUtility.printEachElement(nums);
        System.out.println("---------------------------");
        double[] arr={1.5,20,5.3,5};
        ArraysUtility.printEachElement(arr);
        System.out.println("********************");
        char[] ch={'a','b','c'};
        ArraysUtility.printEachElement(ch);
        System.out.println("*********************");
        String[] names={"aaa","bbbb","cccc"};
        ArraysUtility.printEachElement(names);
        System.out.println("*****************");
        System.out.println(ArraysUtility.max(nums));
        System.out.println(ArraysUtility.max(arr));
        System.out.println(ArraysUtility.min(nums));
        System.out.println(ArraysUtility.contains(nums,7));
        System.out.println(ArraysUtility.contains(arr,5.4));
        System.out.println(ArraysUtility.contains(ch,'a'));
        System.out.println(ArraysUtility.contains(names,"aaa"));
    }
}
