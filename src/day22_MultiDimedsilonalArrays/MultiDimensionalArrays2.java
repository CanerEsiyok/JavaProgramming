package day22_MultiDimedsilonalArrays;

import java.util.Arrays;

public class MultiDimensionalArrays2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        int[] arr3={7,8,9};
        int[][] arr2D={arr1,arr2,arr3};
        System.out.println(Arrays.deepToString(arr2D));

        int[][][] arr3D={{{1,2,3},{4,5}},{{6,7},{8,9}}};
        System.out.println(Arrays.deepToString(arr3D));

        for (int[][] ints : arr3D) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            //System.out.println();
        }
    }
}
