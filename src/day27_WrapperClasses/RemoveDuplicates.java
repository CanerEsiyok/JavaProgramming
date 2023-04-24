package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] list){
        int[] result={};
        for (int i : list) {
            if(!ArraysUtility.contains(result,i))
                result=ArraysUtility.addElement(result,i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a={1,1,2,2,3,3};
        System.out.println(Arrays.toString(removeDuplicates(a)));

        char[] ch={'a','a','b','b','d','c','c'};
        System.out.println(Arrays.toString(ArraysUtility.removeDuplicates(ch)));
        double[] d={1.5,1.5,3.3,4};
        System.out.println(Arrays.toString(ArraysUtility.removeDuplicates(d)));
        String[] str={"aa","gg","gg","rr","aa"};
        System.out.println(Arrays.toString(ArraysUtility.removeDuplicates(str)));
    }
}
