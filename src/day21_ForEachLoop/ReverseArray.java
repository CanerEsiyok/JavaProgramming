package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] num={10,20,30,40,50,60};
        int[] rev=new int[num.length];
        int j=num.length-1;
        for (int i=0; i< num.length;i++) {
            rev[i]=num[j];
            j--;
        }
        System.out.println(Arrays.toString(rev));
    }
}
