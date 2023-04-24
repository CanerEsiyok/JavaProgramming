package day21_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingOrderTask1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int len=sc.nextInt();
        int[] list=new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Enter a number:");
            list[i]=sc.nextInt();
        }
        Arrays.sort(list);
        int a=0;
        int[] reverse=new int[len];
        for (int i = list.length - 1; i >= 0; i--) {
            reverse[a++]=list[i];
        }
        System.out.println(Arrays.toString(reverse));
    }
}
