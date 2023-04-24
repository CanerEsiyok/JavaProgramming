package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Replace {
    public static int[] replace(int[] list,int index,int newElement){
        list[index]=newElement;
        return list;
}

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println(Arrays.toString(replace(a,2,55)));

        String[] names={"a0","fa","fa","gg"};
        System.out.println(Arrays.toString(ArraysUtility.replace(names,1,"ww")));

    }
}
