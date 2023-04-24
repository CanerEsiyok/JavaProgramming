package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReplaceAll {
    public static int[] replaceAll(int[] list,int oldElement,int newElement) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == oldElement)
                list[i] = newElement;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr={10,10,20,30,40,30,30,30,30};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(replaceAll(arr,30,5)));
    }
}
