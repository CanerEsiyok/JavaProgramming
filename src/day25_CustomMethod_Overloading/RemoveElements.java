package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class RemoveElements {
    public static int[] removeElements(int[] list,int index){
        int[] result=new int[list.length-1];
        for (int i = 0; i <index ; i++) {
            result[i]=list[i];
        }
        for (int i = index; i < list.length-1 ; i++) {
            result[i]=list[i+1];
        }
        return result;
    }


}
