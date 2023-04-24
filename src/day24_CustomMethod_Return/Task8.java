package day24_CustomMethod_Return;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static int[] reverse(int[] list){
        int[] reverse=new int[list.length];
        int a=0;
        for (int i = list.length - 1; i >= 0; i--) {
            reverse[i]=list[a++];
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The length:");
        int l= sc.nextInt();
        int[] list=new int[l];
        for (int i = 0; i < l; i++) {
            System.out.println("The numbers:");
            list[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(reverse(list)));

    }
}
