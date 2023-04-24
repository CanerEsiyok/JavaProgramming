package day20_Arrays;

import java.util.Arrays;

public class MoveZeroTask6 {
    public static void main(String[] args) {
        int[] array = {10, 0, 5, 0, 1, 0};
        int[] sans=new int[array.length];
        int a=0;
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=0){
                sans[a]=array[i];
                a++;
                count++;
            }
        }
        for (int i = array.length-1; i > array.length-count ; i--) {
            sans[i]=0;
        }
        System.out.println(Arrays.toString(sans));

    }
}


