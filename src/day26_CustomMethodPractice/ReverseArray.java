package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverse(int[] list){
        int[] result={};
        for (int i = list.length - 1; i >= 0; i--) {
            result= ArraysUtility.addElement(result,list[i]);
        }
        return result;
    }


}
