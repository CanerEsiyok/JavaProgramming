package day22_MultiDimedsilonalArrays;

import java.util.Arrays;

public class Task1ReverseArray {
    public static void main(String[] args) {
        int[][] array = { {1,2,3}, {4,5,6}};
        int[][] reverse=new int[array.length][array[0].length];
        int i= array.length-1;
       // int j=2;
        for (int[] ints : array) {
            int j=array[0].length-1;
            for (int anInt : ints) {
                reverse[i][j--]=anInt;
            }
            i--;
        }

        System.out.println(Arrays.deepToString(reverse));
    }
}
