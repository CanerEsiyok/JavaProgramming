package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays {
    public static int[] merge(int[] x,int[] y){
        int[] result={};
        for (int i : x) {
            result=ArraysUtility.addElement(result,i);
        }
        for (int i : y) {
            result=ArraysUtility.addElement(result,i);
        }
        return result;

    }

    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6};
        int[] result=merge(a,b);
        System.out.println(Arrays.toString(result));
        String[] nam={"aa","bb"};
        String[] bam={"cc","dd"};

    }
}
