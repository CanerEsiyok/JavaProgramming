package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Insert {
    public static int[] insert(int[] list,int index,int element){
        int[] result= {};
        for (int i = 0; i < list.length; i++) {
            if(i==index)
                result= ArraysUtility.addElement(result,element);
            result=ArraysUtility.addElement(result,list[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        System.out.println(Arrays.toString(insert(a,2,100)));
    }
}
