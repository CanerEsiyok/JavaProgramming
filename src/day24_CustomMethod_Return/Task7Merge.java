package day24_CustomMethod_Return;

import java.util.Arrays;
import java.util.Scanner;

public class Task7Merge {
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] merge = new int[arr1.length + arr2.length];
        int a = 0;
        for (int i : arr1) {
            merge[a++] = i;
        }
        for (int i : arr2) {
            merge[a++] = i;
        }
        return merge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the lenght of the first array:");
        int l = sc.nextInt();
        int[] arr1 = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.println("the number:");
            arr1[i] = sc.nextInt();
        }
        System.out.println("the lenght of the second array:");
        int l2 = sc.nextInt();
        int[] arr2 = new int[l];
        for (int i = 0; i < l2; i++) {
            System.out.println("the number:");
            arr2[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(merge(arr1,arr2)));
    }
}
