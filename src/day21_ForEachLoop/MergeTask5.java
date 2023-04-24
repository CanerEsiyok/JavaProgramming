package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTask5 {
    public static void main(String[] args) {
        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};
        int[] merge = new int[arr1.length + arr2.length + arr3.length];
        int a = 0;
        for (int i : arr1) {
            merge[a++] = i;
        }
        for (int i : arr2) {
            merge[a++] = i;
        }
        for (int i : arr3) {
            merge[a++] = i;
        }
        System.out.println(Arrays.toString(merge));
    }
}
