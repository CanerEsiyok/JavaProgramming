package day27_WrapperClasses;

import java.util.Arrays;

public class Swap {
    public static int[] swap(int[] list,int i,int j){
        int tem=list[i];
        list[i]=list[j];
        list[j]=tem;
        return list;
    }

    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        System.out.println(Arrays.toString(swap(a,2, 4)));
    }

}
