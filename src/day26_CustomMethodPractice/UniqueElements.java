package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static int[] uniqueElements(int[] list){
        int[] result=new int[0];
        for (int i : list) {
            int count= ArraysUtility.frequencyOfElement(list,i);
            if(count==1)
               result= ArraysUtility.addElement(result,i);
        }
        return result;
    }


}
