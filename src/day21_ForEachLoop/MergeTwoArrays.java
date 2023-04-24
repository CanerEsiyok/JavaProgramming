package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1={10,20,30,40};
        int[] arr2={50,60};
        int[] merge=new int[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merge[i]=arr1[i];
        }
        int a=0;
        for (int i = arr1.length; i < arr1.length+arr2.length ; i++) {
            merge[i]=arr2[a++];

        }
        System.out.println(Arrays.toString(merge));
        System.out.println("---------------------------------");
        char[] ch1={'A','B','C'};
        char[] ch2={'D','E','F','G','H'};
        char[] ch3=new char[ch1.length+ch2.length];

        int i=0;
        for (char c : ch1) {
            ch3[i++]=c;
        }
        for (char c : ch2) {
            ch3[i++]=c;
        }
        System.out.println(Arrays.toString(ch3));

    }
}
